package kr.mjc.sehyuckpark.java.jdbc.article;

public class DeleteArticleEx {
    public static void main(String[] args) {
    ArticleDao articleDao = new ArticleDaoImpl();
   if (articleDao.deleteArticle(52, 2) > 0) {
      System.out.println("Article Deleted.");
    } else {
      System.out.println("Delete Error.");
    }
  }

}
