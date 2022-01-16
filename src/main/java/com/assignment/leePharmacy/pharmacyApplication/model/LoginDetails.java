package com.assignment.leePharmacy.pharmacyApplication.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LoginDetails implements UserDetails {
    private String userName;
    private String password;
    private boolean status;
    private List<GrantedAuthority> role;

    public LoginDetails(Pharmacist pharmacist){
        this.userName = pharmacist.getpName();
        this.password = pharmacist.getPharmacistLogin().getUserPassword();
        this.status = pharmacist.getPharmacistLogin().isStatus();
        this.role = Arrays.stream(pharmacist.getPharmacistLogin().getRole().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return status;
    }
}
