package co.edu.uco.quickjob.dto;

import co.edu.uco.crosscutting.util.UtilObject;

import static co.edu.uco.crosscutting.util.UtilText.*;
import static co.edu.uco.crosscutting.util.UtilText.trim;

public class UserDTO {
    private String id;
    private String name;
    private String email;
    private String profileDescription;
    private String password;
    private String image;
    private PersonDTO person;

    public UserDTO(String id, String name, String email, String profileDescription, String password, String image, PersonDTO person) {
        setId(id);
        setName(name);
        setEmail(email);
        setPassword(password);
        setProfileDescription(profileDescription);
        setPerson(person);
        setImage(image);
    }

    public UserDTO() {
        setId(EMPTY);
        setName(EMPTY);
        setEmail(EMPTY);
        setPassword(EMPTY);
        setPerson(PersonDTO.create());
        setProfileDescription(EMPTY);
        setImage(EMPTY);
    }

    public PersonDTO getPerson() {
        if (UtilObject.getUtilObject().isNull(person)){
            setPerson(person);
        }
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = UtilObject.getUtilObject().getDefaultIsNull(person, PersonDTO.create());
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

    public String getName() {
        if (isNull(name)){
            setId(EMPTY);
        }
        return trim(name);
    }

    public void setName(String name) {
        this.name = trim(name);
    }


    public String getEmail() {
        if(isNull(email)){
            setEmail(email);
        }
        return email;
    }

    public void setEmail(String email) {
        this.email = trim(email);
    }

    public String getPassword() {
        if (isNull(password)){
            setPassword(password);
        }
        return password;
    }

    public void setPassword(String password) {
        this.password = trim(password);
    }

    public String getImage() {
        if(isNull(image)){
            setImage(image);
        }
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProfileDescription() {
        if(isNull(profileDescription)){
            setProfileDescription(profileDescription);
        }
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = trim(profileDescription);
    }
}
