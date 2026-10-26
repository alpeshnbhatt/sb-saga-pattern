package alp.com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alp.com.entity.Role;
import alp.com.entity.User;
import alp.com.service.RoleService;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

	private RoleService roleService;

	public RoleController(RoleService roleService) {
		this.roleService = roleService;
	}

	@GetMapping("all")
	public List<Role> getAllUsers() {
		return roleService.getAllRoles();
	}
}
