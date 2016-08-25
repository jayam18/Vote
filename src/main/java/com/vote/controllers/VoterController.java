package com.vote.controllers;

import com.vote.entities.Voter;
import com.vote.services.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/voters")
public class VoterController {
    private VoterService service;

    @Autowired
    public void setService(VoterService service){
        this.service =  service;
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
    public Page<Voter> index(@RequestParam(name = "page", required = false, defaultValue = "0") int page) {
        return this.service.findAll(page);
    }



}
