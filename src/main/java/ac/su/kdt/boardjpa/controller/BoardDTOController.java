package ac.su.kdt.boardjpa.controller;

import ac.su.kdt.boardjpa.domain.BoardResponseDTO;
import ac.su.kdt.boardjpa.service.BoardDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/boards")
public class BoardDTOController {

    @Autowired
    private BoardDTOService boardDTOService;

    @GetMapping
    public ResponseEntity<Page<BoardResponseDTO>> findAll(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "15") int size
    ) {
        return ResponseEntity
            .ok()
            .body(boardDTOService.readListByPage(PageRequest.of(page, size)));
    }
}
