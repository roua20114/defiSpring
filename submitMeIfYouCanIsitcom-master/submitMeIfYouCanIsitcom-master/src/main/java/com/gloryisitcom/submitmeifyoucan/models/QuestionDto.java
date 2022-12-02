package com.gloryisitcom.submitmeifyoucan.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuestionDto {
    private String label;
    private List<String> options;
    private List<String> correctAnswerIndexes;
}