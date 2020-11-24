package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
    Article getArticleByArticleId(Long id);
}
