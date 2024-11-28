package com.api.phonevalidation.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhoneValidationRequestDTO {

    private String ktp;
    private String phoneNumber;

}
