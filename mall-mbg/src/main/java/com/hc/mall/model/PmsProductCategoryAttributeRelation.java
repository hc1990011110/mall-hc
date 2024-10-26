package com.hc.mall.model;

import java.io.Serializable;

public class PmsProductCategoryAttributeRelation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category_attribute_relation.id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category_attribute_relation.product_category_id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private Long productCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category_attribute_relation.product_attribute_id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private Long productAttributeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category_attribute_relation.id
     *
     * @return the value of pms_product_category_attribute_relation.id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category_attribute_relation.id
     *
     * @param id the value for pms_product_category_attribute_relation.id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category_attribute_relation.product_category_id
     *
     * @return the value of pms_product_category_attribute_relation.product_category_id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category_attribute_relation.product_category_id
     *
     * @param productCategoryId the value for pms_product_category_attribute_relation.product_category_id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category_attribute_relation.product_attribute_id
     *
     * @return the value of pms_product_category_attribute_relation.product_attribute_id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public Long getProductAttributeId() {
        return productAttributeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category_attribute_relation.product_attribute_id
     *
     * @param productAttributeId the value for pms_product_category_attribute_relation.product_attribute_id
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
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
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productAttributeId=").append(productAttributeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}