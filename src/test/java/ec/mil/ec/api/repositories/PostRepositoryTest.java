package ec.mil.ec.api.repositories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ec.mil.ec.api.models.Post;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PostRepositoryTest {
    @Autowired
    private PostRepository postRepository;
    
    @Test
    public void Guardar(){
        Post post = new Post();
        post.setTitle("Titulo Demo");
        //postRepository.save(post);
        Assert.assertEquals(post.getTitle(),postRepository.save(post).getTitle());
    }
}
