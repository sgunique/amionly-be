package com.amionly.survey.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "surveys")
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
