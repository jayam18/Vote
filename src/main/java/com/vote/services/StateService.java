package com.vote.services;

import com.vote.entities.State;
import com.vote.repositories.IStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class StateService {
    private IStateRepository repository;
    @Autowired
    public void setRepository(IStateRepository repository) {
        this.repository = repository;
    }

    public Page<State> findAll(int page){
        PageRequest pr = new PageRequest(page, 3);
        return this.repository.findAll(pr);

    }

}
