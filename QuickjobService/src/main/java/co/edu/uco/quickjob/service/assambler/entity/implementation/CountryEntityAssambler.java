package co.edu.uco.quickjob.service.assambler.entity.implementation;

import co.edu.uco.quickjob.entity.CountryEntity;
import co.edu.uco.quickjob.service.assambler.entity.EntityAssembler;
import co.edu.uco.quickjob.service.domain.CountryDomain;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CountryEntityAssambler implements EntityAssembler<CountryEntity, CountryDomain> {
    private final ModelMapper modelMapper;
    public CountryEntityAssambler() {
        this.modelMapper = new ModelMapper();
    }
    @Override
    public CountryDomain assembleToDomain(CountryEntity entity) {
        return modelMapper.map(entity, CountryDomain.class);
    }
    @Override
    public CountryEntity assembleToEntity(CountryDomain domain) {
        return modelMapper.map(domain, CountryEntity.class);
    }
}
