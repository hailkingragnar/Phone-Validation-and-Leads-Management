package com.api.phonevalidation.mapper;


import com.api.phonevalidation.controller.PhoneNumberValidationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneNumberValidationMapper extends JpaRepository<PhoneNumberValidationRequest, Integer> {


    Integer countByPhoneNumberAndId(String phoneNumber, String id);
  //  @Select("SELECT COUNT(*) FROM phonev WHERE phone_number = #{phoneNumber} AND id = #{id}")
   // Integer checkPhoneNumberAndId(@Param("phoneNumber") String phoneNumber, @Param("id") String id);
}

