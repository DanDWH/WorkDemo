package com.dwh.payweb.entity;

public class Business {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dwh_business.BusinId
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    private Integer businid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dwh_business.BusinName
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    private String businname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dwh_business.Password
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dwh_business.Phonenumber
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    private String phonenumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dwh_business.Apayid
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    private String apayid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dwh_business.BusinId
     *
     * @return the value of dwh_business.BusinId
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    public Integer getBusinid() {
        return businid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dwh_business.BusinId
     *
     * @param businid the value for dwh_business.BusinId
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    public void setBusinid(Integer businid) {
        this.businid = businid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dwh_business.BusinName
     *
     * @return the value of dwh_business.BusinName
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    public String getBusinname() {
        return businname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dwh_business.BusinName
     *
     * @param businname the value for dwh_business.BusinName
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    public void setBusinname(String businname) {
        this.businname = businname == null ? null : businname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dwh_business.Password
     *
     * @return the value of dwh_business.Password
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dwh_business.Password
     *
     * @param password the value for dwh_business.Password
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dwh_business.Phonenumber
     *
     * @return the value of dwh_business.Phonenumber
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dwh_business.Phonenumber
     *
     * @param phonenumber the value for dwh_business.Phonenumber
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dwh_business.Apayid
     *
     * @return the value of dwh_business.Apayid
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    public String getApayid() {
        return apayid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dwh_business.Apayid
     *
     * @param apayid the value for dwh_business.Apayid
     *
     * @mbg.generated Tue Apr 21 20:51:44 CST 2020
     */
    public void setApayid(String apayid) {
        this.apayid = apayid == null ? null : apayid.trim();
    }
}