package co.edu.uco.quickjob.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "persona")
public class PersonEntity {
    @Id
    private UUID id;
    private String idNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String middleLastName;
    private Date dateBirth;
    @ManyToOne
    @JoinColumn
    private TypeIdentificationEntity typeIdentification;
    @ManyToOne
    @JoinColumn
    private CityEntity cityResidence;
}
