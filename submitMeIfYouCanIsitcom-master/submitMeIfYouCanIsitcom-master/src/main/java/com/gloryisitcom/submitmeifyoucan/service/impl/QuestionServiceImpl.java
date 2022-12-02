package com.gloryisitcom.submitmeifyoucan.service.impl;

import com.gloryisitcom.submitmeifyoucan.mappers.QuestionMapper;
import com.gloryisitcom.submitmeifyoucan.models.QuestionDto;
import com.gloryisitcom.submitmeifyoucan.repository.QuestionRepository;
import com.gloryisitcom.submitmeifyoucan.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;
    @Override
    public QuestionDto add(QuestionDto questionDto) {
        return questionMapper.mapToQuestionDto(questionRepository.save(questionMapper.mapToQuestion(questionDto)));
    }

    @Override
    public List<QuestionDto> findAll() {
        return questionRepository.findAll().stream().map(questionMapper::mapToQuestionDto).toList();
    }

    @Override
    public void delete(long questionId) {
        questionRepository.deleteById(questionId);
    }
}
