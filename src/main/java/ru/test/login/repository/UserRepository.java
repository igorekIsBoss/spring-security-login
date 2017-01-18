package ru.test.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.test.login.model.User;

/**
 * Created by igor on 15.01.17.
 */
@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {
}
