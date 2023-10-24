package HailYoungHan.Board.repository.post;

import HailYoungHan.Board.dto.post.PostDTO;
import HailYoungHan.Board.dto.post.PostUpdateDTO;

import java.util.List;

public interface PostCustomRepository {

    List<PostDTO> findPostsByMemberId(Long memberId);

    List<PostDTO> findDeletedPostsByMemberId(Long memberId);

    PostDTO findDTObyId(Long id);

    List<PostDTO> findAllDTOs();
}
