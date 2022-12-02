package com.gloryisitcom.submitmeifyoucan.entity;

import com.gloryisitcom.submitmeifyoucan.convertor.StringListConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(columnDefinition="LONGTEXT")
    private String label;

    @Convert(converter = StringListConverter.class)
    @Column(columnDefinition="LONGTEXT")
    private List<String> options;
    @Convert(converter = StringListConverter.class)
    @Column(columnDefinition="LONGTEXT")
    private List<String> correctAnswerIndexes;
}