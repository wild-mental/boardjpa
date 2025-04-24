package ac.su.kdt.boardjpa.repository;

import ac.su.kdt.boardjpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

// DAO (Data Access Object) interface : 데이터 접근 객체
public interface UserRepository extends JpaRepository<User, Long> {
}
