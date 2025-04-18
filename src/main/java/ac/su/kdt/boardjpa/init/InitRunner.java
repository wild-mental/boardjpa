package ac.su.kdt.boardjpa.init;

import ac.su.kdt.boardjpa.domain.Board;
import ac.su.kdt.boardjpa.domain.User;
import ac.su.kdt.boardjpa.repository.BoardRepository;
import ac.su.kdt.boardjpa.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Profile("local") // 로컬 환경에서만 실행되도록 설정
public class InitRunner implements CommandLineRunner {

    private final BoardRepository boardRepository;
    private final UserRepository userRepository;

    public InitRunner(BoardRepository boardRepository, UserRepository userRepository) {
        this.boardRepository = boardRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        // 기존 데이터 유무 검사
        if (
            userRepository.count() == 0 &&
            boardRepository.count() == 0
        ) {
            // User 10 명 생성
            List<User> userList = new ArrayList<>();
            for  (int i = 1; i <= 10; i++) {
                User user = new User();
                user.setName("user" + i);
                user.setEmail("email" + i);

                // 각 유저에 게시물 5 개 생성
                List<Board> boardList = new ArrayList<>();
                for  (int j = 1; j <= 5; j++) {
                    Board board = new Board();
                    board.setTitle("user No." + i + "'s board item No." + j);
                    board.setContent("유저 넘버" + i + "번의 "  + j + "번 더미 게시판 데이터");
                    board.setUser(user);
                    boardList.add(board);
                }
                user.setBoards(boardList);
                userList.add(user);
            }
            userRepository.saveAll(userList);

            System.out.println("[데이터 생성 완료] 유저 10명, 게시글 5개 생성!");
        } else {
            System.out.println("[데이터 생성 스킵] 기존 데이터가 존재합니다!");
        }

    }
}