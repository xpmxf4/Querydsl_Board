package HailYoungHan.Board.repository.comment;


import HailYoungHan.Board.dto.comment.query.CommentDbDTO;

import java.util.List;

public interface CommentCustomRepository {


    CommentDbDTO findDTOById(Long commentId);

    List<CommentDbDTO> findAllDTOs();

    public List<CommentDbDTO> findAllDTOsByMemberId(Long memberId);

    List<CommentDbDTO> findAllDeletedDTOsByMemberId(Long memberId, boolean isDeleted);

}
