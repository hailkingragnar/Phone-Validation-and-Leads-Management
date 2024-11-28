package com.api.phonevalidation.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
public class PhoneValidationResponseDTO {



    private String status;
    private String message;
    private boolean isFound;
    private String foundIn;
    private String ktpIcons;
    private String ktpCardLink;
    private boolean isMatch;
    private String matchIn;
    private List<String> hpNumberIcons;
    private List<String> hpNumberCardLink;

}
