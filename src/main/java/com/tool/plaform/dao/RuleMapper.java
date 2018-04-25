package com.tool.plaform.dao;

import com.tool.plaform.entity.Rule;
import com.tool.plaform.entity.RuleWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated
     */
    int insert(RuleWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated
     */
    int insertSelective(RuleWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated
     */
    RuleWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RuleWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(RuleWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Rule record);
    List<Rule> findAllRule();
}