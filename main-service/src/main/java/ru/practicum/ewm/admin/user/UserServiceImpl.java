package ru.practicum.ewm.admin.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.practicum.ewm.dto.stats.UserDto;
import ru.practicum.ewm.exceptions.ResourceNotFoundException;
import ru.practicum.ewm.exceptions.ValidationException;

import java.util.List;
import java.util.regex.Pattern;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = repository.findAll();
        return UserMapper.mapToUserDto(users);
    }

    @Override
    @Transactional
    public UserDto saveUser(UserDto userDto) {
        if (userDto.getName() == null || userDto.getName().isBlank()) {
            throw new ValidationException("Имя не может быть пустым");
        }

        if (userDto.getEmail() == null || userDto.getEmail().isBlank()) {
            throw new ValidationException("Электронная почта не может быть пустым");
        }

        if (!isValidEmail(userDto.getEmail())) {
            throw new ValidationException("Неправильный формат электронной почты");
        }

        User user = repository.save(UserMapper.mapToNewUser(userDto));
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public UserDto getUserById(long userId) {
        User user = repository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + userId));
        return UserMapper.mapToUserDto(user);
    }

    @Override
    @Transactional
    public void deleteUserById(long userId) {
        if (userId < 1) {
            throw new ValidationException("Id не может быть отрицательным");
        }
        repository.deleteUserById(userId);
    }

    private boolean isValidEmail(String email) {
        String regex = "^.+@.+\\..+$";
        return Pattern.matches(regex, email);
    }
}
