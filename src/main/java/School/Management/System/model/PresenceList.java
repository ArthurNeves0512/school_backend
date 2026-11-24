package School.Management.System.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Table
@Entity
public class PresenceList {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    LocalDateTime presence_check;
}
