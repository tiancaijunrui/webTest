package com.zcj.test.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User:ZhaCongJie@HF
 * Date:2016/7/19/019.
 * Time:20:32
 */
@Controller
public class test {
    @RequestMapping("test/test.html")
    public String toTest(){
        return "test";
    }
}
