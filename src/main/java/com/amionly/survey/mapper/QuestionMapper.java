package com.amionly.survey.mapper;

import com.amionly.survey.dto.QuestionDto;
import com.amionly.survey.persistance.survey.model.Question;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class QuestionMapper {
    public static QuestionDto toQuestionDto(Question question) {
        QuestionDto questionDto = new QuestionDto();
        BeanUtils.copyProperties(question, questionDto);
        return questionDto;
    }

    public static Question toQuestion(QuestionDto questionDto) {
        Question question = new Question();
        BeanUtils.copyProperties(questionDto, question);
        return question;
    }

    public static  List<QuestionDto> toQuestionDtoList(List<Question> questions) {
        return questions.stream().map(QuestionMapper::toQuestionDto).collect(Collectors.toList());
    }
}
