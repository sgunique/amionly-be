package com.amionly.survey.persistance.survey.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "question")
@Getter
@Setter
public class Question {
    @Id
    @GeneratedValue
    @SequenceGenerator(
            name = "question_id",
            sequenceName = "question_sequence",
            initialValue = 1000
    )
    private int questionId;

    @GeneratedValue
    @SequenceGenerator(
            name = "survey_id",
            sequenceName = "survey_sequence",
            initialValue = 1000
    )
    private int surveyId;

    @GeneratedValue
    @SequenceGenerator(
            name = "question_number",
            sequenceName = "question_number_sequence",
            initialValue = 1000
    )
    private int questionNumber;

    private String questionText;

    private String questionType;

    private String chart_type;

    private String category;
}
