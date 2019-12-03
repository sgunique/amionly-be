package com.amionly.survey.services.survey.impl;

import com.amionly.survey.persistance.survey.model.Survey;
import com.amionly.survey.persistance.survey.repository.SurveyRepository;
import com.amionly.survey.services.survey.SurveyService;

import org.springframework.stereotype.Service;

import java.util.List;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SurveyServiceImpl implements SurveyService {
    private final SurveyRepository surveyRepository;

    @Override
    public Survey save(Survey survey) {
        return surveyRepository.save(survey);
    }

    @Override
    public List<Survey> getAllSurvey() {
        return surveyRepository.findAll();
    }
}
