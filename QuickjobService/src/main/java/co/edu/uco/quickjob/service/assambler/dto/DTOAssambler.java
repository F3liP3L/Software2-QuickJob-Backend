package co.edu.uco.quickjob.service.assambler.dto;

public interface DTOAssambler<T, D> {
    D assembleToDomain(T dto);
    T assembleToDTO(D domain);
}
