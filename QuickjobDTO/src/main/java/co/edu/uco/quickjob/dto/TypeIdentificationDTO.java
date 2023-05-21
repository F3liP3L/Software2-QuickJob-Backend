package co.edu.uco.quickjob.dto;

import static co.edu.uco.crosscutting.util.UtilText.*;
import static co.edu.uco.crosscutting.util.UtilText.trim;

public class TypeIdentificationDTO {
    private String id;
    private String code;
    private String name;

    public TypeIdentificationDTO(final String id, final String code, final String name) {
        setId(id);
        setCode(code);
        setName(name);
    }
    public TypeIdentificationDTO(){
        setId(EMPTY);
        setCode(EMPTY);
        setName(EMPTY);
    }
    public TypeIdentificationDTO create(){
        return new TypeIdentificationDTO();
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

    public void setCode(String code) {
        this.code = trim(code);
    }

    public String getCode() {
        if (isNull(code)){
            setId(EMPTY);
        }
        return trim(code);
    }
}
