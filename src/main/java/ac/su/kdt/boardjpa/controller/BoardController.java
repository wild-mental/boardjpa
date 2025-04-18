package ac.su.kdt.boardjpa.controller;

import ac.su.kdt.boardjpa.domain.Board;
import ac.su.kdt.boardjpa.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping
    public Board create(@RequestBody Board board) {
        return boardService.save(board);
    }

    @GetMapping("/{id}")
    public Board read(@PathVariable Long id) {
        return boardService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        boardService.delete(id);
    }

    @GetMapping("/search")
    public Page<Board> search(@RequestParam String keyword,
                              @RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "10") int size) {
        return boardService.searchByTitle(keyword, PageRequest.of(page, size));
    }
}