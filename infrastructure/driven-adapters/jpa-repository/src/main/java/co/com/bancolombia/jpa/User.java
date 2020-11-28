package co.com.bancolombia.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name = "schemausuarios.\"user\"")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String lastname;
    private String type;
    private Double salary;
}
