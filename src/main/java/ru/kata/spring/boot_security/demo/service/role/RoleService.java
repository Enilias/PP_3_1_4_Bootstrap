package ru.kata.spring.boot_security.demo.service.role;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@SuppressWarnings("unused")

public interface RoleService {
    List<Role> getRoles();

    void save(Role role);

    void delete(int id);

    Role getRole(int id);

    public Collection<Role> getCollectionsRoles(String[] rolesName);
}
