package com.api.phonevalidation.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class leaddetails {
    @Id
    private Long id;
    private String name;
    private String nik;
    private LocalDate dateOfBirth;
    private String gender;
    private String maritalStatus;
    private String address;
    private String phoneNumber;
    private String productType;
    private String source;
    private String status;  // e.g., Prospect, Interested, Not Interested
    private String followUpMethod;
    private String mapId;   // mapId provided by NEMF

    // Getters and Setters...
}
