package com.example.muk_table.core.service.owner;

import com.example.muk_table.core.dto.request.owner.OwnerRequest;
import com.example.muk_table.domain.primary.owner.model.entity.Owner;
import com.example.muk_table.domain.primary.owner.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public Long saveOwner(OwnerRequest ownerRequest) {
        return ownerRepository.save(Owner.builder()
                        .ownerLoginId(ownerRequest.getOwnerLoginId())
                        .ownerPassword(ownerRequest.getOwnerPassword())
                        .build())
                .getId();
    }


}
