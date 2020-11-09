package vn.bosch.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.io.entities.Article;
import vn.bosch.ecommerce.io.repositories.ArticleRepository;
import vn.bosch.ecommerce.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{
	
	@Autowired 
	private ArticleRepository articleRepository; 
	
	@Override
	public List<Article> getAll() {
		return (List<Article>) articleRepository.findAll();
	}

	@Override
	public void save(Article article) {
		articleRepository.save(article);
	}

	@Override
	public void delete(Long id) {
		articleRepository.deleteById(id);
	}

	@Override
	public Optional<Article> findById(Long id) {
		return articleRepository.findById(id);
	}

	@Override
	public void update(Long id, Article article) {
		Optional<Article> existingObj = articleRepository.findById(id);
		if(existingObj.isPresent()) {
			article.setArticleId(id);
			articleRepository.save(article);
		}
	}

}
