//package ru.practicum.ewm.client.stats.admin;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import ru.practicum.ewm.client.stats.hit.HitClient;
//import ru.practicum.ewm.dto.stats.HitDto;
//import ru.practicum.ewm.dto.stats.UserDto;
//
//import javax.validation.Valid;
//
//@Controller
//@RequestMapping(path = "/admin/users")
//@RequiredArgsConstructor
//@Validated
//public class AdminController {
//    private final AdminClient adminClient;
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public UserDto saveUsers(@RequestBody @Valid UserDto userDto) {
//        return adminClient.saveUser(userDto);
//    }
//}
