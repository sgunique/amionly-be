package com.amionly.survey.services.survey;

import com.amionly.survey.persistance.survey.model.Survey;

import java.util.List;

public interface SurveyService {
    Survey save(Survey survey);

    List<Survey> getAllSurvey();
}
