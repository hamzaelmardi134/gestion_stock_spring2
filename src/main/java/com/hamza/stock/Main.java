package com.hamza.stock;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hamza.stock.dao.IArticleDao;
import com.hamza.stock.entities.Article;
import com.hamza.stock.services.IArticleService;
import com.hamza.stock.services.impl.ArticleServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IArticleService service = context.getBean(ArticleServiceImpl.class);
		
		Article article = new Article();
		article.setCodeArticle("1X");
		article.setDesignation("iPhone XS 64G");
		
		BigDecimal decimal = new BigDecimal(4343.3);
		article.setPrixUnitaire(decimal);
		
		service.save(article);
		

	}

}
