package com.qninja.qa.repository;

import com.qninja.qa.model.question.Choice;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface QuestionChoiceRepository extends PagingAndSortingRepository<Choice,Long> {
}
