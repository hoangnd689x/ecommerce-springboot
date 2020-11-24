package vn.bosch.ecommerce.service.Impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.io.entities.Article;
import vn.bosch.ecommerce.io.entities.Comment;
import vn.bosch.ecommerce.io.repositories.ArticleRepository;
import vn.bosch.ecommerce.model.response.GetAllArticlesModel;
import vn.bosch.ecommerce.model.response.GetAllProductModel;
import vn.bosch.ecommerce.model.response.GetArticleCommentsModel;
import vn.bosch.ecommerce.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{
	
	@Autowired 
	private ArticleRepository articleRepository; 
	
	@Override
	public ArrayList<GetAllArticlesModel> getAll() {
		ArrayList<Article> articles = (ArrayList<Article>) articleRepository.findAll();
		ArrayList<GetAllArticlesModel> returnValue = new ArrayList<GetAllArticlesModel>();
		for(Article article:articles){
			GetAllArticlesModel temp = new GetAllArticlesModel();
			temp.setContent(article.getContent());
			temp.setCreatedDate(article.getCreatedDate());
			temp.setPoster(article.getCreatedBy().getUserName());
			temp.setTitle(article.getArticleTitle());
			returnValue.add(temp);
		}
		return returnValue;
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
	@Override
	public ArrayList<GetArticleCommentsModel> getArticleComments(Long id){
		Article existedArticle = articleRepository.getArticleByArticleId(id);
		ArrayList<Comment> articleComments = new ArrayList<>(existedArticle.getComments());
		ArrayList<GetArticleCommentsModel> returnValue = new ArrayList<GetArticleCommentsModel>();
		for(Comment comment:articleComments){
			GetArticleCommentsModel temp = new GetArticleCommentsModel();
			temp.setContent(comment.getCommentContent());
			temp.setCreatedDate(comment.getCreatedAt());
			temp.setPoster(comment.getEmail().getUserName());
			returnValue.add(temp);
		}
		return returnValue;
	}

}
