package com.amionly.survey.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SurveyDto {
    private Long surveyId;

    private Long responseId;

    private Date startDate;

    private Date endDate;

    private boolean isEditable;

    private boolean accessPublic;

}
