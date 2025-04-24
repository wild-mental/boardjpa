package ac.su.kdt.boardjpa.domain;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserBMIDTO {
    private Long id;
    private String name;
    private String email;
    private Double bmi;

    public UserBMIDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.bmi = calculateBMI(user.getHeight(), user.getWeight());
    }

    private Double calculateBMI(Integer height, Integer weight) {
        if (height == null || weight == null || height == 0) {
            return null; // BMI cannot be calculated
        }
        double heightInMeters = height / 100.0; // Convert height to meters
        return weight / (heightInMeters * heightInMeters);
    }

    public static UserBMIDTO fromEntity(User user) {
        return new UserBMIDTO(user);
    }
}
