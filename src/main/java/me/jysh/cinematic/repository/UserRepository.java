package me.jysh.cinematic.repository;

import me.jysh.cinematic.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
