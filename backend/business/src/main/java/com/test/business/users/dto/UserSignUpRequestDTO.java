package com.test.business.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSignUpRequestDTO {
    private String username;
    private String email;
    private String password;
}
