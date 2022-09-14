package com.cloudofgoods.auth.dto;

import com.cloudofgoods.auth.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "auth_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO implements SuperEntity {
    public static final int ROLE_user = 3;
    public static final int ROLE_admin = 1;
    public static final int ROLE_operator = 2;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name", unique = true)
    private String name;



    public RoleDTO(RoleDTO roleDTO) {
        this.id = roleDTO.getId();
        this.name = roleDTO.getName();

    }

}
