package ac.su.kdt.boardjpa.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserHeightWeightDTO {
    private Long id;
    private String name;
    private String email;
    private Integer height;
    private Integer weight;

    public UserHeightWeightDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
        height = user.getHeight();
        weight = user.getWeight();
    }

    public static UserHeightWeightDTO fromEntity(User user) {
        UserHeightWeightDTO dto = new UserHeightWeightDTO(user);
        return dto;
    }
}
