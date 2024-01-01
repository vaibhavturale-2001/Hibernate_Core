package org.example.HQL.HQL_Updatedata;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MyEmployee {

    @Id
    private int eid;
    private String ename;
    private String city;
    private double CTC;
}
