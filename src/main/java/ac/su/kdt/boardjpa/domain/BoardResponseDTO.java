package ac.su.kdt.boardjpa.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BoardResponseDTO {
    private Long bno;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // 순환 참조 해소만을 위해서라면 아래 필드는 없애도 됨
    // Board 를 포함하지 않은 참조 대상 DTO
    private UserSimpleDTO user;

    public BoardResponseDTO(Board board) {
        bno = board.getBno();
        title = board.getTitle();
        content = board.getContent();
        createdAt = board.getCreatedAt();
        updatedAt = board.getUpdatedAt();
        user = new UserSimpleDTO(board.getUser());
    }

    public static BoardResponseDTO fromEntity(Board board) {
        return new BoardResponseDTO(board);
    }
}
