package ac.su.kdt.boardjpa.repository;

import ac.su.kdt.boardjpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
