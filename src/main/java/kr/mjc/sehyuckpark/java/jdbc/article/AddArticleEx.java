package kr.mjc.sehyuckpark.java.jdbc.article;

public class AddArticleEx {
    public static void main(String[] args) {
    ArticleDao articleDao = new ArticleDaoImpl();
    Article article = new Article();
    article.setTitle("TITLE: \"ArticleTest\"");
    article.setContent(
        "Jacob's Article \"CONTENT\"");
    article.setUserId(114);
    article.setName("SehyuckPark");
    articleDao.addArticle(article);
    System.out.println("Article Added.");
    }
}
