package com.amionly.survey.persistance.survey.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "surveys")
@Getter
@Setter
public class Survey {
    @Id
    @GeneratedValue
    @SequenceGenerator(
            name = "survey_id",
            sequenceName = "survey_sequence",
            initialValue = 1000
    )
    private Long surveyId;

    @GeneratedValue
    @SequenceGenerator(
            name = "response_id",
            sequenceName = "response_sequence",
            initialValue = 1000
    )
    private Long responseId;

    private Date startDate;

    private Date endDate;

    private boolean isEditable;

    private boolean accessPublic;

}
