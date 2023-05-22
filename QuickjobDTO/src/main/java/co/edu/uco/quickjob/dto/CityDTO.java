package co.edu.uco.quickjob.dto;

import static co.edu.uco.crosscutting.util.UtilObject.getUtilObject;
import static co.edu.uco.crosscutting.util.UtilText.*;
import static co.edu.uco.crosscutting.util.UtilText.trim;

public class CityDTO {
    private String id;
    private String name;
    private DepartmentDTO department;

    public CityDTO(){
        setId(EMPTY);
        setName(EMPTY);
        setDepartment(DepartmentDTO.create());
    }
    public CityDTO(final String id, final String name, final DepartmentDTO department) {
        setId(id);
        setName(name);
        setDepartment(department);
    }
    public static final CityDTO create(){
        return new CityDTO();
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

    public DepartmentDTO getDepartment() {
        if(getUtilObject().isNull(department)){
            setDepartment(DepartmentDTO.create());
        }
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = getUtilObject().getDefaultIsNull(department, DepartmentDTO.create());
    }
}
