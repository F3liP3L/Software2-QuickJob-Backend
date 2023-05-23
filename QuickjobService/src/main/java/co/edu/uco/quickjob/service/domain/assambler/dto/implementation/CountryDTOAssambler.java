package co.edu.uco.quickjob.service.domain.assambler.dto.implementation;

import co.edu.uco.quickjob.dto.CountryDTO;
import co.edu.uco.quickjob.service.domain.CountryDomain;
import co.edu.uco.quickjob.service.domain.assambler.dto.DTOAssambler;

public class CountryDTOAssambler implements DTOAssambler<CountryDTO, CountryDomain> {
    @Override
    public CountryDomain assembleDomain(CountryDTO dto) {
        return null;
    }

    @Override
    public CountryDTO assembleDTO(CountryDomain domain) {
        return null;
    }
}
