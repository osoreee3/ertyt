package com.example.sbb.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.zip.DataFormatException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String password, String email) {

        SiteUser siteuser = new SiteUser();
        siteuser.setUsername(username);
        siteuser.setPassword(passwordEncoder.encode(password));
        siteuser.setEmail(email);
        this.userRepository.save(siteuser);
        return siteuser;
    }

    public SiteUser getUser(String username){
        Optional<SiteUser> siteUser = this.userRepository.findByusername(username);
        if(siteUser.isPresent()){
            return siteUser.get();
        } else {
          return null;
        }
    }
}
