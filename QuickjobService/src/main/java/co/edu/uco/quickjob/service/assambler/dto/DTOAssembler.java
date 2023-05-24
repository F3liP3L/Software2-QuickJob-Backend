package co.edu.uco.quickjob.service.assambler.dto;

public interface DTOAssembler<T, D> {
    D assembleToDomain(T dto);
    T assembleToDTO(D domain);
}
