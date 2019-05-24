package com.xing.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xing.enums.ProductStatusEnum;
import com.xing.utils.EnumUtil;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/*商品*/
@Entity
public class ProductInfo {

    @Id
    private String productId;
    /*名字*/
    private String productName;
    /*单价*/
    private BigDecimal productPrice;
    /*庫存*/
    private Integer productStock;
    /*描述*/
    private String productDescription;
    /*小图*/
    private String productIcon;
    /*状态,商品状态，0整常1下架*/
    private Integer productStatus;
    /*类目编号*/
    private  Integer categoryType;

    /*修改时间*/
    private Date createTime;

    /*创建时间*/
    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum(){
        return EnumUtil.getByCode(productStatus,ProductStatusEnum.class);
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
    @Override
    public String toString() {
        return "ProductInfo{"+
                "productId="+productId+
                ", productName='"+productName+'\''+
                ", productPrice='"+productPrice+'\''+
                ", productStock='"+productStock+'\''+
                ", productDescription='"+productDescription+'\''+
                ", productIcon='"+productIcon+'\''+
                ", productStatus='"+productStatus+'\''+
                ",categoryType="+categoryType+'}';
    }
}
