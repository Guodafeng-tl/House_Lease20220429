package com.dafeng.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderformExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andOrderfromIdIsNull() {
            addCriterion("orderfrom_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderfromIdIsNotNull() {
            addCriterion("orderfrom_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderfromIdEqualTo(Integer value) {
            addCriterion("orderfrom_id =", value, "orderfromId");
            return (Criteria) this;
        }

        public Criteria andOrderfromIdNotEqualTo(Integer value) {
            addCriterion("orderfrom_id <>", value, "orderfromId");
            return (Criteria) this;
        }

        public Criteria andOrderfromIdGreaterThan(Integer value) {
            addCriterion("orderfrom_id >", value, "orderfromId");
            return (Criteria) this;
        }

        public Criteria andOrderfromIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderfrom_id >=", value, "orderfromId");
            return (Criteria) this;
        }

        public Criteria andOrderfromIdLessThan(Integer value) {
            addCriterion("orderfrom_id <", value, "orderfromId");
            return (Criteria) this;
        }

        public Criteria andOrderfromIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderfrom_id <=", value, "orderfromId");
            return (Criteria) this;
        }

        public Criteria andOrderfromIdIn(List<Integer> values) {
            addCriterion("orderfrom_id in", values, "orderfromId");
            return (Criteria) this;
        }

        public Criteria andOrderfromIdNotIn(List<Integer> values) {
            addCriterion("orderfrom_id not in", values, "orderfromId");
            return (Criteria) this;
        }

        public Criteria andOrderfromIdBetween(Integer value1, Integer value2) {
            addCriterion("orderfrom_id between", value1, value2, "orderfromId");
            return (Criteria) this;
        }

        public Criteria andOrderfromIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderfrom_id not between", value1, value2, "orderfromId");
            return (Criteria) this;
        }

        public Criteria andMonthPriceIsNull() {
            addCriterion("month_price is null");
            return (Criteria) this;
        }

        public Criteria andMonthPriceIsNotNull() {
            addCriterion("month_price is not null");
            return (Criteria) this;
        }

        public Criteria andMonthPriceEqualTo(BigDecimal value) {
            addCriterion("month_price =", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceNotEqualTo(BigDecimal value) {
            addCriterion("month_price <>", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceGreaterThan(BigDecimal value) {
            addCriterion("month_price >", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("month_price >=", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceLessThan(BigDecimal value) {
            addCriterion("month_price <", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("month_price <=", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceIn(List<BigDecimal> values) {
            addCriterion("month_price in", values, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceNotIn(List<BigDecimal> values) {
            addCriterion("month_price not in", values, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("month_price between", value1, value2, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("month_price not between", value1, value2, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andOrderformDateIsNull() {
            addCriterion("orderform_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderformDateIsNotNull() {
            addCriterion("orderform_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderformDateEqualTo(Date value) {
            addCriterion("orderform_date =", value, "orderformDate");
            return (Criteria) this;
        }

        public Criteria andOrderformDateNotEqualTo(Date value) {
            addCriterion("orderform_date <>", value, "orderformDate");
            return (Criteria) this;
        }

        public Criteria andOrderformDateGreaterThan(Date value) {
            addCriterion("orderform_date >", value, "orderformDate");
            return (Criteria) this;
        }

        public Criteria andOrderformDateGreaterThanOrEqualTo(Date value) {
            addCriterion("orderform_date >=", value, "orderformDate");
            return (Criteria) this;
        }

        public Criteria andOrderformDateLessThan(Date value) {
            addCriterion("orderform_date <", value, "orderformDate");
            return (Criteria) this;
        }

        public Criteria andOrderformDateLessThanOrEqualTo(Date value) {
            addCriterion("orderform_date <=", value, "orderformDate");
            return (Criteria) this;
        }

        public Criteria andOrderformDateIn(List<Date> values) {
            addCriterion("orderform_date in", values, "orderformDate");
            return (Criteria) this;
        }

        public Criteria andOrderformDateNotIn(List<Date> values) {
            addCriterion("orderform_date not in", values, "orderformDate");
            return (Criteria) this;
        }

        public Criteria andOrderformDateBetween(Date value1, Date value2) {
            addCriterion("orderform_date between", value1, value2, "orderformDate");
            return (Criteria) this;
        }

        public Criteria andOrderformDateNotBetween(Date value1, Date value2) {
            addCriterion("orderform_date not between", value1, value2, "orderformDate");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Integer value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Integer value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Integer value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Integer value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Integer> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Integer> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Integer value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Integer value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Integer value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Integer value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Integer> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Integer> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Integer value1, Integer value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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