package com.kg.bootdemo.domain;


import java.io.Serializable;

public class VideoOrder implements Serializable {

  private Long id;
  private String openid;
  private String outTradeNo;
  private Long state;
  private java.util.Date createTime;
  private java.util.Date notifyTime;
  private Long totalFee;
  private String nickname;
  private String headImg;
  private Long videoId;
  private String videoTitle;
  private String videoImg;
  private Long userId;
  private String ip;
  private Long del;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }


  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public Long getState() {
    return state;
  }

  public void setState(Long state) {
    this.state = state;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }


  public java.util.Date getNotifyTime() {
    return notifyTime;
  }

  public void setNotifyTime(java.util.Date notifyTime) {
    this.notifyTime = notifyTime;
  }


  public Long getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(Long totalFee) {
    this.totalFee = totalFee;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public Long getVideoId() {
    return videoId;
  }

  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }


  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }


  public String getVideoImg() {
    return videoImg;
  }

  public void setVideoImg(String videoImg) {
    this.videoImg = videoImg;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public Long getDel() {
    return del;
  }

  public void setDel(Long del) {
    this.del = del;
  }

}
