package com.kg.bootdemo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kg.bootdemo.domain.Video;
import com.kg.bootdemo.mapper.VideoMapper;

import lombok.extern.slf4j.Slf4j;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Controller
public class BaseController {

    @Resource
    private VideoMapper vm;


    @RequestMapping("/index")
    @ResponseBody
    public List<Video> findAll() {
        return vm.findAll();
    }
    /**
     *  ·ÖÒ³°¸Àý
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/page")
    @ResponseBody
    @Cacheable(cacheNames="c1",key="#method")
    public Object findAllByPage(@RequestParam(value="page", defaultValue="1") int page, @RequestParam(value="size", defaultValue="5") int size) {
        log.info(page+"  "+size);
        PageHelper.startPage(page, size);
        List<Video> l = vm.findAll();
        PageInfo<Video> pageInfo = new PageInfo<Video>(l);
        return pageInfo;
    }

    @PutMapping("/update")
    @ResponseBody
    public int updateById(@RequestBody Video video) {
        log.info(video.toString());
        return vm.updateById(video);
    }
    
}
