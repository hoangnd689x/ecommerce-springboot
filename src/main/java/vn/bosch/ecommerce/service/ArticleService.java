package vn.bosch.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.io.entities.Article;
import vn.bosch.ecommerce.model.response.GetAllArticlesModel;
import vn.bosch.ecommerce.model.response.GetArticleCommentsModel;

public interface ArticleService {
	ArrayList<GetAllArticlesModel> getAll();

	void save(Article article);

	void update (Long id, Article article);
	
	void delete(Long id);
	
	Optional<Article> findById(Long id);

	ArrayList<GetArticleCommentsModel> getArticleComments(Long id);
}
