package com.api.phonevalidation.controller;

import com.api.phonevalidation.model.PhoneValidationRequestDTO;
import com.api.phonevalidation.model.PhoneValidationResponseDTO;
import com.api.phonevalidation.services.PhoneValidationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/phone-validation")
    public class PhoneValidationController {

        private final PhoneValidationService phoneValidationService;

        public PhoneValidationController(PhoneValidationService phoneValidationService) {
            this.phoneValidationService = phoneValidationService;
        }

        @PostMapping
        public PhoneValidationResponseDTO validatePhone(@RequestBody PhoneValidationRequestDTO requestDTO) {
            return phoneValidationService.validatePhone(requestDTO);
        }
    }

