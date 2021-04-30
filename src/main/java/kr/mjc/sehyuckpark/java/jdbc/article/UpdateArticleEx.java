package kr.mjc.sehyuckpark.java.jdbc.article;

public class UpdateArticleEx {
    public static void main(String[] args) {
    ArticleDao articleDao = new ArticleDaoImpl();
    Article article = new Article();
    article.setArticleId(52);
    article.setTitle("Title Update");
    article.setContent("Content Update");
    article.setUserId(2);
   if (articleDao.updateArticle(article) > 0) {
      System.out.println("Article Updated.");
    } else {
      System.out.println("Update Error.");
    }
  }

}
