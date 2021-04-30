package kr.mjc.sehyuckpark.java.jdbc.articlepark;

public class ArticleViewEx {
    public static void main(String[] args) {
        ArticleDao articleDao = new ArticleDaoImplUsingDbUtils();
        Article article = articleDao.getArticle(1);
        System.out.println(article);
    }
}
