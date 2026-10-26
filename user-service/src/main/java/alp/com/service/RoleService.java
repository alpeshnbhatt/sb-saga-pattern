package alp.com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import alp.com.entity.Role;
import alp.com.repository.RoleRepository;

@Service
public class RoleService {
	private final RoleRepository roleRepository;

	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}

}
