package com.amionly.survey.mapper;

import com.amionly.survey.dto.SurveyDto;
import com.amionly.survey.persistance.survey.model.Survey;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class SurveyMapper {
    public static SurveyDto toSurveyDto(Survey survey) {
        SurveyDto surveyDto = new SurveyDto();
        BeanUtils.copyProperties(survey, surveyDto);
        return surveyDto;
    }

    public static Survey toSurvey(SurveyDto surveyDto) {
        Survey survey = new Survey();
        BeanUtils.copyProperties(surveyDto, survey);
        return survey;
    }

    public static List<SurveyDto> toSurveyDtoList(List<Survey> surveys) {
        return surveys.stream().map(SurveyMapper::toSurveyDto).collect(Collectors.toList());
    }
}
