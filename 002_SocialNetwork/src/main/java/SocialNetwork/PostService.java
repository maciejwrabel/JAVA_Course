package SocialNetwork;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostService {
	@Autowired
	PostRepository postRepository;

	@Autowired
	UserRepository userRepository;

	@PostMapping("/posts")
	public ResponseEntity addPost(@RequestHeader("username") String username, @RequestBody String postBody) {
		Optional<User> userFromDb = userRepository.findByUsername(username);

		if (userFromDb.isEmpty()) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}

		Post post = new Post();
		// Post post = new Post (userFromDb.get(), postBody); // episode 4, time 15:03
		Post savePost = postRepository.save(post);

		return ResponseEntity.ok(savePost);

	}

}
