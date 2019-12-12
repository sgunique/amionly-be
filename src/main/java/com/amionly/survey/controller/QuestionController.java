package com.amionly.survey.controller;

import com.amionly.survey.dto.QuestionDto;
import com.amionly.survey.services.survey.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.amionly.survey.mapper.QuestionMapper.*;

@RestController
@AllArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @PostMapping("/question")
    @ResponseStatus(HttpStatus.CREATED)
    public QuestionDto createQuestion(@Valid @RequestBody QuestionDto questionDto) {
        return toQuestionDto(questionService.save(toQuestion(questionDto)));
    }

    @GetMapping("/getAllQuestions")
    @ResponseStatus(HttpStatus.OK)
    public List<QuestionDto> getAllQuestions() {
        return toQuestionDtoList(questionService.getAllQuestions());
    }
}
