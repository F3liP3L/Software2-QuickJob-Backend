package co.edu.uco.quickjob.service.domain.assambler.dto;

public interface DTOAssambler<T, D> {
    D assembleDomain(T dto);
    T assembleDTO(D domain);
}
