package com.vote.repositories;


import com.vote.entities.Candidate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICandidateRepository extends PagingAndSortingRepository<Candidate, Integer> {
//    @Query("from Candidate c  left join candidates_voters cv  where c.position = 'PRESIDENT' and max(cv.candidate_id) = c.id)
    @Query("select c from Candidate c  where c.position = 'PRESIDENT'")
    public Candidate presidentialWin();
}
