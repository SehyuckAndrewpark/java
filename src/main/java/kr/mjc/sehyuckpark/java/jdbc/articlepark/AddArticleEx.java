package kr.mjc.sehyuckpark.java.jdbc.articlepark;

import kr.mjc.sehyuckpark.java.jdbc.DataAccessException;

public class AddArticleEx {

    public static void main(String[] args) {
        ArticleDao articleDao = new ArticleDaoImplUsingDbUtils();
        Article article = new Article();
        article.setTitle("Web Programming II homework final");
        article.setContent("cdate and udate");
        article.setUserId(114);
        article.setName("SehyuckPark");
        try {
            articleDao.addArticle(article);
            System.out.format("Article Added : %s\n", article);
        } catch (DataAccessException e) {
            System.err.println(e.getMessage());
        }
    }
}
