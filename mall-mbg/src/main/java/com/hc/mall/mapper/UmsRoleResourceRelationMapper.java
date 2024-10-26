package com.hc.mall.mapper;

import com.hc.mall.model.UmsRoleResourceRelation;
import com.hc.mall.model.UmsRoleResourceRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleResourceRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    long countByExample(UmsRoleResourceRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int deleteByExample(UmsRoleResourceRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int insert(UmsRoleResourceRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int insertSelective(UmsRoleResourceRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    List<UmsRoleResourceRelation> selectByExample(UmsRoleResourceRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    UmsRoleResourceRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByExampleSelective(@Param("row") UmsRoleResourceRelation row, @Param("example") UmsRoleResourceRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByExample(@Param("row") UmsRoleResourceRelation row, @Param("example") UmsRoleResourceRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByPrimaryKeySelective(UmsRoleResourceRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_resource_relation
     *
     * @mbg.generated Sat Oct 26 17:42:57 CST 2024
     */
    int updateByPrimaryKey(UmsRoleResourceRelation row);
}