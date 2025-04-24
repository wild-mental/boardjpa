package ac.su.kdt.boardjpa.controller;

import ac.su.kdt.boardjpa.domain.User;
import ac.su.kdt.boardjpa.domain.UserHeightWeightDTO;
import ac.su.kdt.boardjpa.domain.UserResponseDTO;
import ac.su.kdt.boardjpa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    // get all user data list endpoint below
    @GetMapping
    public Page<User> findAll(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "5") int size) {
        return userService.findAll(page, size);
    }

    @GetMapping("/dto")
    public Page<UserResponseDTO> findAll2(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "5") int size) {
        return userService.findAllDTO(page, size);
    }

    @GetMapping("/height-weight")
    public Page<UserHeightWeightDTO> findAll3(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "5") int size) {
        return userService.findAllHWDTO(page, size);
    }
}
