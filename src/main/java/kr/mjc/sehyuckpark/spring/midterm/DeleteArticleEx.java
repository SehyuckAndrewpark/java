package kr.mjc.sehyuckpark.spring.midterm;

import kr.mjc.sehyuckpark.java.jdbc.article.ArticleDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class DeleteArticleEx {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        ArticleDao articleDao = context.getBean(ArticleDao.class);

        int updatedRows = articleDao.deleteArticle(388, 114);
        if (updatedRows > 0)
            log.debug("Article Deleted");
        else
            log.error("Delete Failed");
    }
}
