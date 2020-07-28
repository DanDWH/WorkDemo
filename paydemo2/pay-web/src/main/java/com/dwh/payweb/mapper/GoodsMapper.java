package com.dwh.payweb.mapper;

import com.dwh.payweb.entity.Goods;
import com.dwh.payweb.entity.GoodsExample;
import java.util.List;

import com.dwh.payweb.mapper.add.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_goods
     *
     * @mbg.generated Tue Nov 05 22:44:27 CST 2019
     */
    long countByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_goods
     *
     * @mbg.generated Tue Nov 05 22:44:27 CST 2019
     */
    int deleteByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_goods
     *
     * @mbg.generated Tue Nov 05 22:44:27 CST 2019
     */
    int deleteByPrimaryKey(String gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_goods
     *
     * @mbg.generated Tue Nov 05 22:44:27 CST 2019
     */
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_goods
     *
     * @mbg.generated Tue Nov 05 22:44:27 CST 2019
     */
    int insertSelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_goods
     *
     * @mbg.generated Tue Nov 05 22:44:27 CST 2019
     */
    List<Goods> selectByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_goods
     *
     * @mbg.generated Tue Nov 05 22:44:27 CST 2019
     */
    Goods selectByPrimaryKey(String gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_goods
     *
     * @mbg.generated Tue Nov 05 22:44:27 CST 2019
     */
    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_goods
     *
     * @mbg.generated Tue Nov 05 22:44:27 CST 2019
     */
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_goods
     *
     * @mbg.generated Tue Nov 05 22:44:27 CST 2019
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_goods
     *
     * @mbg.generated Tue Nov 05 22:44:27 CST 2019
     */
    int updateByPrimaryKey(Goods record);
}