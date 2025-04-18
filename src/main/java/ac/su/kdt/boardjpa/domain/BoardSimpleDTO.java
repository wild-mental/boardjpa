package ac.su.kdt.boardjpa.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BoardSimpleDTO {
    // 데이터 응답에 포함하고 싶은 필드 구성을 용도별로 자유롭게 커스터 마이징
    private Long bno;
    private String title;
    private LocalDateTime createdAt;

    public static List<BoardSimpleDTO> fromEntity(List<Board> boards) {
        List<BoardSimpleDTO> dtos = new ArrayList<>();
        for (Board board : boards) {
            BoardSimpleDTO dto = new BoardSimpleDTO();
            dto.bno = board.getBno();
            dto.title = board.getTitle();
            dto.createdAt = board.getCreatedAt();
            dtos.add(dto);
        }
        return dtos;
    }
}
