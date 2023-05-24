package co.edu.uco.quickjob.service.assambler.dto.implementation;

import co.edu.uco.quickjob.dto.CountryDTO;
import co.edu.uco.quickjob.service.assambler.dto.DTOAssambler;
import co.edu.uco.quickjob.service.domain.CountryDomain;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CountryDTOAssambler implements DTOAssambler<CountryDTO, CountryDomain> {
    private final ModelMapper modelMapper;

    public CountryDTOAssambler() {
        this.modelMapper = new ModelMapper();
    }

    @Override
    public CountryDomain assembleToDomain(CountryDTO dto) {
        return modelMapper.map(dto, CountryDomain.class);
    }

    @Override
    public CountryDTO assembleToDTO(CountryDomain domain) {
        return modelMapper.map(domain, CountryDTO.class);
    }
}
