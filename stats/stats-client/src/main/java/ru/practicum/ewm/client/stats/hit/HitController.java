//package ru.practicum.ewm.client.stats.hit;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import ru.practicum.ewm.dto.stats.HitDto;
//
//
//import javax.validation.Valid;
//
//@Controller
//@RequestMapping(path = "/hit")
//@RequiredArgsConstructor
//@Validated
//public class HitController {
//    private final HitClient hitClient;
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public HitDto saveHit(@RequestBody @Valid HitDto hitDto) {
//        return hitClient.saveHit(hitDto);
//    }
//}
