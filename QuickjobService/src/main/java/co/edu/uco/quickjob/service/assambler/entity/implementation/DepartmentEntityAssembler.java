package co.edu.uco.quickjob.service.assambler.entity.implementation;

import co.edu.uco.quickjob.entity.DepartmentEntity;
import co.edu.uco.quickjob.service.assambler.entity.EntityAssembler;
import co.edu.uco.quickjob.service.domain.DepartmentDomain;
import org.modelmapper.ModelMapper;

public class DepartmentEntityAssembler implements EntityAssembler<DepartmentEntity, DepartmentDomain> {

    private final ModelMapper modelMapper;
    public DepartmentEntityAssembler() {
        this.modelMapper = new ModelMapper();
    }
    @Override
    public DepartmentDomain assembleToDomain(DepartmentEntity entity) {
        return modelMapper.map(entity, DepartmentDomain.class);
    }

    @Override
    public DepartmentEntity assembleToEntity(DepartmentDomain domain) {
        return modelMapper.map(domain, DepartmentEntity.class);
    }
}
