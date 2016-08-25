package com.vote.services;

import com.vote.entities.Candidate;
import com.vote.repositories.ICandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    private ICandidateRepository repository;
    @Autowired
    public void setRepository(ICandidateRepository repository) {
        this.repository = repository;
    }

    public Page<Candidate> findAll(int page){
        PageRequest pr = new PageRequest(page, 3);
        return this.repository.findAll(pr);
    }
    public Candidate presidentialWin(){
//        private List<Candidate> TobePresidents;

//        TobePresidents = this.repository.presidentialWin();

        return this.repository.presidentialWin();
    }

}
