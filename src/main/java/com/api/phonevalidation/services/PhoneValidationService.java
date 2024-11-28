package com.api.phonevalidation.services;

import com.api.phonevalidation.mapper.PhoneValidationMapper;
import com.api.phonevalidation.model.ExternalPhoneValidationResponse;
import com.api.phonevalidation.model.PhoneValidationRequestDTO;
import com.api.phonevalidation.model.PhoneValidationResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PhoneValidationService {

    @Value("${phone.validation.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;
    private final PhoneValidationMapper mapper;

    public PhoneValidationService(RestTemplate restTemplate, PhoneValidationMapper mapper) {
        this.restTemplate = restTemplate;
        this.mapper = mapper;
    }

    public PhoneValidationResponseDTO validatePhone(PhoneValidationRequestDTO requestDTO) {
        // Construct the external API URL using the request parameters
        String url = apiUrl + "?ktp=" + requestDTO.getKtp() + "&phoneNumber=" + requestDTO.getPhoneNumber();

        // Call the external API and get the response as ExternalPhoneValidationResponse
        ExternalPhoneValidationResponse externalResponse = restTemplate.getForObject(url, ExternalPhoneValidationResponse.class);

        // Use the mapper to convert the external response into PhoneValidationResponseDTO
        return PhoneValidationMapper.toPhoneValidationResponseDTO(externalResponse);
    }
}
