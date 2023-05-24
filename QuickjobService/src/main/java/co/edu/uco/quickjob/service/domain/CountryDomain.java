package co.edu.uco.quickjob.service.domain;

import java.util.UUID;

import static co.edu.uco.crosscutting.util.UtilText.trim;
import static co.edu.uco.crosscutting.util.UtilUUID.getDefaultUUID;

public class CountryDomain {
    private UUID id;
    private String name;

    public CountryDomain(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static CountryDomain build(UUID id, String name){
        return new CountryDomain(id, name);
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
}
