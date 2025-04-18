package ac.su.kdt.boardjpa.service;

import ac.su.kdt.boardjpa.domain.Board;
import ac.su.kdt.boardjpa.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public Page<Board> searchByTitle(String keyword, Pageable pageable) {
        return boardRepository.findByTitleContainingOrderByBnoDesc(keyword, pageable);
    }

    public Board save(Board board) {
        return boardRepository.save(board);
    }

    public Board getById(Long id) {
        return boardRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        boardRepository.deleteById(id);
    }
}