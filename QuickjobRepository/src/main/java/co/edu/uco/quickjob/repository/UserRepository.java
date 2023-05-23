package co.edu.uco.quickjob.repository;

import co.edu.uco.quickjob.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,UUID> {
}
