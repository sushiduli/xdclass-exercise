package com.kg.bootdemo.controller;

import com.kg.bootdemo.domain.Video;
import com.kg.bootdemo.mapper.VideoMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BaseController {

    @Resource
    private VideoMapper vm;


    @RequestMapping("/index")
    @ResponseBody
    public List<Video> findAll() {
        return vm.findAll();
    }
}
