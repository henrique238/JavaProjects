package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Post;

public interface Interface extends JpaRepository<Post, Long>{

	
	
}
