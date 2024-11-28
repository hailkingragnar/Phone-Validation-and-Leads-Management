package com.api.phonevalidation.mapper;

import com.api.phonevalidation.model.ExternalPhoneValidationResponse;
import com.api.phonevalidation.model.PhoneValidationResponseDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PhoneValidationMapper {

    public static PhoneValidationResponseDTO toPhoneValidationResponseDTO(ExternalPhoneValidationResponse externalResponse) {
        PhoneValidationResponseDTO dto = new PhoneValidationResponseDTO();
        dto.setStatus(externalResponse.getStatus());
        dto.setMessage(externalResponse.getMessage());
        dto.setFound(externalResponse.isFound());
        dto.setFoundIn(externalResponse.getFoundIn());
        dto.setKtpIcons(externalResponse.getKtpIcons());
        dto.setKtpCardLink(externalResponse.getKtpCardLink());
        dto.setMatch(externalResponse.isMatch());
        dto.setMatchIn(externalResponse.getMatchIn());
        dto.setHpNumberIcons(externalResponse.getHpNumberIcons());
        dto.setHpNumberCardLink(externalResponse.getHpNumberCardLink());
        return dto;
    }
}

