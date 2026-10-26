package alp.com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import alp.com.entity.User;
import alp.com.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public User getReferenceById(long id) {

		return userRepository.getReferenceById(id);
	}

	public User updateUser(long id, User user) {

		User existing = getReferenceById(id);
		existing.setUsername(user.getUsername());
		existing.setEmail(user.getEmail());
		existing.setPassword(user.getPassword());
		existing.setRoles(user.getRoles());

		return save(existing);
	}

	public void deleteUser(long id) {
		userRepository.deleteById(id);
	}
	
}
