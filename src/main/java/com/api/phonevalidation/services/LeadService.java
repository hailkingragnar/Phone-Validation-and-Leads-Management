package com.api.phonevalidation.services;

import com.api.phonevalidation.mapper.LeadMapper;
import com.api.phonevalidation.model.leaddetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeadService {

    @Autowired
    private LeadMapper leadMapper;

    // Fetch lead details by ID
    public leaddetails getLeadById(Long id) {
        return leadMapper.getLeadById(id);
    }

    // Update lead status and follow-up details
    public void updateLead(Long id, String status, String followUpMethod, String mapId) {
        leadMapper.updateLead(id, status, followUpMethod, mapId);
    }
}
