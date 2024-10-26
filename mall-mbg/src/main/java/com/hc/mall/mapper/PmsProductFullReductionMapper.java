package com.hc.mall.mapper;

import com.hc.mall.model.PmsProductFullReduction;
import com.hc.mall.model.PmsProductFullReductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductFullReductionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    long countByExample(PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int deleteByExample(PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int insert(PmsProductFullReduction row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int insertSelective(PmsProductFullReduction row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    List<PmsProductFullReduction> selectByExample(PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    PmsProductFullReduction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByExampleSelective(@Param("row") PmsProductFullReduction row, @Param("example") PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByExample(@Param("row") PmsProductFullReduction row, @Param("example") PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByPrimaryKeySelective(PmsProductFullReduction row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByPrimaryKey(PmsProductFullReduction row);
}