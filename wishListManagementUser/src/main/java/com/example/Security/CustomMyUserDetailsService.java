package com.example.Security;


import com.example.Model.MyUser;
import com.example.Repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomMyUserDetailsService implements UserDetailsService {
    @Autowired
    private MyUserRepository myUserRepository;




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUser myUser = myUserRepository.findByUsername(username);

        if(myUser == null){
            throw new UsernameNotFoundException("MyUser not found..");
        }
        return new CustomMyUserDetails(myUser);
    }
}
