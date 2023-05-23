package co.edu.uco.quickjob.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "person")
public class PersonEntity {
    @Id
    private UUID id;
    @Column(nullable = false)
    private String idNumber;
    @Column(nullable = false)
    private String firstName;
    private String middleName;
    @Column(nullable = false)
    private String lastName;
    private String middleLastName;
    @Column(nullable = false)
    private Date dateBirth;
    @ManyToOne
    @JoinColumn(nullable = false)
    private TypeIdentificationEntity typeIdentification;
    @ManyToOne
    @JoinColumn(nullable = false)
    private CityEntity cityResidence;
}
