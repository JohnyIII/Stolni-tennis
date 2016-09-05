package cz.pavelchraska.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.pavelchraska.jba.entity.Blog;
import cz.pavelchraska.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

	List<Item> findByBlog(Blog blog);
}
