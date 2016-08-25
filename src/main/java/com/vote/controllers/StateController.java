package com.vote.controllers;

import com.vote.entities.State;
import com.vote.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/states")
public class StateController {
    private StateService service;

    @Autowired
    public void setService(StateService service) {
        this.service = service;
    }

    @RequestMapping(path = {"","/"}, method = RequestMethod.GET)
    public Page<State> index(@RequestParam(name = "page", required = false, defaultValue = "0") int page){
        return this.service.findAll(page);
    }

}
