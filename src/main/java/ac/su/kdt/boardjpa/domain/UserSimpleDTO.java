package ac.su.kdt.boardjpa.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSimpleDTO {
    private Long id;
    private String name;
    private String email;

    public UserSimpleDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
    }
}
