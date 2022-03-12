package com.org.inventory.security.services;





import com.org.inventory.model.User;
import com.org.inventory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = null;
        if(username.equalsIgnoreCase("buyer")){
            user = new User();
            user.setUsername("Buyer");
            user.setPassword("buyer");
            user.setEmail("buyer@gmail.com");
            user.setRole(Arrays.asList("ROLE_USER"));
        }

     /* *//*  User user = userRepository.findAll().forEach(c -> c.getUsername().equalsIgnoreCase(username))
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));*//*

        List<User> users = userRepository.findAll().forEach(c -> users.add(c));*/




        return UserDetailsImpl.build(user);
    }
}
