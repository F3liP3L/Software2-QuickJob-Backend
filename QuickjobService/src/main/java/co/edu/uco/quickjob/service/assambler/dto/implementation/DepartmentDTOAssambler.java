package co.edu.uco.quickjob.service.assambler.dto.implementation;

import co.edu.uco.quickjob.dto.DepartmentDTO;
import co.edu.uco.quickjob.service.assambler.dto.DTOAssambler;
import co.edu.uco.quickjob.service.domain.DepartmentDomain;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDTOAssambler implements DTOAssambler<DepartmentDTO, DepartmentDomain> {
    @Override
    public DepartmentDomain assembleToDomain(DepartmentDTO dto) {
        return null;
    }

    @Override
    public DepartmentDTO assembleToDTO(DepartmentDomain domain) {
        return null;
    }
}
