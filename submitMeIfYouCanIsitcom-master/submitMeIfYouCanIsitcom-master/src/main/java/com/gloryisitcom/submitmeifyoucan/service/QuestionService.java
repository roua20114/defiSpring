package com.gloryisitcom.submitmeifyoucan.service;

import com.gloryisitcom.submitmeifyoucan.models.QuestionDto;

import java.util.List;

public interface QuestionService {
    QuestionDto add(QuestionDto questionDto);
    List<QuestionDto> findAll();

    void delete(long questionId);
}
