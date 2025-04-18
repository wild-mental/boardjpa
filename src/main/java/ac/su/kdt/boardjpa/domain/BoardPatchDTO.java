package ac.su.kdt.boardjpa.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardPatchDTO {
    // 기본형 DTO 로 Nullable 한 객체 핸들링
    private String title;
    private String content;
//    private String writer;
    private User user;
}
