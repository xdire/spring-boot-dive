package io.xdire.xplore.spring.userservice.repositories;

import io.xdire.xplore.spring.userservice.models.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserRepository extends JpaRepository<User, Long> {

    User findByLogin(String login);

    @Query("SELECT u FROM users WHERE u.id IN (:idList)")
    List<User> findByIdList(@Param("idList") List<Long> id);

}
