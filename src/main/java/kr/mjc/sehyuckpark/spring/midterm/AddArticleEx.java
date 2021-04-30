package kr.mjc.sehyuckpark.spring.midterm;

import kr.mjc.sehyuckpark.java.jdbc.article.Article;
import kr.mjc.sehyuckpark.java.jdbc.article.ArticleDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class AddArticleEx {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ArticleDao articleDao = context.getBean(ArticleDao.class);

        Article article = new Article();
        article.setTitle("Midterm Title");
        article.setContent("""
        New Content
        WebProgramming 8th week
        """);
        article.setUserId(114);
        article.setName("SehyuckPark");
        articleDao.addArticle(article);
        log.debug("Article Added.");
    }
}
