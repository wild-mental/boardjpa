package ac.su.kdt.boardjpa.service;

import ac.su.kdt.boardjpa.domain.Board;
import ac.su.kdt.boardjpa.domain.BoardPatchDTO;
import ac.su.kdt.boardjpa.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceDeprecated {
//
//    @Autowired
//    private BoardRepository boardRepository;
//
//    public Page<Board> searchByTitle(String keyword, Pageable pageable) {
//        return boardRepository.findByTitleContainingOrderByBnoDesc(keyword, pageable);
//    }
//
//    public Page<Board> readListByPage(Pageable pageable) {
//        return boardRepository.findAll(pageable);
//    }
//
//    // create 로 메서드명 변경해서 직관성 개선 가능
//    public Board save(Board board) {
//        return boardRepository.save(board);
//    }
//
//    public Board getById(Long id) {
//        return boardRepository.findById(id).orElse(null);
//    }
//
//    public void delete(Long id) {
//        boardRepository.deleteById(id);
//    }
//
//    public Board update(Long id, Board board) {
//        Board existingBoard = getById(id);
//        existingBoard.setTitle(board.getTitle());
//        existingBoard.setContent(board.getContent());
//        existingBoard.setWriter(board.getWriter());
//        return boardRepository.save(existingBoard);
//    }
//
//    public Board updatePatch(Long id, BoardPatchDTO boardDto) {
//        Board existingBoard = getById(id);
//        if (boardDto.getTitle() != null) {
//            existingBoard.setTitle(boardDto.getTitle());
//        }
//        if (boardDto.getContent() != null) {
//            existingBoard.setContent(boardDto.getContent());
//        }
//        if (boardDto.getWriter() != null) {
//            existingBoard.setWriter(boardDto.getWriter());
//        }
//        return boardRepository.save(existingBoard);
//    }
}