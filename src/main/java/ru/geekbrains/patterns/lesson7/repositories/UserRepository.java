package ru.geekbrains.patterns.lesson7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.patterns.lesson7.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}