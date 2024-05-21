package ru.practicum.ewm.admin.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Имя не может быть пустым")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Электронная почта не может быть пустым")
    @Email(message = "электронная почта не может быть пустой и должна содержать символ @")
    @Column(name = "email", unique = true)
    private String email;
}
