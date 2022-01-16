package com.assignment.leePharmacy.pharmacyApplication.service;

import com.assignment.leePharmacy.pharmacyApplication.model.LoginDetails;
import com.assignment.leePharmacy.pharmacyApplication.model.Pharmacist;
import com.assignment.leePharmacy.pharmacyApplication.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginDetailsService implements UserDetailsService {
    @Autowired
    UserLoginRepository loginRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Pharmacist> pharmacist = loginRepository.findPharmacistBypEmail(userName);
        pharmacist.orElseThrow(() -> new IllegalArgumentException("User Not Found: "+userName));
        return pharmacist.map(LoginDetails::new).get();
    }



}
