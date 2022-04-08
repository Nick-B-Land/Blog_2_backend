package blog2.v1.tweeter.controllers;

import blog2.v1.tweeter.model.TweetPost;
import blog2.v1.tweeter.repositorys.TweetPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/tweet")
public class TweetPostController {

    @Autowired
    TweetPostRepository tweetPostRepository;

    @GetMapping("/all")
    public List<TweetPost> getAllPosts () {
        return tweetPostRepository.findAll();
    }

    @PostMapping("/new")
    public TweetPost createTweetPost(@RequestBody TweetPost tweetPost) {
        return tweetPostRepository.save(tweetPost);
    }
}
