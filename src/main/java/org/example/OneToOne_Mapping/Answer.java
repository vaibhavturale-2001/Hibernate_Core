package org.example.OneToOne_Mapping;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Answer {
    @Id
    @Column(name="Answer_Id")
    private int answerId;
    private String answer;
    @OneToOne(mappedBy = "answer")
    @JoinColumn(name="q_id")
    private Question question;
}
