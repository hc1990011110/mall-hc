package com.hc.mall.mapper;

import com.hc.mall.model.UmsMenu;
import com.hc.mall.model.UmsMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    long countByExample(UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int deleteByExample(UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int insert(UmsMenu row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int insertSelective(UmsMenu row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    List<UmsMenu> selectByExample(UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    UmsMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByExampleSelective(@Param("row") UmsMenu row, @Param("example") UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByExample(@Param("row") UmsMenu row, @Param("example") UmsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByPrimaryKeySelective(UmsMenu row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_menu
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByPrimaryKey(UmsMenu row);
}