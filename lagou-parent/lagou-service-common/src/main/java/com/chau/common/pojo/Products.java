package com.chau.common.pojo;


public class Products {

  private long id;
  private String name;
  private double price;
  private String flag;
  private String goodsDesc;
  private String images;
  private long goodsStock;
  private String goodsType;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }


  public String getGoodsDesc() {
    return goodsDesc;
  }

  public void setGoodsDesc(String goodsDesc) {
    this.goodsDesc = goodsDesc;
  }


  public String getImages() {
    return images;
  }

  public void setImages(String images) {
    this.images = images;
  }


  public long getGoodsStock() {
    return goodsStock;
  }

  public void setGoodsStock(long goodsStock) {
    this.goodsStock = goodsStock;
  }


  public String getGoodsType() {
    return goodsType;
  }

  public void setGoodsType(String goodsType) {
    this.goodsType = goodsType;
  }

}
