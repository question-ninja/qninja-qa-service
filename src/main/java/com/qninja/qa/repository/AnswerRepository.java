package com.qninja.qa.repository;

import com.qninja.qa.model.answer.Answer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AnswerRepository extends PagingAndSortingRepository<Answer,Long> {
}
