package com.jml.auth.controller;

import com.jml.auth.vo.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: jml
 * @Date: 18-4-14
 * @Description:
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        Msg msg = new Msg();
        msg.setTitle("测试标题");
        msg.setContent("测试内容");
        msg.setExtraInfo("额外内容，支队管理员显示");
        model.addAttribute("msg", msg);
        return "index";
    }
}
