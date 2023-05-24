package co.edu.uco.quickjob.service.assambler.dto.implementation;

import co.edu.uco.quickjob.dto.DepartmentDTO;
import co.edu.uco.quickjob.service.assambler.dto.DTOAssembler;
import co.edu.uco.quickjob.service.domain.DepartmentDomain;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDTOAssembler implements DTOAssembler<DepartmentDTO, DepartmentDomain> {
    @Override
    public DepartmentDomain assembleToDomain(DepartmentDTO dto) {
        return null;
    }

    @Override
    public DepartmentDTO assembleToDTO(DepartmentDomain domain) {
        return null;
    }
}
