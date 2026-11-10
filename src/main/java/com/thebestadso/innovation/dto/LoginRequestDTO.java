package com.thebestadso.innovation.dto;

import lombok.Data;

@Data 
public class LoginRequestDTO {

    @NotBlank
    private String username;

    @NotBlank
    @Email
    private String email;


    @NotBlank
    private String password;

    
}