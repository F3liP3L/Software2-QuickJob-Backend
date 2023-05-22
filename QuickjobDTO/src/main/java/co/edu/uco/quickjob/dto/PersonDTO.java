package co.edu.uco.quickjob.dto;

import java.util.Date;

import static co.edu.uco.crosscutting.util.UtilDate.getUtilDate;
import static co.edu.uco.crosscutting.util.UtilObject.getUtilObject;
import static co.edu.uco.crosscutting.util.UtilText.*;

public class PersonDTO {
    private String id;
    private String idNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String middleLastName;
    private Date dateBirth;
    private TypeIdentificationDTO typeIdentification;
    private CityDTO cityResidence;

    public PersonDTO(final String id, final String idNumber, final String firstName, final String middleName,
                     final String lastName, final String middleLastName, final Date dateBirth, final TypeIdentificationDTO typeIdentification, final CityDTO cityResidence) {
        setId(id);
        setIdNumber(idNumber);
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setMiddleLastName(middleLastName);
        setDateBirth(dateBirth);
        setTypeIdentification(typeIdentification);
        setCityResidence(cityResidence);
    }
    public PersonDTO(){
        setId(EMPTY);
        setIdNumber(EMPTY);
        setFirstName(EMPTY);
        setMiddleName(EMPTY);
        setLastName(EMPTY);
        setMiddleLastName(EMPTY);
        setDateBirth(new Date()); // Revisar Fecha
        setCityResidence(CityDTO.create());
        setTypeIdentification(TypeIdentificationDTO.create());
    }

    public static final PersonDTO create(){
        return new PersonDTO();
    }
    public String getId() {
        if (isNull(id)){
            setId(EMPTY);
        }
        return trim(id);
    }

    public void setId(String id) {
        this.id = trim(id);
    }

    public String getIdNumber() {
        if (isNull(idNumber)){
            setIdNumber(idNumber);
        }
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = trim(idNumber);
    }

    public String getFirstName() {
        if (isNull(firstName)){
            setFirstName(firstName);
        }
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = trim(firstName);
    }

    public String getMiddleName() {
        if (isNull(middleName)){
            setMiddleName(middleName);
        }
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = trim(middleName);
    }

    public String getLastName() {
        if (isNull(lastName)){
            setLastName(lastName);
        }
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = trim(lastName);
    }

    public String getMiddleLastName() {
        if (isNull(middleLastName)){
            setMiddleLastName(middleLastName);
        }
        return middleLastName;
    }

    public void setMiddleLastName(String middleLastName) {
        this.middleLastName = trim(middleLastName);
    }

    public Date getDateBirth() {
        if (getUtilDate().isNull(dateBirth)){
            setDateBirth(dateBirth);
        }
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = getUtilDate().getDefaultIsNull(dateBirth);
    }

    public TypeIdentificationDTO getTypeIdentification() {
        if(getUtilObject().isNull(typeIdentification)){
            setTypeIdentification(typeIdentification);
        }
        return typeIdentification;
    }

    public void setTypeIdentification(TypeIdentificationDTO typeIdentification) {
        this.typeIdentification = getUtilObject().getDefaultIsNull(typeIdentification, TypeIdentificationDTO.create());
    }

    public CityDTO getCityResidence() {
        if(getUtilObject().isNull(cityResidence)){
            setCityResidence(cityResidence);
        }
        return cityResidence;
    }

    public void setCityResidence(CityDTO cityResidence) {
        this.cityResidence = getUtilObject().getDefaultIsNull(cityResidence, CityDTO.create());
    }
}
