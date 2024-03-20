package com.example.muk_able.api.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;

@Slf4j
@RequiredArgsConstructor
public class BaseFilter extends GenericFilterBean {

    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String BEARER_PREFIX = "Bearer ";
    private String requestKey="f9403fc5f537b4ab332d";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String token = resolveToken((HttpServletRequest) request);
        if (token != null && !token.isEmpty()) {
            String[] tokens = token.split("%");
            if (tokens.length == 3 && ((HttpServletRequest) request).getHeader("User-Agent").equals(tokens[0])
                    && (System.currentTimeMillis() - Long.valueOf(tokens[1])) < 600000
                    && tokens[2].equals(requestKey)) {
                SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(null,"",null));
            }
        }
        chain.doFilter(request, response);
    }

    private String resolveToken(HttpServletRequest request) {
        String bearerToken = request.getHeader(AUTHORIZATION_HEADER);
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith(BEARER_PREFIX)) {
            return convBase64(bearerToken.substring(7));
        }
        return null;
    }

    private String convBase64(String baseData) {
        int nCnt = baseData.length() - baseData.replaceAll("=","").length();
        String transData = baseData.substring(baseData.replaceAll("=","").length(), baseData.length()) + baseData.substring(nCnt, baseData.length() - nCnt) + baseData.substring(0, nCnt);
        return (URLDecoder.decode(new String(Base64.decodeBase64((new StringBuffer(transData).reverse().toString()).getBytes())), StandardCharsets.UTF_8));

    }
}
