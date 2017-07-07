package com.example.demo;

import com.example.demo.dto.ResultDto;
import com.example.demo.dto.ResultDtoFactory;
import com.example.demo.entity.BaseUser;
import com.example.demo.service.BaseUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bin on 2017/6/27 0027.
 */
@RestController
@RequestMapping(value = "/show")
@Api(description = "展示端登录接口")
public class testController {

    @Autowired
    private BaseUserService baseUserService;

    @PostMapping("/query")
    @ResponseBody
    public ResultDto query(@RequestBody String str) {

//        PageHelper.startPage(1, 12);

        List<BaseUser> users = baseUserService.selectAll();
        return ResultDtoFactory.toSuccess(users);
    }


    @PostMapping("/insert")
    @ResponseBody
    public ResultDto insert(@RequestBody BaseUser baseUser) {

//        PageHelper.startPage(1, 12);
//        BaseUser baseUser = new BaseUser();
//
//        baseUser.setAge(16);
//        baseUser.setHeight(175);
//        baseUser.setName("招六");
//        baseUser.setId(5);

        baseUserService.insert(baseUser);
        return ResultDtoFactory.toSuccess("success");
    }

    @GetMapping("/test")
    public String test() {
        return "helle world";
    }
}
