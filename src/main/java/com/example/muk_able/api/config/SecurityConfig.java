//package com.example.muk_able.api.config;
//
//import com.example.muk_able.api.security.BaseAccessDeniedHandler;
//import com.example.muk_able.api.security.BaseAuthenticationEntryPoint;
//import com.example.muk_able.api.security.BaseFilter;
//import java.util.Arrays;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//@Configuration
//@EnableWebSecurity
//@RequiredArgsConstructor
//public class SecurityConfig {
//
//    private final BaseAccessDeniedHandler baseAccessDeniedHandler;
//    private final BaseAuthenticationEntryPoint baseAuthenticationEntryPoint;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
////                .csrf(AbstractHttpConfigurer::disable)
//                .cors(cors -> corsConfigurationSource())     //로컬 확인용 cors 설정. 배포시엔 삭제 처리
//                .addFilterBefore(new BaseFilter(), UsernamePasswordAuthenticationFilter.class)
////                .authorizeHttpRequests((authz) -> authz
////                        .requestMatchers(
////                                new AntPathRequestMatcher("/web/docs")
////                                , new AntPathRequestMatcher("/swagger-resources/**")
////                                , new AntPathRequestMatcher("/**/swagger-*/**")
////                                , new AntPathRequestMatcher("/**")
////                        ).permitAll()
////                        .anyRequest().authenticated()
////                )
//                .exceptionHandling((exceptionConfig) -> exceptionConfig.authenticationEntryPoint(baseAuthenticationEntryPoint).accessDeniedHandler(baseAccessDeniedHandler));
//        return http.build();
//
//    }
//
//    //로컬 확인용 cors 설정. 배포시엔 삭제 처리
//    @Bean
//    CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowCredentials(true);
//        configuration.setAllowedMethods(Arrays.asList("GET", "POST"));
//        configuration.setAllowedHeaders(Arrays.asList("*"));
//        configuration.setExposedHeaders(Arrays.asList("*"));
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }
//}
