package com.amionly.survey.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionDto {

    private int questionId;

    private int surveyId;

    private int questionNumber;

    private String questionText;

    private String questionType;

    private String chartType;

    private String category;
}
