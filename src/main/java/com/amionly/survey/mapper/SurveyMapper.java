package com.amionly.survey.mapper;

import com.amionly.survey.dto.SurveyDto;
import com.amionly.survey.persistance.model.Survey;
import org.springframework.beans.BeanUtils;

public class SurveyMapper {
    public static SurveyDto toSurveyDto(Survey survey) {
        SurveyDto surveyDto = new SurveyDto();
        BeanUtils.copyProperties(survey, surveyDto);
        return surveyDto;
    }
}
