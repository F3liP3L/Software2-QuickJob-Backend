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
    @Column(name = "codigo")
    private UUID id;
    @Column(name = "nombre")
    private String name;
    @ManyToOne
    @JoinColumn(name = "pais")
    private CountryEntity country;
}


