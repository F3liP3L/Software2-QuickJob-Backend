package co.edu.uco.quickjob.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "departamento")
public class DepartmentEntity {
    @Id
    private UUID id;

    private String name;
    @ManyToOne
    @JoinColumn
    private CountryEntity country;
}


