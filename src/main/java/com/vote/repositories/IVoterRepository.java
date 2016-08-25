package com.vote.repositories;

import com.vote.entities.Voter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface IVoterRepository extends PagingAndSortingRepository<Voter, Integer> {
    @Query("select v from Voter v")
    public Page<Voter> findAll(Pageable pageable);
}
