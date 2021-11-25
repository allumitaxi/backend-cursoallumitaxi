package ec.mil.ec.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.ec.api.models.Post;

public interface PostRepository extends JpaRepository<Post,Long> {
    
}
