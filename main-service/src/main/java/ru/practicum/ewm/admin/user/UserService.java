package ru.practicum.ewm.admin.user;


import ru.practicum.ewm.dto.stats.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    UserDto saveUser(UserDto userDto);

    UserDto getUserById(long userId);

    void deleteUserById(long userId);

}