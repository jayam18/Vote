package com.vote.services;

import com.vote.entities.Voter;
import com.vote.repositories.IVoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

@Service
public class VoterService {
    private IVoterRepository repository;

    @Autowired
    public void setRepository(IVoterRepository repository){
        this.repository = repository;
    }

    public Page<Voter> findAll(int page) {
        PageRequest pr = new PageRequest(page, 3);
        return this.repository.findAll(pr);
    }

//    public Voter findOne(int id) {
//        return this.repository.findOne(id);
//    }
//
//    public Voter create(Voter v) {
//        return this.repository.save(v);
//    }
//
//    public void destroy(int id) {
//        this.repository.delete(id);
//    }


}
