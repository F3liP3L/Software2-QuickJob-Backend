package co.edu.uco.quickjob.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tipo_identificacion")
public class TypeIdentificationEntity {
    @Id
    private UUID id;
    private String name;
    private String code;

}
