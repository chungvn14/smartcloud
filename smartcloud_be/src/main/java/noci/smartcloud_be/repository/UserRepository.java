package noci.smartcloud_be.repository;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import noci.smartcloud_be.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Method to find user by email
    Optional<User> findByEmail(String email);

    // Method to check if email exists
    boolean existsByEmail(String email);

    // Method to find all users
    List<User> findAll();
}
