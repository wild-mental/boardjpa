package ac.su.kdt.boardjpa.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boards")
public class BoardControllerDeprecated {
//
//    @Autowired
//    private BoardServiceDeprecated boardService;
//
//    @PostMapping
//    public Board create(@RequestBody Board board) {
//        return boardService.save(board);
//    }
//
//    @PutMapping("/{id}")
//    public Board update(
//        @PathVariable Long id,
//        @RequestBody Board board) {
//        return boardService.update(id, board);
//    }
//
//    @PatchMapping("/{id}")
//    public Board updatePatch(
//        @PathVariable Long id,
//        @RequestBody BoardPatchDTO board) {
//        return boardService.updatePatch(id, board);
//    }
//
//    @GetMapping("/{id}")
//    public Board read(@PathVariable Long id) {
//        return boardService.getById(id);
//    }
//
//    @GetMapping
//    public Page<Board> list(
//        @RequestParam(defaultValue = "0") int page,
//        @RequestParam(defaultValue = "15") int size
//    ) {
//        return boardService.readListByPage(PageRequest.of(page, size));
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        boardService.delete(id);
//    }
//
//    @GetMapping("/search")
//    public Page<Board> search(@RequestParam String keyword,
//                              @RequestParam(defaultValue = "0") int page,
//                              @RequestParam(defaultValue = "10") int size) {
//        return boardService.searchByTitle(keyword, PageRequest.of(page, size));
//    }
}