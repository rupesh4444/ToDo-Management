package com.example.rupesh.ToDo.service;

public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String email, String password);
}
