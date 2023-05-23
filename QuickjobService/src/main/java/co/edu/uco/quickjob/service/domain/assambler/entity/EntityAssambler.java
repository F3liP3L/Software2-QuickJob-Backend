package co.edu.uco.quickjob.service.domain.assambler.entity;

public interface EntityAssambler<E, D> {

    D assembleDomain(E entity);

    E assembleEntity(D domain);
}
