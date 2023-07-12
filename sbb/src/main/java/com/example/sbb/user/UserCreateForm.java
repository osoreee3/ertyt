package com.example.sbb.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserCreateForm {

    @NotEmpty
    private String username;

    @NotEmpty
    private String password1;

    @NotEmpty
    private String password2;

    @NotEmpty
    @Email
    private String email;
}
