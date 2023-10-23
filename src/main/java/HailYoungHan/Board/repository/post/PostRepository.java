package HailYoungHan.Board.repository.post;

import HailYoungHan.Board.entity.Post;
//import io.hypersistence.utils.spring.repository.HibernateRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>,
//        HibernateRepository<Post>,
        PostCustomRepository {

}
