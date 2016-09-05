package cz.pavelchraska.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.pavelchraska.jba.entity.Blog;
import cz.pavelchraska.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

	List<Blog> findByUser(User user);
	
}
