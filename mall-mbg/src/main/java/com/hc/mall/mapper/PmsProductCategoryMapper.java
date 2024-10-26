package com.hc.mall.mapper;

import com.hc.mall.model.PmsProductCategory;
import com.hc.mall.model.PmsProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    long countByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int deleteByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int insert(PmsProductCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int insertSelective(PmsProductCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    List<PmsProductCategory> selectByExampleWithBLOBs(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    List<PmsProductCategory> selectByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    PmsProductCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByExampleSelective(@Param("row") PmsProductCategory row, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByExampleWithBLOBs(@Param("row") PmsProductCategory row, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByExample(@Param("row") PmsProductCategory row, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByPrimaryKeySelective(PmsProductCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByPrimaryKeyWithBLOBs(PmsProductCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByPrimaryKey(PmsProductCategory row);
}