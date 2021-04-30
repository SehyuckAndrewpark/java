package kr.mjc.sehyuckpark.java.jdbc.articlepark;

import kr.mjc.sehyuckpark.java.jdbc.DbUtils;
import kr.mjc.sehyuckpark.java.jdbc.ResultSetHandler;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class ArticleDaoImplUsingDbUtils implements ArticleDao {

    private static final String LIST_ARTICLE
            = "select articleId, title, content, userId, name, cdate, udate from article order by articleId desc limit ?,?";

    private static final String ADD_ARTICLE
            = "insert article(title, content, userId, name) values(?, ?, ?, ?)";

    private static final String GET_ARTICLE
            = "select articleId, title, content, userId, name, cdate, udate from article where articleId=?";

    private static final String UPDATE_ARTICLE
            = "update article set title=?, content=?, name=? where articleId=?";

    private static final String DELETE_ARTICLE
            = "update article set userId=? where articleId=?";

    private DbUtils dbUtils;

    ResultSetHandler<Article> h = (rs) -> {
        Article article = new Article();
        article.setArticleId(rs.getInt("articleId"));
        article.setTitle(rs.getString("title"));
        article.setContent(rs.getString("content"));
        article.setUserId(rs.getInt("userId"));
        article.setName(rs.getString("name"));
        return article;
    };



    public ArticleDaoImplUsingDbUtils() {
        Properties props = new Properties();
        try (InputStream in = getClass().getClassLoader()
                .getResourceAsStream("db.properties")) {
            props.load(in);
            DataSource dataSource = new MariaDbDataSource(
                    props.getProperty("db.url"));
            dbUtils = new DbUtils(dataSource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Article> listArticles(int offset, int count) {
        return dbUtils.list(LIST_ARTICLE, h, offset, count);
    }

    @Override
    public Article getArticle(int articleId) {
        return dbUtils.get(GET_ARTICLE, h, articleId);
    }

    @Override
    public void addArticle(Article article) {
        dbUtils
                .update(ADD_ARTICLE,  article.getTitle(),
                        article.getContent(), article.getUserId(), article.getName());
    }

    @Override
    public int updateArticle(Article article) {
        return dbUtils.update(UPDATE_ARTICLE, article.getTitle(), article.getContent(), article.getName(), article.articleId);
    }

    @Override
    public int deleteArticle(int articleId, int userId) {
        return dbUtils.update(DELETE_ARTICLE, articleId, userId);
    }

}







