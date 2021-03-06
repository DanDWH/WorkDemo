package com.dwh.payweb.mapper;

import com.dwh.payweb.Response.entity.UserResponse;
import com.dwh.payweb.entity.User;
import com.dwh.payweb.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_user
     *
     * @mbg.generated Fri May 22 18:32:04 CST 2020
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_user
     *
     * @mbg.generated Fri May 22 18:32:04 CST 2020
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_user
     *
     * @mbg.generated Fri May 22 18:32:04 CST 2020
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_user
     *
     * @mbg.generated Fri May 22 18:32:04 CST 2020
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_user
     *
     * @mbg.generated Fri May 22 18:32:04 CST 2020
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_user
     *
     * @mbg.generated Fri May 22 18:32:04 CST 2020
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_user
     *
     * @mbg.generated Fri May 22 18:32:04 CST 2020
     */
    User selectByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_user
     *
     * @mbg.generated Fri May 22 18:32:04 CST 2020
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_user
     *
     * @mbg.generated Fri May 22 18:32:04 CST 2020
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_user
     *
     * @mbg.generated Fri May 22 18:32:04 CST 2020
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_user
     *
     * @mbg.generated Fri May 22 18:32:04 CST 2020
     */
    int updateByPrimaryKey(User record);

    List<UserResponse> selectall();
}