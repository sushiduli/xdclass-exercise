package com.kg.bootdemo.domain;


import java.io.Serializable;

public class Comment implements Serializable {

  private Long id;
  private String content;
  private Long userId;
  private String headImg;
  private String name;
  private Double point;
  private Long up;
  private java.util.Date createTime;
  private Long orderId;
  private Long videoId;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Double getPoint() {
    return point;
  }

  public void setPoint(Double point) {
    this.point = point;
  }


  public Long getUp() {
    return up;
  }

  public void setUp(Long up) {
    this.up = up;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }


  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public Long getVideoId() {
    return videoId;
  }

  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }

}
