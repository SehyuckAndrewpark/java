package kr.mjc.sehyuckpark.spring.midterm;

import kr.mjc.sehyuckpark.java.jdbc.article.Article;
import kr.mjc.sehyuckpark.java.jdbc.article.ArticleDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class UpdateArticleEx {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        ArticleDao articleDao = context.getBean(ArticleDao.class);

        Article article = new Article();
        article.setArticleId(384);
        article.setTitle("Midterm Update");
        article.setContent("Update Test");
        article.setUserId(114);

        int updatedRows = articleDao.updateArticle(article);
        if (updatedRows > 0)
            log.debug("Article Updated");
        else
            log.debug("Update Failed");
    }
}
