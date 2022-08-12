package com.blog.service;

import com.blog.dao.pojo.SysUser;
import com.blog.vo.Result;
import com.blog.vo.UserVo;

public interface SysUserService {

    UserVo finUserVoById(Long id);

    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    Result findUserByTonk(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);
}
