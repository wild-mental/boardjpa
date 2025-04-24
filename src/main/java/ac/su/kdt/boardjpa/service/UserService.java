package ac.su.kdt.boardjpa.service;

//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
import ac.su.kdt.boardjpa.domain.User;
import ac.su.kdt.boardjpa.domain.UserHeightWeightDTO;
import ac.su.kdt.boardjpa.domain.UserResponseDTO;
import ac.su.kdt.boardjpa.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

//@Bean
//@Component
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Page<User> findAll(int page, int size) {
        return userRepository.findAll(PageRequest.of(page, size));
    }

    public Page<UserResponseDTO> findAllDTO(int page, int size) {
        return userRepository
            .findAll(PageRequest.of(page, size))
            .map(UserResponseDTO::fromEntity);
    }

    public Page<UserHeightWeightDTO> findAllHWDTO(int page, int size) {
        return userRepository
            .findAll(PageRequest.of(page, size))
            .map(UserHeightWeightDTO::fromEntity);
    }
}
