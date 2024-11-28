package com.api.phonevalidation.services;


import com.api.phonevalidation.mapper.PhoneNumberValidationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PhoneNumberValidationService {

    @Autowired
    private PhoneNumberValidationMapper phoneNumberValidationMapper;



    public String validatePhoneNumberAndId(String phoneNumber, String id) {


        try {
            // Check if phone number and ID exist in the CBS database
            Integer count = phoneNumberValidationMapper.countByPhoneNumberAndId(phoneNumber, id);

            if (count != null && count > 0) {
                return "Phone number and ID are already present in the database.";
            } else {
                return "Phone number or ID not found in database.";
            }
        } catch (Exception e) {

            return "An error occurred during validation.";
        }
    }
}

