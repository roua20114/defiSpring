package com.gloryisitcom.submitmeifyoucan.mappers;

import com.gloryisitcom.submitmeifyoucan.entity.Question;
import com.gloryisitcom.submitmeifyoucan.models.QuestionDto;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionMapper {
    QuestionDto mapToQuestionDto(Question question);
    Question mapToQuestion(QuestionDto questionDto);
}
