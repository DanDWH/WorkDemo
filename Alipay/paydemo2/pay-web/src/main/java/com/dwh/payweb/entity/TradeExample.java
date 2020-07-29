package com.dwh.payweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    public TradeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTradeidIsNull() {
            addCriterion("tradeid is null");
            return (Criteria) this;
        }

        public Criteria andTradeidIsNotNull() {
            addCriterion("tradeid is not null");
            return (Criteria) this;
        }

        public Criteria andTradeidEqualTo(String value) {
            addCriterion("tradeid =", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidNotEqualTo(String value) {
            addCriterion("tradeid <>", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidGreaterThan(String value) {
            addCriterion("tradeid >", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidGreaterThanOrEqualTo(String value) {
            addCriterion("tradeid >=", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidLessThan(String value) {
            addCriterion("tradeid <", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidLessThanOrEqualTo(String value) {
            addCriterion("tradeid <=", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidLike(String value) {
            addCriterion("tradeid like", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidNotLike(String value) {
            addCriterion("tradeid not like", value, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidIn(List<String> values) {
            addCriterion("tradeid in", values, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidNotIn(List<String> values) {
            addCriterion("tradeid not in", values, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidBetween(String value1, String value2) {
            addCriterion("tradeid between", value1, value2, "tradeid");
            return (Criteria) this;
        }

        public Criteria andTradeidNotBetween(String value1, String value2) {
            addCriterion("tradeid not between", value1, value2, "tradeid");
            return (Criteria) this;
        }

        public Criteria andMPriceIsNull() {
            addCriterion("m_price is null");
            return (Criteria) this;
        }

        public Criteria andMPriceIsNotNull() {
            addCriterion("m_price is not null");
            return (Criteria) this;
        }

        public Criteria andMPriceEqualTo(String value) {
            addCriterion("m_price =", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceNotEqualTo(String value) {
            addCriterion("m_price <>", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceGreaterThan(String value) {
            addCriterion("m_price >", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceGreaterThanOrEqualTo(String value) {
            addCriterion("m_price >=", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceLessThan(String value) {
            addCriterion("m_price <", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceLessThanOrEqualTo(String value) {
            addCriterion("m_price <=", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceLike(String value) {
            addCriterion("m_price like", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceNotLike(String value) {
            addCriterion("m_price not like", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceIn(List<String> values) {
            addCriterion("m_price in", values, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceNotIn(List<String> values) {
            addCriterion("m_price not in", values, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceBetween(String value1, String value2) {
            addCriterion("m_price between", value1, value2, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceNotBetween(String value1, String value2) {
            addCriterion("m_price not between", value1, value2, "mPrice");
            return (Criteria) this;
        }

        public Criteria andGidsIsNull() {
            addCriterion("gids is null");
            return (Criteria) this;
        }

        public Criteria andGidsIsNotNull() {
            addCriterion("gids is not null");
            return (Criteria) this;
        }

        public Criteria andGidsEqualTo(String value) {
            addCriterion("gids =", value, "gids");
            return (Criteria) this;
        }

        public Criteria andGidsNotEqualTo(String value) {
            addCriterion("gids <>", value, "gids");
            return (Criteria) this;
        }

        public Criteria andGidsGreaterThan(String value) {
            addCriterion("gids >", value, "gids");
            return (Criteria) this;
        }

        public Criteria andGidsGreaterThanOrEqualTo(String value) {
            addCriterion("gids >=", value, "gids");
            return (Criteria) this;
        }

        public Criteria andGidsLessThan(String value) {
            addCriterion("gids <", value, "gids");
            return (Criteria) this;
        }

        public Criteria andGidsLessThanOrEqualTo(String value) {
            addCriterion("gids <=", value, "gids");
            return (Criteria) this;
        }

        public Criteria andGidsLike(String value) {
            addCriterion("gids like", value, "gids");
            return (Criteria) this;
        }

        public Criteria andGidsNotLike(String value) {
            addCriterion("gids not like", value, "gids");
            return (Criteria) this;
        }

        public Criteria andGidsIn(List<String> values) {
            addCriterion("gids in", values, "gids");
            return (Criteria) this;
        }

        public Criteria andGidsNotIn(List<String> values) {
            addCriterion("gids not in", values, "gids");
            return (Criteria) this;
        }

        public Criteria andGidsBetween(String value1, String value2) {
            addCriterion("gids between", value1, value2, "gids");
            return (Criteria) this;
        }

        public Criteria andGidsNotBetween(String value1, String value2) {
            addCriterion("gids not between", value1, value2, "gids");
            return (Criteria) this;
        }

        public Criteria andVersionsIsNull() {
            addCriterion("versions is null");
            return (Criteria) this;
        }

        public Criteria andVersionsIsNotNull() {
            addCriterion("versions is not null");
            return (Criteria) this;
        }

        public Criteria andVersionsEqualTo(String value) {
            addCriterion("versions =", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsNotEqualTo(String value) {
            addCriterion("versions <>", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsGreaterThan(String value) {
            addCriterion("versions >", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsGreaterThanOrEqualTo(String value) {
            addCriterion("versions >=", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsLessThan(String value) {
            addCriterion("versions <", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsLessThanOrEqualTo(String value) {
            addCriterion("versions <=", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsLike(String value) {
            addCriterion("versions like", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsNotLike(String value) {
            addCriterion("versions not like", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsIn(List<String> values) {
            addCriterion("versions in", values, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsNotIn(List<String> values) {
            addCriterion("versions not in", values, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsBetween(String value1, String value2) {
            addCriterion("versions between", value1, value2, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsNotBetween(String value1, String value2) {
            addCriterion("versions not between", value1, value2, "versions");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("paytime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("paytime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("paytime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("paytime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("paytime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paytime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("paytime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("paytime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("paytime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("paytime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("paytime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("paytime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNull() {
            addCriterion("numbers is null");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNotNull() {
            addCriterion("numbers is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersEqualTo(String value) {
            addCriterion("numbers =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(String value) {
            addCriterion("numbers <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(String value) {
            addCriterion("numbers >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(String value) {
            addCriterion("numbers >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(String value) {
            addCriterion("numbers <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(String value) {
            addCriterion("numbers <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLike(String value) {
            addCriterion("numbers like", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotLike(String value) {
            addCriterion("numbers not like", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<String> values) {
            addCriterion("numbers in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<String> values) {
            addCriterion("numbers not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(String value1, String value2) {
            addCriterion("numbers between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(String value1, String value2) {
            addCriterion("numbers not between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDpricesIsNull() {
            addCriterion("dprices is null");
            return (Criteria) this;
        }

        public Criteria andDpricesIsNotNull() {
            addCriterion("dprices is not null");
            return (Criteria) this;
        }

        public Criteria andDpricesEqualTo(String value) {
            addCriterion("dprices =", value, "dprices");
            return (Criteria) this;
        }

        public Criteria andDpricesNotEqualTo(String value) {
            addCriterion("dprices <>", value, "dprices");
            return (Criteria) this;
        }

        public Criteria andDpricesGreaterThan(String value) {
            addCriterion("dprices >", value, "dprices");
            return (Criteria) this;
        }

        public Criteria andDpricesGreaterThanOrEqualTo(String value) {
            addCriterion("dprices >=", value, "dprices");
            return (Criteria) this;
        }

        public Criteria andDpricesLessThan(String value) {
            addCriterion("dprices <", value, "dprices");
            return (Criteria) this;
        }

        public Criteria andDpricesLessThanOrEqualTo(String value) {
            addCriterion("dprices <=", value, "dprices");
            return (Criteria) this;
        }

        public Criteria andDpricesLike(String value) {
            addCriterion("dprices like", value, "dprices");
            return (Criteria) this;
        }

        public Criteria andDpricesNotLike(String value) {
            addCriterion("dprices not like", value, "dprices");
            return (Criteria) this;
        }

        public Criteria andDpricesIn(List<String> values) {
            addCriterion("dprices in", values, "dprices");
            return (Criteria) this;
        }

        public Criteria andDpricesNotIn(List<String> values) {
            addCriterion("dprices not in", values, "dprices");
            return (Criteria) this;
        }

        public Criteria andDpricesBetween(String value1, String value2) {
            addCriterion("dprices between", value1, value2, "dprices");
            return (Criteria) this;
        }

        public Criteria andDpricesNotBetween(String value1, String value2) {
            addCriterion("dprices not between", value1, value2, "dprices");
            return (Criteria) this;
        }

        public Criteria andApricesIsNull() {
            addCriterion("aprices is null");
            return (Criteria) this;
        }

        public Criteria andApricesIsNotNull() {
            addCriterion("aprices is not null");
            return (Criteria) this;
        }

        public Criteria andApricesEqualTo(String value) {
            addCriterion("aprices =", value, "aprices");
            return (Criteria) this;
        }

        public Criteria andApricesNotEqualTo(String value) {
            addCriterion("aprices <>", value, "aprices");
            return (Criteria) this;
        }

        public Criteria andApricesGreaterThan(String value) {
            addCriterion("aprices >", value, "aprices");
            return (Criteria) this;
        }

        public Criteria andApricesGreaterThanOrEqualTo(String value) {
            addCriterion("aprices >=", value, "aprices");
            return (Criteria) this;
        }

        public Criteria andApricesLessThan(String value) {
            addCriterion("aprices <", value, "aprices");
            return (Criteria) this;
        }

        public Criteria andApricesLessThanOrEqualTo(String value) {
            addCriterion("aprices <=", value, "aprices");
            return (Criteria) this;
        }

        public Criteria andApricesLike(String value) {
            addCriterion("aprices like", value, "aprices");
            return (Criteria) this;
        }

        public Criteria andApricesNotLike(String value) {
            addCriterion("aprices not like", value, "aprices");
            return (Criteria) this;
        }

        public Criteria andApricesIn(List<String> values) {
            addCriterion("aprices in", values, "aprices");
            return (Criteria) this;
        }

        public Criteria andApricesNotIn(List<String> values) {
            addCriterion("aprices not in", values, "aprices");
            return (Criteria) this;
        }

        public Criteria andApricesBetween(String value1, String value2) {
            addCriterion("aprices between", value1, value2, "aprices");
            return (Criteria) this;
        }

        public Criteria andApricesNotBetween(String value1, String value2) {
            addCriterion("aprices not between", value1, value2, "aprices");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dwh_trade
     *
     * @mbg.generated do_not_delete_during_merge Sat Nov 09 15:31:04 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dwh_trade
     *
     * @mbg.generated Sat Nov 09 15:31:04 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}