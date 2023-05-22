package co.edu.uco.quickjob.dto;

import co.edu.uco.crosscutting.util.UtilText;
import static co.edu.uco.crosscutting.util.UtilObject.getUtilObject;
import static co.edu.uco.crosscutting.util.UtilText.*;

public class DepartmentDTO {

    private String id;
    private String name;
    private CountryDTO country;

    public DepartmentDTO(final String id, final String name, final CountryDTO country) {
        setId(id);
        setName(name);
        this.country = country;
    }

    public DepartmentDTO() {
        setId(UtilText.EMPTY);
        setName(UtilText.EMPTY);
        setCountry(CountryDTO.create());
    }

    public static DepartmentDTO create(){
        return new DepartmentDTO();
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

    public CountryDTO getCountry() {
        if (getUtilObject().isNull(country)){
            setCountry(CountryDTO.create());
        }
        return country;
    }

    public void setCountry(CountryDTO country) {
        this.country = getUtilObject().getDefaultIsNull(country, CountryDTO.create());
    }
}
