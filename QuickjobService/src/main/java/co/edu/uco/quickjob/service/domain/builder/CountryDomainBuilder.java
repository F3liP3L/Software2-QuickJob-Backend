package co.edu.uco.quickjob.service.domain.builder;

import co.edu.uco.crosscutting.util.UtilUUID;
import co.edu.uco.quickjob.service.domain.CountryDomain;

import java.util.UUID;

import static co.edu.uco.crosscutting.util.UtilText.EMPTY;
import static co.edu.uco.crosscutting.util.UtilText.trim;
import static co.edu.uco.crosscutting.util.UtilUUID.getDefaultUUID;

public class CountryDomainBuilder {
    private UUID id;
    private String name;

    public CountryDomainBuilder() {
        setId(UtilUUID.DEFAULT_UUID);
        setName(EMPTY);
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

    public final CountryDomain build(){
        return CountryDomain.build(getId(),getName());
    }
}
