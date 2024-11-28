package com.api.phonevalidation.controller;

import com.api.phonevalidation.model.leaddetails;
import com.api.phonevalidation.services.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/leads")
public class LeadController {

    @Autowired
    private LeadService leadService;

    // API to fetch lead details by ID
    @GetMapping("/{id}")
    public ResponseEntity<leaddetails> getLead(@PathVariable Long id) {
        leaddetails lead = leadService.getLeadById(id);
        return ResponseEntity.ok(lead);
    }

    // API to update lead status and follow-up details
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateLead(@PathVariable Long id,
                                           @RequestParam String status,
                                           @RequestParam(required = false) String followUpMethod,
                                           @RequestParam String mapId) {
        leadService.updateLead(id, status, followUpMethod, mapId);
        return ResponseEntity.ok().build();
    }
}
