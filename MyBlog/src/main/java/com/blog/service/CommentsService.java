package com.blog.service;

import com.blog.vo.Result;
import com.blog.vo.params.CommentParam;

public interface CommentsService {
    Result commentsByArticleId(Long articleId);

    Result comment(CommentParam commentParam);
}
