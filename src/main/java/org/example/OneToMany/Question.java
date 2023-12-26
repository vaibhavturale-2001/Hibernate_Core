package org.example.OneToMany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question {

    @Id
    @Column(name = "Question_Id")
    private int questionId;
    private String question;
//    @OneToMany(mappedBy = "question")
    private List<Answer> answerList;            //one que and list of answe
}
