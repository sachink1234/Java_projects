package com.example.jwttokenexample.service;


import com.example.jwttokenexample.models.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {


    List<Users> store=new ArrayList<>();


    public UserService(){
        store.add(new Users(UUID.randomUUID().toString(), "Sachin Kumar", "sachin@vitraya.com"));
        store.add(new Users(UUID.randomUUID().toString(), "Virat Kholi", "virat@vitraya.com"));
        store.add(new Users(UUID.randomUUID().toString(), "Rohit Sharma", "rohit@vitraya.com"));
        store.add(new Users(UUID.randomUUID().toString(), "Ms dhoni", "msdhoni@vitraya.com"));

    }

    public List<Users> getUsers(){
        return this.store;
    }

}
