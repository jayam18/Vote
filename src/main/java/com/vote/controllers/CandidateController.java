package com.vote.controllers;

import com.vote.entities.Candidate;
import com.vote.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RequestWrapper;

@RestController
@CrossOrigin
@RequestMapping("/candidates")
public class CandidateController {

    private CandidateService service;
    @Autowired
    public void setService(CandidateService service) {
        this.service = service;
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
    public Page<Candidate> index(@RequestParam(name="page", required = false, defaultValue = "0") int page){
        return this.service.findAll(page);
    }

@RequestMapping(path = {"/president"}, method = RequestMethod.GET)
    public Candidate findPresWin(){
    return this.service.presidentialWin();
}


}
