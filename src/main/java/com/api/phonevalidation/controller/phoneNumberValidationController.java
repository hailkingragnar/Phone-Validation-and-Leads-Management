package com.api.phonevalidation.controller;




import com.api.phonevalidation.services.PhoneNumberValidationService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class phoneNumberValidationController {
	

	    @Autowired
	    private PhoneNumberValidationService phoneNumberValidationService;



	    
	    @PostMapping(path = "/validatePhoneNumber",produces = "application/json")
	    public String validatePhoneNumberAndId(@RequestBody PhoneNumberValidationRequest validationRequest, HttpServletRequest request) {
	        return phoneNumberValidationService.validatePhoneNumberAndId(validationRequest.getPhoneNumber(), validationRequest.getId());
	    }
	}


