package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.io.entities.Article;

public interface ArticleService {
	List<Article> getAll();

	void save(Article article);

	void update (Long id, Article article);
	
	void delete(Long id);
	
	Optional<Article> findById(Long id);
}
