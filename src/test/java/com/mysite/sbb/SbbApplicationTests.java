package com.mysite.sbb;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDateTime;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerRepository answerRepository;
    
    @Test
    void testJpa() {
    	
    }
}
