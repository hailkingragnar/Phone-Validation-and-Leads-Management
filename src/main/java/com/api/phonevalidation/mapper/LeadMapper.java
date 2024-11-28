package com.api.phonevalidation.mapper;

import com.api.phonevalidation.model.leaddetails;
import org.apache.ibatis.annotations.*;

import java.util.Optional;

@Mapper
public interface LeadMapper {

    // Fetch lead by ID
    @Select("SELECT * FROM leaddetails WHERE id = #{id}")
    leaddetails getLeadById(Long id);

    // Update lead status, follow-up method, and mapId
    @Update("UPDATE leaddetails " +
            "SET status = #{status}, followUpMethod = #{followUpMethod}, mapId = #{mapId} " +
            "WHERE id = #{id}")
    void updateLead(Long id, String status, String followUpMethod, String mapId);
}
