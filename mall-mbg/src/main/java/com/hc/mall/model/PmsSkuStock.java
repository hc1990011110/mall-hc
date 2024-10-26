package com.hc.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PmsSkuStock implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_stock.id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_stock.product_id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_stock.sku_code
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private String skuCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_stock.price
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_stock.stock
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private Integer stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_stock.low_stock
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private Integer lowStock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_stock.pic
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_stock.sale
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private Integer sale;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_stock.promotion_price
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private BigDecimal promotionPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_stock.lock_stock
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private Integer lockStock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_stock.sp_data
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private String spData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_stock.id
     *
     * @return the value of pms_sku_stock.id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_stock.id
     *
     * @param id the value for pms_sku_stock.id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_stock.product_id
     *
     * @return the value of pms_sku_stock.product_id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_stock.product_id
     *
     * @param productId the value for pms_sku_stock.product_id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_stock.sku_code
     *
     * @return the value of pms_sku_stock.sku_code
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_stock.sku_code
     *
     * @param skuCode the value for pms_sku_stock.sku_code
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_stock.price
     *
     * @return the value of pms_sku_stock.price
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_stock.price
     *
     * @param price the value for pms_sku_stock.price
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_stock.stock
     *
     * @return the value of pms_sku_stock.stock
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_stock.stock
     *
     * @param stock the value for pms_sku_stock.stock
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_stock.low_stock
     *
     * @return the value of pms_sku_stock.low_stock
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public Integer getLowStock() {
        return lowStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_stock.low_stock
     *
     * @param lowStock the value for pms_sku_stock.low_stock
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_stock.pic
     *
     * @return the value of pms_sku_stock.pic
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_stock.pic
     *
     * @param pic the value for pms_sku_stock.pic
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_stock.sale
     *
     * @return the value of pms_sku_stock.sale
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_stock.sale
     *
     * @param sale the value for pms_sku_stock.sale
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_stock.promotion_price
     *
     * @return the value of pms_sku_stock.promotion_price
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_stock.promotion_price
     *
     * @param promotionPrice the value for pms_sku_stock.promotion_price
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_stock.lock_stock
     *
     * @return the value of pms_sku_stock.lock_stock
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public Integer getLockStock() {
        return lockStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_stock.lock_stock
     *
     * @param lockStock the value for pms_sku_stock.lock_stock
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_stock.sp_data
     *
     * @return the value of pms_sku_stock.sp_data
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public String getSpData() {
        return spData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_stock.sp_data
     *
     * @param spData the value for pms_sku_stock.sp_data
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setSpData(String spData) {
        this.spData = spData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", pic=").append(pic);
        sb.append(", sale=").append(sale);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", lockStock=").append(lockStock);
        sb.append(", spData=").append(spData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}