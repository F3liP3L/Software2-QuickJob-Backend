package co.edu.uco.quickjob.service.domain.assambler.entity.implementation;

import co.edu.uco.quickjob.entity.CountryEntity;
import co.edu.uco.quickjob.service.domain.CountryDomain;
import co.edu.uco.quickjob.service.domain.assambler.entity.EntityAssambler;

public class CountryEntityImplementation implements EntityAssambler<CountryEntity, CountryDomain> {
    @Override
    public CountryDomain assembleDomain(CountryEntity entity) {
        return null;
    }

    @Override
    public CountryEntity assembleEntity(CountryDomain domain) {
        return null;
    }
}
