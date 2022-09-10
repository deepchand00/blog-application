package com.example.blogapp.payloads;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Data
public class UserDto {

    private int id;

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Email(message = "Email address is not valid")
    private String email;

    @NotEmpty
    @Size(min = 3, max = 10, message = "Password length must be from 3-10 characters")
    private String password;

    @NotEmpty
    @Size(min = 10, max = 100)
    private String about;

    private Set<RoleDto> roles = new HashSet<>();

}
