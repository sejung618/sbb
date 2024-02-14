package com.mysite.sbb.question;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.mysite.sbb.answer.Answer;

import jakarta.persistence.CascadeType; 
import jakarta.persistence.OneToMany; 
import jakarta.persistence.ManyToOne;
import com.mysite.sbb.user.SiteUser;
import java.util.Set;
import jakarta.persistence.ManyToMany;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;
    
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) 
    private List<Answer> answerList; 
    
    @ManyToOne
    private SiteUser author;
    
    private LocalDateTime modifyDate;
    
    //@ManyToMany 애너테이션을 사용해 다대다 관계로 속성을 생성하면 새로운 테이블을 만들어 관련 데이터를 관리한다.
    @ManyToMany
    Set<SiteUser> voter;
    
}
