package org.example.Embeddable_Annotation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "studentEm")
public class StudentEm {
    @Id
    @GeneratedValue
    private int sid;
    private String name;
    private String city;
    private Certificate cert;
}
