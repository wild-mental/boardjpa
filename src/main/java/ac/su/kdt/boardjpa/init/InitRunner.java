package ac.su.kdt.boardjpa.init;

import ac.su.kdt.boardjpa.domain.Board;
import ac.su.kdt.boardjpa.repository.BoardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local") // 로컬 환경에서만 실행되도록 설정
public class InitRunner implements CommandLineRunner {

    private final BoardRepository boardRepository;

    public InitRunner(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public void run(String... args) {
        // 게시글이 하나도 없을 경우에만 생성
        if (boardRepository.count() == 0) {
            for (int i = 1; i <= 30; i++) {
                Board board = new Board();
                board.setTitle("샘플 게시글 제목 " + i);
                board.setContent("이것은 CommandLineRunner로 생성된 더미 게시글입니다. 번호: " + i);
                board.setWriter("wild");
                boardRepository.save(board);
            }

            System.out.println("📌 게시글 30개 자동 생성 완료!");
        } else {
            System.out.println("✅ 기존 게시글이 존재하므로 초기화 작업을 건너뜁니다.");
        }
    }
}