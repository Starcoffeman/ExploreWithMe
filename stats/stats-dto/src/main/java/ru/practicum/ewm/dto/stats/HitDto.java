package ru.practicum.ewm.dto.stats;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HitDto {

    private Long id;

    @NotBlank(message = "App не может быть пустым")
    private String app;

    @NotBlank(message = "Uri не может быть пустым")
    private String uri;

    //    @NotNull(message = "IP не может быть null")
    @NotBlank(message = "Uri не может быть пустым")
    private String ip;

    @NotBlank(message = "Uri не может быть пустым")
//    @NotNull(message = "Timestamp не может быть null")
    private String timestamp;
}