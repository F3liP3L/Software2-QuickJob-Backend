package co.edu.uco.quickjob.service.assambler.entity;

public interface EntityAssambler<E, D> {

    D assembleToDomain(E entity);

    E assembleToEntity(D domain);
}
