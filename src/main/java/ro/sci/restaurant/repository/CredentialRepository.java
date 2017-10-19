package ro.sci.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.sci.restaurant.model.Credentials;

import java.util.List;


@Repository
@Transactional
public interface CredentialRepository extends CrudRepository<Credentials, Integer> {

    Credentials findByUid(int uid);

    Credentials findByUsername(String username);

    List<Credentials> findAll();
}
