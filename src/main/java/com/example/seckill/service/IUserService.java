package com.example.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckill.vo.LoginVo;
import com.example.seckill.pojo.User;
import com.example.seckill.vo.RespBean;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author legal0
 * @since 2022-01-25
 */
public interface IUserService extends IService<User> {
    RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);

    User getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);

    public RespBean updatePassWord(String userTicket, String password,
                                   HttpServletRequest request, HttpServletResponse response);
}
