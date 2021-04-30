package kr.mjc.sehyuckpark.java.jdbc.articlepark;

import java.util.List;

public interface ArticleDao {

    List<Article> listArticles(int offset, int count);

    Article getArticle(int articleId);

    void addArticle(Article article);

    int updateArticle(Article article);

    int deleteArticle(int articleId, int userId);
}