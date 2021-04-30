package kr.mjc.sehyuckpark.java.jdbc.articlepark;

import kr.mjc.sehyuckpark.java.jdbc.DataAccessException;

public class DeleteArticleEx {
    public static void main(String[] args) {
        ArticleDao articleDao = new ArticleDaoImplUsingDbUtils();
        try {
            Article article = articleDao.getArticle(231);
            article.setTitle("Deleted Article");
            article.setContent("Deleted Article");
            article.setName("Deleted Article");
            int update = articleDao.updateArticle(article);
        } catch (DataAccessException e) {
            System.err.println(e.getMessage());
        }
        ArticleDao articleDao2 = new ArticleDaoImplUsingDbUtils();
        try {
            int delete = articleDao2.deleteArticle(231, 114);
        } catch (DataAccessException e) {
            System.err.println(e.getMessage());
        }
    }
}
