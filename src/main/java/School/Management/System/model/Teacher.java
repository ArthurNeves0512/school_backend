package School.Management.System.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "TEACHER")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    public UUID id;

    @Column(name = "name")
    public String name;

    @Column(name = "cpf")
    public String cpf;

    @Column(name = "DATE_OF_BIRTH)")
    public LocalDate birthDate;
}
