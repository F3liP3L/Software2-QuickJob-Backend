package co.edu.uco.quickjob.service.assambler.dto.implementation;

import co.edu.uco.quickjob.dto.DepartmentDTO;
import co.edu.uco.quickjob.service.assambler.dto.DTOAssembler;
import co.edu.uco.quickjob.service.domain.DepartmentDomain;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDTOAssembler implements DTOAssembler<DepartmentDTO, DepartmentDomain> {

    private final ModelMapper modelMapper;

    public DepartmentDTOAssembler() {
        this.modelMapper = new ModelMapper();
    }

    @Override
    public DepartmentDomain assembleToDomain(DepartmentDTO dto) {
        return modelMapper.map(dto, DepartmentDomain.class);
    }

    @Override
    public DepartmentDTO assembleToDTO(DepartmentDomain domain) {
        return modelMapper.map(domain, DepartmentDTO.class);
    }
}
