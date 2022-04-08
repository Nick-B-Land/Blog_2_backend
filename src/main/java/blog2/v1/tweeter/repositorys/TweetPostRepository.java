package blog2.v1.tweeter.repositorys;

import blog2.v1.tweeter.model.TweetPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetPostRepository extends JpaRepository<TweetPost, Long> {
}
