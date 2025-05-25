package ac.su.kdt.boardjpa.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private String username;  //  로그인용 아이디
    @Column
    private String name;

    @Column
    private String email;

    @Column
    private Integer height;

    @Column
    private Integer weight;

    @OneToMany(
        mappedBy = "user",
        cascade = CascadeType.ALL, orphanRemoval = true,
        fetch = FetchType.LAZY
    )
    private List<Board> boards = new ArrayList<>();
}
