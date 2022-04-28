package com.dafeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
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

        public Criteria andContractContentIsNull() {
            addCriterion("contract_content is null");
            return (Criteria) this;
        }

        public Criteria andContractContentIsNotNull() {
            addCriterion("contract_content is not null");
            return (Criteria) this;
        }

        public Criteria andContractContentEqualTo(String value) {
            addCriterion("contract_content =", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentNotEqualTo(String value) {
            addCriterion("contract_content <>", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentGreaterThan(String value) {
            addCriterion("contract_content >", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentGreaterThanOrEqualTo(String value) {
            addCriterion("contract_content >=", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentLessThan(String value) {
            addCriterion("contract_content <", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentLessThanOrEqualTo(String value) {
            addCriterion("contract_content <=", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentLike(String value) {
            addCriterion("contract_content like", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentNotLike(String value) {
            addCriterion("contract_content not like", value, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentIn(List<String> values) {
            addCriterion("contract_content in", values, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentNotIn(List<String> values) {
            addCriterion("contract_content not in", values, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentBetween(String value1, String value2) {
            addCriterion("contract_content between", value1, value2, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractContentNotBetween(String value1, String value2) {
            addCriterion("contract_content not between", value1, value2, "contractContent");
            return (Criteria) this;
        }

        public Criteria andContractDayIsNull() {
            addCriterion("contract_day is null");
            return (Criteria) this;
        }

        public Criteria andContractDayIsNotNull() {
            addCriterion("contract_day is not null");
            return (Criteria) this;
        }

        public Criteria andContractDayEqualTo(Date value) {
            addCriterion("contract_day =", value, "contractDay");
            return (Criteria) this;
        }

        public Criteria andContractDayNotEqualTo(Date value) {
            addCriterion("contract_day <>", value, "contractDay");
            return (Criteria) this;
        }

        public Criteria andContractDayGreaterThan(Date value) {
            addCriterion("contract_day >", value, "contractDay");
            return (Criteria) this;
        }

        public Criteria andContractDayGreaterThanOrEqualTo(Date value) {
            addCriterion("contract_day >=", value, "contractDay");
            return (Criteria) this;
        }

        public Criteria andContractDayLessThan(Date value) {
            addCriterion("contract_day <", value, "contractDay");
            return (Criteria) this;
        }

        public Criteria andContractDayLessThanOrEqualTo(Date value) {
            addCriterion("contract_day <=", value, "contractDay");
            return (Criteria) this;
        }

        public Criteria andContractDayIn(List<Date> values) {
            addCriterion("contract_day in", values, "contractDay");
            return (Criteria) this;
        }

        public Criteria andContractDayNotIn(List<Date> values) {
            addCriterion("contract_day not in", values, "contractDay");
            return (Criteria) this;
        }

        public Criteria andContractDayBetween(Date value1, Date value2) {
            addCriterion("contract_day between", value1, value2, "contractDay");
            return (Criteria) this;
        }

        public Criteria andContractDayNotBetween(Date value1, Date value2) {
            addCriterion("contract_day not between", value1, value2, "contractDay");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeIsNull() {
            addCriterion("contract_begintime is null");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeIsNotNull() {
            addCriterion("contract_begintime is not null");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeEqualTo(Date value) {
            addCriterion("contract_begintime =", value, "contractBegintime");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeNotEqualTo(Date value) {
            addCriterion("contract_begintime <>", value, "contractBegintime");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeGreaterThan(Date value) {
            addCriterion("contract_begintime >", value, "contractBegintime");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("contract_begintime >=", value, "contractBegintime");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeLessThan(Date value) {
            addCriterion("contract_begintime <", value, "contractBegintime");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("contract_begintime <=", value, "contractBegintime");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeIn(List<Date> values) {
            addCriterion("contract_begintime in", values, "contractBegintime");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeNotIn(List<Date> values) {
            addCriterion("contract_begintime not in", values, "contractBegintime");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeBetween(Date value1, Date value2) {
            addCriterion("contract_begintime between", value1, value2, "contractBegintime");
            return (Criteria) this;
        }

        public Criteria andContractBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("contract_begintime not between", value1, value2, "contractBegintime");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeIsNull() {
            addCriterion("contract_endtime is null");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeIsNotNull() {
            addCriterion("contract_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeEqualTo(Date value) {
            addCriterion("contract_endtime =", value, "contractEndtime");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeNotEqualTo(Date value) {
            addCriterion("contract_endtime <>", value, "contractEndtime");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeGreaterThan(Date value) {
            addCriterion("contract_endtime >", value, "contractEndtime");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("contract_endtime >=", value, "contractEndtime");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeLessThan(Date value) {
            addCriterion("contract_endtime <", value, "contractEndtime");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("contract_endtime <=", value, "contractEndtime");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeIn(List<Date> values) {
            addCriterion("contract_endtime in", values, "contractEndtime");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeNotIn(List<Date> values) {
            addCriterion("contract_endtime not in", values, "contractEndtime");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeBetween(Date value1, Date value2) {
            addCriterion("contract_endtime between", value1, value2, "contractEndtime");
            return (Criteria) this;
        }

        public Criteria andContractEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("contract_endtime not between", value1, value2, "contractEndtime");
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