package vn.bosch.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.bosch.ecommerce.io.entities.Article;
import vn.bosch.ecommerce.service.ArticleService;

@RestController
@RequestMapping("/api/article")
public class ArticleController {
	@Autowired
	   ArticleService articleService;
		
	   @GetMapping
	   public ResponseEntity<Object> getAll() {
	      return new ResponseEntity<>(articleService.getAll(), HttpStatus.OK);
	   }
	   
	   @PostMapping
	   public ResponseEntity<Object> save(@RequestBody Article article) {
		  articleService.save(article);
	      return new ResponseEntity<>("Article is saved successfully", HttpStatus.CREATED);
	   }

	   @PutMapping
	   public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody Article article) {
		  articleService.update(id, article);
	      return new ResponseEntity<>("Article is updated successfully", HttpStatus.CREATED);
	   }
	   
	   @DeleteMapping("/{id}")
	   public ResponseEntity<Object> delete(@PathVariable("id") Long id) { 
		   articleService.delete(id);
	      return new ResponseEntity<>("Article is deleted successsfully", HttpStatus.OK);
	   }
	   
	   @GetMapping("/{id}")
	   public ResponseEntity<Object> get(@PathVariable("id") Long id) {
	      return new ResponseEntity<>(articleService.findById(id), HttpStatus.OK);
	   }
	   @GetMapping("/{id}/comments")
	   public ResponseEntity<Object> getArticleComments(@PathVariable("id") Long id) {
		   return new ResponseEntity<>(articleService.getArticleComments(id), HttpStatus.OK);
	   }
}
