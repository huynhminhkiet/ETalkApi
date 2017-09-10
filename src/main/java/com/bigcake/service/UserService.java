package com.bigcake.service;

import com.bigcake.model.User;
import com.bigcake.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Bigcake on 9/9/2017
 */

@Service
public class UserService implements UserDetailsService{
    private UserRepository mUserRepository;

    @Autowired
    public UserService(UserRepository mUserRepository) {
        this.mUserRepository = mUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = mUserRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }else{
            return new org.springframework.security.core.userdetails.User(
                            user.getUsername(),
                            user.getPassword(),
                            user.getAuthorities());
        }
    }

    public User getUserLoggedIn() {
        SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return mUserRepository.findByUsername((String) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
