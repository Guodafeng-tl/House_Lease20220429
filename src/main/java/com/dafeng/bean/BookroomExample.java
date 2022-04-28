package com.dafeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookroomExample() {
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

        public Criteria andBookroomIdIsNull() {
            addCriterion("bookroom_id is null");
            return (Criteria) this;
        }

        public Criteria andBookroomIdIsNotNull() {
            addCriterion("bookroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookroomIdEqualTo(Integer value) {
            addCriterion("bookroom_id =", value, "bookroomId");
            return (Criteria) this;
        }

        public Criteria andBookroomIdNotEqualTo(Integer value) {
            addCriterion("bookroom_id <>", value, "bookroomId");
            return (Criteria) this;
        }

        public Criteria andBookroomIdGreaterThan(Integer value) {
            addCriterion("bookroom_id >", value, "bookroomId");
            return (Criteria) this;
        }

        public Criteria andBookroomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookroom_id >=", value, "bookroomId");
            return (Criteria) this;
        }

        public Criteria andBookroomIdLessThan(Integer value) {
            addCriterion("bookroom_id <", value, "bookroomId");
            return (Criteria) this;
        }

        public Criteria andBookroomIdLessThanOrEqualTo(Integer value) {
            addCriterion("bookroom_id <=", value, "bookroomId");
            return (Criteria) this;
        }

        public Criteria andBookroomIdIn(List<Integer> values) {
            addCriterion("bookroom_id in", values, "bookroomId");
            return (Criteria) this;
        }

        public Criteria andBookroomIdNotIn(List<Integer> values) {
            addCriterion("bookroom_id not in", values, "bookroomId");
            return (Criteria) this;
        }

        public Criteria andBookroomIdBetween(Integer value1, Integer value2) {
            addCriterion("bookroom_id between", value1, value2, "bookroomId");
            return (Criteria) this;
        }

        public Criteria andBookroomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bookroom_id not between", value1, value2, "bookroomId");
            return (Criteria) this;
        }

        public Criteria andBookroomDateIsNull() {
            addCriterion("bookroom_date is null");
            return (Criteria) this;
        }

        public Criteria andBookroomDateIsNotNull() {
            addCriterion("bookroom_date is not null");
            return (Criteria) this;
        }

        public Criteria andBookroomDateEqualTo(Date value) {
            addCriterion("bookroom_date =", value, "bookroomDate");
            return (Criteria) this;
        }

        public Criteria andBookroomDateNotEqualTo(Date value) {
            addCriterion("bookroom_date <>", value, "bookroomDate");
            return (Criteria) this;
        }

        public Criteria andBookroomDateGreaterThan(Date value) {
            addCriterion("bookroom_date >", value, "bookroomDate");
            return (Criteria) this;
        }

        public Criteria andBookroomDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bookroom_date >=", value, "bookroomDate");
            return (Criteria) this;
        }

        public Criteria andBookroomDateLessThan(Date value) {
            addCriterion("bookroom_date <", value, "bookroomDate");
            return (Criteria) this;
        }

        public Criteria andBookroomDateLessThanOrEqualTo(Date value) {
            addCriterion("bookroom_date <=", value, "bookroomDate");
            return (Criteria) this;
        }

        public Criteria andBookroomDateIn(List<Date> values) {
            addCriterion("bookroom_date in", values, "bookroomDate");
            return (Criteria) this;
        }

        public Criteria andBookroomDateNotIn(List<Date> values) {
            addCriterion("bookroom_date not in", values, "bookroomDate");
            return (Criteria) this;
        }

        public Criteria andBookroomDateBetween(Date value1, Date value2) {
            addCriterion("bookroom_date between", value1, value2, "bookroomDate");
            return (Criteria) this;
        }

        public Criteria andBookroomDateNotBetween(Date value1, Date value2) {
            addCriterion("bookroom_date not between", value1, value2, "bookroomDate");
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