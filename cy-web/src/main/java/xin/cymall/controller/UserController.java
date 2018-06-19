package xin.cymall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.cymall.entity.User;
import xin.cymall.service.UserService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.R;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("User")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/list")
    public R getAll(){
        List<User> list  = new ArrayList<>();
        list  = this.userService.getAllUser();

        System.out.println("进入前"+list.size());

        int totle = list.size();

        int PageSize = 5;
        int currPage = 1;

        PageUtils pageUtil = new PageUtils(list, totle, PageSize, currPage);


        return  R.ok().put("page",pageUtil);
    }

    @ResponseBody
    @RequestMapping("/save")
    public R newUser(int id,String userNamez,String password, int age){


        List<User> list  = new ArrayList<>();
        list  = this.userService.getAllUser();

        System.out.println("进入前"+list.size());

        int totle = list.size();

        int PageSize = 5;
        int currPage = 1;

        PageUtils pageUtil = new PageUtils(list, totle, PageSize, currPage);


        return  R.ok();
    }




}
