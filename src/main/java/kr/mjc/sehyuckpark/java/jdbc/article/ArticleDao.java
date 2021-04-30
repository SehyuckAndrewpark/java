package kr.mjc.sehyuckpark.java.jdbc.article;

import java.util.List;

public interface ArticleDao {

    List<Article> listArticles(int offset, int count);

    default Article getArticle(int articleId) {
        return null;
    }

    void addArticle(Article article);

    default int updateArticle(Article article) {
        return 0;
    }

    default int deleteArticle(int articleId, int userId) {
        return 0;
    }
}