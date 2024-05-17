package com.benh.springboot.mywebapp.login;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {

    public boolean authenticate(String name, String password) {
        return name.equalsIgnoreCase("ben") && password.equalsIgnoreCase("dummy");
    }

}
