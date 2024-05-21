package ru.practicum.ewm.dto.stats;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Long id;

    @NotBlank( message = "Имя не может быть пустым")
    private String name;

    @NotBlank(message = "Электронная почта не может быть пустым")
    @Email(message = "электронная почта не может быть пустой и должна содержать символ @")
    private String email;
}