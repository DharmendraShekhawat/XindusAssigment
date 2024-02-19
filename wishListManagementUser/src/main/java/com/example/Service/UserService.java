package com.example.Service;

import com.example.Model.MyUser;
import com.example.Repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private MyUserRepository myUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;





    public MyUser signUp(MyUser myUser) {
        myUser.setPassword(passwordEncoder.encode(myUser.getPassword()));
       return myUserRepository.save(myUser);
    }


}
