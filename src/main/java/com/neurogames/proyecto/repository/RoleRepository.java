package com.neurogames.proyecto.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neurogames.proyecto.models.ERole;
import com.neurogames.proyecto.models.Role;

//import com.bezkoder.springjwt.models.ERole;
//import com.bezkoder.springjwt.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
