package com.qninja.qa.repository;

import com.qninja.qa.model.question.Question;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface QuestionRepository extends PagingAndSortingRepository<Question,Long>{
}
