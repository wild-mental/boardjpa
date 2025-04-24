package ac.su.kdt.boardjpa.controller;

import ac.su.kdt.boardjpa.domain.User;
import ac.su.kdt.boardjpa.domain.UserBMIDTO;
import ac.su.kdt.boardjpa.domain.UserHeightWeightDTO;
import ac.su.kdt.boardjpa.domain.UserResponseDTO;
import ac.su.kdt.boardjpa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/bmi")  // BMI formula: weight(kg) / height(m)^2
    public Page<UserBMIDTO> findAll4(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "5") int size) {
        return userService.findAllBMIDTO(page, size);
    }

    // TODO: 직접 CRUD 메서드를 완성해 봅시다!
//    @PostMapping
//    public User create(@RequestBody User user) {
//        return null;
//    }
}
