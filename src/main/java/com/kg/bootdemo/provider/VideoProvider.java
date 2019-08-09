package com.kg.bootdemo.provider;

import org.apache.ibatis.jdbc.SQL;

import com.kg.bootdemo.domain.Video;

public class VideoProvider {

    public String updateVideo(final Video video) {
        return new SQL() {
            {
                // 需要更新的表
                UPDATE("video");

                // 根据条件更新啊属性
                if (video.getSummary() != null) {
                    SET("summary = #{summary}");
                }
                if (video.getTitle() != null) {
                    SET("title = #{title}");
                }
                if (video.getCoverImg() != null) {
                    SET("coverImg = #{cover_img}");
                }
                if (video.getViewNum() != null) {
                    SET("viewNum = #{view_num}");
                }
                if (video.getPrice() != null) {
                    SET("price = #{price}");
                }
                if (video.getOnline() != null) {
                    SET("online = #{online}");
                }
                if (video.getPoint() != null) {
                    SET("point = #{point}");
                }

                WHERE("id = #{id}");
            }
        }.toString();
    }
}
