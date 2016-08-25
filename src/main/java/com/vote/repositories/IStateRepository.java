package com.vote.repositories;

import com.vote.entities.State;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface IStateRepository extends PagingAndSortingRepository<State, Integer>{
}
