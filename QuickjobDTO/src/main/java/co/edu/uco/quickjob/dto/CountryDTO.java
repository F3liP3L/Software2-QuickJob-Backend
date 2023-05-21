package co.edu.uco.quickjob.dto;

import co.edu.uco.crosscutting.util.UtilText;

import static co.edu.uco.crosscutting.util.UtilText.*;

public class CountryDTO {
    private String id;
    private String name;

    public CountryDTO(String id, String name) {
        setId(id);
        setName(name);
    }

    public CountryDTO() {
        setId(UtilText.EMPTY);
        setName(UtilText.EMPTY);
    }

    public static final CountryDTO create(){
        return new CountryDTO();
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
}
