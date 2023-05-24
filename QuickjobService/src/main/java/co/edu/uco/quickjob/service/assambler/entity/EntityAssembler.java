package co.edu.uco.quickjob.service.assambler.entity;

public interface EntityAssembler<E, D> {

    D assembleToDomain(E entity);

    E assembleToEntity(D domain);
}
