package org.example.ManyToMany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project {
    @Id
    private int pid;
    @Column(name="project_name")
    private String projectName;
    @ManyToMany(mappedBy ="projects" )
    private List<Employee> employees;
}
