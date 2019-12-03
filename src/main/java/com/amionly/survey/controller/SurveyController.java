package com.amionly.survey.controller;

import com.amionly.survey.dto.SurveyDto;
import com.amionly.survey.services.survey.SurveyService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

import lombok.AllArgsConstructor;

import static com.amionly.survey.mapper.SurveyMapper.toSurvey;
import static com.amionly.survey.mapper.SurveyMapper.toSurveyDto;
import static com.amionly.survey.mapper.SurveyMapper.toSurveyDtoList;

@RestController
@AllArgsConstructor
public class SurveyController {

    private final SurveyService surveyService;

    @PostMapping("/surveys")
    @ResponseStatus(HttpStatus.CREATED)
    public SurveyDto createSurvey(@Valid @RequestBody SurveyDto surveyDto) {
        return toSurveyDto(surveyService.save(toSurvey(surveyDto)));
    }

    @GetMapping("/surveys")
    @ResponseStatus(HttpStatus.OK)
    public List<SurveyDto> getSurveys() {
        return toSurveyDtoList(surveyService.getAllSurvey());
    }


//    @PutMapping("/surveys/{surveyId}")
//    public Survey updateSurvey(@PathVariable Long surveyId,
//                                   @Valid @RequestBody Survey surveyRequest) {
//        return surveyRepository.findById(surveyId)
//                .map(survey -> {
//                	survey.setIsEditable(surveyRequest.getIsEditable());
//                	survey.setIsAccessibleToPublic(surveyRequest.getIsAccessibleToPublic());
//                    return surveyRepository.save(survey);
//                }).orElseThrow(() -> new ResourceNotFoundException("Survey not found with id " + surveyId));
//    }
//
//
//    @DeleteMapping("/surveys/{surveyId}")
//    public ResponseEntity<?> deleteSurvey(@PathVariable Long surveyId) {
//        return surveyRepository.findById(surveyId)
//                .map(survey -> {
//                	surveyRepository.delete(survey);
//                    return ResponseEntity.ok().build();
//                }).orElseThrow(() -> new ResourceNotFoundException("Survey not found with id " + surveyId));
//    }
}
