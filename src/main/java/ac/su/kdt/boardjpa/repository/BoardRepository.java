package ac.su.kdt.boardjpa.repository;

import ac.su.kdt.boardjpa.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    // 제목에 특정 키워드가 포함된 게시글을 bno 기준으로 내림차순 정렬
    Page<Board> findByTitleContainingOrderByBnoDesc(String keyword, Pageable pageable);
}