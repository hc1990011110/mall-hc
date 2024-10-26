package com.hc.mall.mapper;

import com.hc.mall.model.PmsProductAttribute;
import com.hc.mall.model.PmsProductAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    long countByExample(PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int deleteByExample(PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int insert(PmsProductAttribute row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int insertSelective(PmsProductAttribute row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    List<PmsProductAttribute> selectByExample(PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    PmsProductAttribute selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByExampleSelective(@Param("row") PmsProductAttribute row, @Param("example") PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByExample(@Param("row") PmsProductAttribute row, @Param("example") PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByPrimaryKeySelective(PmsProductAttribute row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByPrimaryKey(PmsProductAttribute row);
}