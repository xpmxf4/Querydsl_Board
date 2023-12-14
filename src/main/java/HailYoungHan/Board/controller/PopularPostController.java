package HailYoungHan.Board.controller;

import HailYoungHan.Board.dto.popularPost.response.PopularPostResponseDTO;
import HailYoungHan.Board.service.PopularPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/popularPost")
public class PopularPostController {

    private final PopularPostService service;

    @GetMapping
    public ResponseEntity<PopularPostResponseDTO> getPopularPosts() {
        PopularPostResponseDTO result = service.getPopularPosts();
        return ResponseEntity.ok(result);
    }
}
