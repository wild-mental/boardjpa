package ac.su.kdt.boardjpa.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;

    // 순환 참조 해소만을 위해서라면 아래 필드는 없애도 됨
    private List<BoardSimpleDTO> boards = new ArrayList<>();
    // 게시물 작성 수 등 추가 컬럼 원할 경우 등에는
    // 용도에 맞추어서 커스터마이징 하면 됨
    // 값을 초기화하는 메서드 필요

    public static UserResponseDTO fromEntity(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.id = user.getId();
        dto.name = user.getName();
        dto.email = user.getEmail();
        dto.boards = BoardSimpleDTO.fromEntity(user.getBoards());
        return dto;
    }
}
