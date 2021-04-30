package kr.mjc.sehyuckpark.java.jdbc.articlepark;

import kr.mjc.sehyuckpark.java.jdbc.DataAccessException;

public class UpdateArticleEx {
    public static void main(String[] args) {
        ArticleDao articleDao = new ArticleDaoImplUsingDbUtils();
        try {
            Article article = articleDao.getArticle(230);
            article.setTitle("WP II homework Updated");
            article.setContent("MJC Updated");
            article.setName("SehyuckPark");
            int update = articleDao.updateArticle(article);
            System.out.println("Article Added");
        } catch (DataAccessException e) {
            System.err.println(e.getMessage());
        }
    }
}

