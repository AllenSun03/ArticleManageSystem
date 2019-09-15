package com.allensun.service;

import com.allensun.pojo.Article;
import com.allensun.pojo.PageBean;
import com.allensun.pojo.Reply;
import com.allensun.pojo.Words;

import java.util.List;
import java.util.Map;

public interface ArticleService {
    void saveArticle(Article article);

    PageBean<Article> findByPage(int pageCode, int pageSize, Map<String, Object> conMap);

    void delete(int r_id);

    void update(Article article);

    Article findById(int r_id);

    void clean(int r_id);

    void restore(int r_id);

    void saveWords(Words words);

    void saveReply(Reply reply);

    List<Words> findByWords();

    List<Reply> findByReply();
}
