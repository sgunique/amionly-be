package com.amionly.survey.services.survey;

import com.amionly.survey.persistance.survey.model.Question;

import java.util.List;

public interface QuestionService {
    Question save(Question question);

    List<Question> getAllQuestions();
}
