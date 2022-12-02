package com.gloryisitcom.submitmeifyoucan.controller;

import com.gloryisitcom.submitmeifyoucan.models.QuestionDto;
import com.gloryisitcom.submitmeifyoucan.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping("/add")
    ResponseEntity<QuestionDto> add(@RequestBody final QuestionDto questionDto){
        return ResponseEntity.ok(questionService.add(questionDto));
    }

    @GetMapping("/all")
    ResponseEntity<List<QuestionDto>> findAll(){
        return ResponseEntity.ok(questionService.findAll());
    }

    @DeleteMapping("/{questionId}")
    ResponseEntity<Void> deleteQuestion(@RequestParam final long questionId){
        questionService.delete(questionId);
        return ResponseEntity.noContent().build();
    }
}