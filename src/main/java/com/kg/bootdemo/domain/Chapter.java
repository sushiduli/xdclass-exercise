package com.kg.bootdemo.domain;


import java.io.Serializable;

public class Chapter implements Serializable {

  private Long id;
  private Long videoId;
  private String title;
  private Long ordered;
  private java.util.Date createTime;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getVideoId() {
    return videoId;
  }

  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Long getOrdered() {
    return ordered;
  }

  public void setOrdered(Long ordered) {
    this.ordered = ordered;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }

}
