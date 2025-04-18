package ac.su.kdt.boardjpa.service;

import ac.su.kdt.boardjpa.domain.Board;
import ac.su.kdt.boardjpa.domain.BoardResponseDTO;
import ac.su.kdt.boardjpa.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BoardDTOService {
    @Autowired
    private BoardRepository boardRepository;

    public Page<BoardResponseDTO> readListByPage(Pageable pageable) {
        Page<Board> boards = boardRepository.findAll(pageable);
        Page<BoardResponseDTO> boardDtos = boards.map(BoardResponseDTO::fromEntity);
        return boardDtos;
    }
}
