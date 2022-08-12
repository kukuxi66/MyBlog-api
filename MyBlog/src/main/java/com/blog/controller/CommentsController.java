package com.blog.controller;

import com.blog.dao.pojo.SysUser;
import com.blog.service.CommentsService;
import com.blog.service.LoginService;
import com.blog.utils.JWTUtils;
import com.blog.vo.Result;
import com.blog.vo.params.CommentParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @Autowired
    private LoginService loginService;


    @GetMapping("article/{id}")
    public Result comments(@PathVariable("id") Long articleId){
        return commentsService.commentsByArticleId(articleId);
    }

    @PostMapping("create/change")
    public Result comment(@RequestBody CommentParam commentParam){
        return commentsService.comment(commentParam);
    }
}