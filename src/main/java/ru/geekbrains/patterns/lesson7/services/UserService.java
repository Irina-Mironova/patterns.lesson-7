package ru.geekbrains.patterns.lesson7.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.patterns.lesson7.models.User;
import ru.geekbrains.patterns.lesson7.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
