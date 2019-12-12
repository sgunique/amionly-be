package com.amionly.survey.services.survey.impl;

import com.amionly.survey.persistance.survey.model.Question;
import com.amionly.survey.persistance.survey.repository.QuestionRepository;
import com.amionly.survey.services.survey.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
}
