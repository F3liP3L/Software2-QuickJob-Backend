package co.edu.uco.quickjob.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class UserEntity {
    @Id
    private UUID id;
    private String name;
    private String email;
    private String profileDescription;
    private String password;
    private String image;
    @OneToOne
    @JoinColumn
    private PersonEntity person;

}
