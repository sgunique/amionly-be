package com.amionly.survey.controller;

import com.amionly.survey.exceptions.ResourceNotFoundException;
import com.amionly.survey.persistance.model.Survey;
import com.amionly.survey.persistance.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public class SurveyController {

    @Autowired
    private SurveyRepository surveyRepository;

    @GetMapping("/surveys")
    public Page<Survey> getSurveys(Pageable pageable) {
        return surveyRepository.findAll(pageable);
    }


    @PostMapping("/surveys")
    public Survey createSurvey(@Valid @RequestBody Survey survey) {
        return surveyRepository.save(survey);
    }

    @PutMapping("/surveys/{surveyId}")
    public Survey updateSurvey(@PathVariable Long surveyId,
                                   @Valid @RequestBody Survey surveyRequest) {
        return surveyRepository.findById(surveyId)
                .map(survey -> {
                	survey.setIsEditable(surveyRequest.getIsEditable());
                	survey.setIsAccessibleToPublic(surveyRequest.getIsAccessibleToPublic());
                    return surveyRepository.save(survey);
                }).orElseThrow(() -> new ResourceNotFoundException("Survey not found with id " + surveyId));
    }


    @DeleteMapping("/surveys/{surveyId}")
    public ResponseEntity<?> deleteSurvey(@PathVariable Long surveyId) {
        return surveyRepository.findById(surveyId)
                .map(survey -> {
                	surveyRepository.delete(survey);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("Survey not found with id " + surveyId));
    }
}
