package com.gloryisitcom.submitmeifyoucan.repository;

import com.gloryisitcom.submitmeifyoucan.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
