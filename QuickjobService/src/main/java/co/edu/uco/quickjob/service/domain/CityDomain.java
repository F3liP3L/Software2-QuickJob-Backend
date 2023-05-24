package co.edu.uco.quickjob.service.domain;

import java.util.UUID;

import static co.edu.uco.crosscutting.util.UtilText.trim;
import static co.edu.uco.crosscutting.util.UtilUUID.getDefaultUUID;

public class CityDomain {

    private UUID id;
    private String name;
    private DepartmentDomain department;

    public CityDomain(UUID id, String name, DepartmentDomain department) {
        setId(id);
        setName(name);
        setDepartment(department);
    }

    public static CityDomain build(UUID id, String name, DepartmentDomain department){
        return new CityDomain(id, name, department);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = getDefaultUUID(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = trim(name);
    }

    public DepartmentDomain getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDomain department) {
        this.department = department;
    }
}
