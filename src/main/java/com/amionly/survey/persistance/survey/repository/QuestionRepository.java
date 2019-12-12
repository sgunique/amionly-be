package com.amionly.survey.persistance.survey.repository;


import com.amionly.survey.persistance.survey.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
