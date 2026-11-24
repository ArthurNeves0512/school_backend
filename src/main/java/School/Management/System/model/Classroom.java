package School.Management.System.model;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "CLASSROOM")
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;

    public String className;

    public String room;

}
