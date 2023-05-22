package co.edu.uco.quickjob.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class CountryEntity {
    @Id
    @Column(name = "codigo")
    private UUID id;
    @Column(name = "nombre")
    private String name;
}
