package co.edu.uco.quickjob.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private UUID id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    private String profileDescription;
    @Column(nullable = false)
    private String password;
    private String image;
    @OneToOne
    @JoinColumn(nullable = false)
    private PersonEntity person;

}
