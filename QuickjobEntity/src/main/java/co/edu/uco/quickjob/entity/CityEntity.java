package co.edu.uco.quickjob.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "city")
public class CityEntity {
    @Id
    private UUID id;
    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn
    private DepartmentEntity department;

}
