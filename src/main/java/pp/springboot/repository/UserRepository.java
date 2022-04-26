package pp.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pp.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
