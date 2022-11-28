package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleService {
    void addRole(Role role);

    void deleteRoleByID(long id);

    Role getRole(Long id);

    List<Role> getRoles();
    Role getName();
}
