package com.yanzhen.front;

import com.github.pagehelper.PageInfo;
import com.yanzhen.entity.Article;
import com.yanzhen.service.ArticleService;
import com.yanzhen.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author 596183363@qq.com
 * @Description:
 * @date 2020/11/517:59
 */
@RestController
@RequestMapping("/f/article")
public class FrontArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 查询单个文章
     * @param id
     * @return
     */
    @GetMapping("/get")
    public Result getById(Integer id){
        Article detail = articleService.detail(id);
        return Result.ok(detail);
    }

    /**
     *  按照栏目ID查询文章列表
     * @param article
     * @return
     */
    @GetMapping("/getList")
    public Map getByChannelId(Article article){
        PageInfo<Article> page = articleService.queryByChannelId(article);
        return Result.ok(page);
    }

    /**
     * 获取前几条数据
     * @param article
     * @param top 前几条
     * @return
     */
    @GetMapping("/getTop")
    public Result getById(Article article,Integer top){
        List<Article> list = articleService.top(article, top);
        return Result.ok(list);
    }

    /**
     * 获取置顶最新数据
     * @return
     */
    @GetMapping("/getUp")
    public Map getUp(){
        Article article = new Article();
        article.setTop(1);
        PageInfo<Article> page = articleService.query(article);
        return Result.ok(page);
    }

}
