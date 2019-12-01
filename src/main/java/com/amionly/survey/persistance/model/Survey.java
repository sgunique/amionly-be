package com.amionly.survey.persistance.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

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
    
    @Column(columnDefinition = "start_date")
    private Date startDate;
    
    @Column(columnDefinition = "end_date")
    private Date endDate;

    @Column(columnDefinition = "is_editable")
    private boolean isEditable;
    
    
    @Column(columnDefinition = "access_public")
    private boolean accessPublic;
    
}
