package co.edu.uco.quickjob.dto;

import java.time.LocalDate;

import static co.edu.uco.crosscutting.util.UtilText.EMPTY;

public class PersonDTO {
    private String id;
    private String idNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String middleLastName;
    private LocalDate dateBirth;
    private TypeIdentificationDTO typeIdentification;
    private CityDTO cityResidence;

    public PersonDTO(final String id, final String idNumber, String firstName, String middleName, String lastName, String middleLastName, LocalDate dateBirth, TypeIdentificationDTO typeIdentification, CityDTO cityResidence) {
        this.id = id;
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.middleLastName = middleLastName;
        this.dateBirth = dateBirth;
        this.typeIdentification = typeIdentification;
        this.cityResidence = cityResidence;
    }

    public PersonDTO(){
        setId(EMPTY);
        setIdNumber(EMPTY);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleLastName() {
        return middleLastName;
    }

    public void setMiddleLastName(String middleLastName) {
        this.middleLastName = middleLastName;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public TypeIdentificationDTO getTypeIdentification() {
        return typeIdentification;
    }

    public void setTypeIdentification(TypeIdentificationDTO typeIdentification) {
        this.typeIdentification = typeIdentification;
    }

    public CityDTO getCityResidence() {
        return cityResidence;
    }

    public void setCityResidence(CityDTO cityResidence) {
        this.cityResidence = cityResidence;
    }
}
