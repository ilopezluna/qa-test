package life.andjoy;

import life.andjoy.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {

	private final Map<String, User> usersRepository = new HashMap<String, User>();

	public User findOne(String userId) {
		return usersRepository.get(userId);
	}

	public User saveOrUpdate(User user) {
		return usersRepository.put(user.id, user);
	}

	public double avgAge() {

		int sum = usersRepository.values().stream().mapToInt(u -> u.age).sum();
		int size = usersRepository.size();

		return sum / size;
	}
}
