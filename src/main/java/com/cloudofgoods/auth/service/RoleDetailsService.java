package com.cloudofgoods.auth.service;

public interface RoleDetailsService {


    String createRole(String roleName);

    int removeRole(String roleName);


}
