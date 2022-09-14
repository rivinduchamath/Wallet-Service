package com.cloudofgoods.auth.service.impl;

import com.cloudofgoods.auth.dao.RoleDetailsRepository;
import com.cloudofgoods.auth.entity.Role;
import com.cloudofgoods.auth.service.RoleDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@RequiredArgsConstructor
@Service
public class RoleDetailsServiceImpl implements RoleDetailsService {

    private final RoleDetailsRepository roleDetailRepository;





    @Override
    public String createRole(String roleName) {
        Role yourObject = roleDetailRepository.save(new Role(null, roleName));
        if (!ObjectUtils.isEmpty(yourObject)) {
            return "Role Save Successfully";
        } else {
            return "Role Save Fail";
        }
    }

    @Override
    @Transactional
    public int removeRole(String roleName) {
        return roleDetailRepository.deleteRoleByName(roleName);

    }
}
