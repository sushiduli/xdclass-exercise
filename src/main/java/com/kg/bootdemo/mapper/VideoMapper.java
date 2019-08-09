package com.kg.bootdemo.mapper;

import com.kg.bootdemo.domain.Video;
import com.kg.bootdemo.provider.VideoProvider;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

@Mapper
public interface VideoMapper {

    @Select("select * from video")
    List<Video> findAll();

    @Select("SELECT * FROM video WHERE id = #{id}")
    Video findById(int id);

    @UpdateProvider(type=VideoProvider.class, method="updateVideo")
    int updateById(Video video);
}
