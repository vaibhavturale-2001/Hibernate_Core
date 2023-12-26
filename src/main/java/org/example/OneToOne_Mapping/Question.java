package org.example.OneToOne_Mapping;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question {
    @Id
    @Column(name = "Question_Id")
    private int questionId;
    private String question;
    @OneToOne
    @JoinColumn(name = "a_id")                          //This is for rename the column name ex. a_id
    private Answer answer;
}
