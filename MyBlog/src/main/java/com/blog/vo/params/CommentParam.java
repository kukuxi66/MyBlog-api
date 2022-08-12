package com.blog.vo.params;

import lombok.Data;

@Data
public class CommentParam {

    private Long id;

    private Long articleId;

    private String content;

    private Long parent;

    private Long toUserId;
}
