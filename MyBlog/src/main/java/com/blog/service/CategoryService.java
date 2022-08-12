package com.blog.service;

import com.blog.vo.CategoryVo;
import com.blog.vo.Result;

import java.util.List;

public interface CategoryService {
    CategoryVo findCategoryId(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoriesDetailById(Long id);
}
