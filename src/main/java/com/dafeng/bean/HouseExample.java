package com.dafeng.bean;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
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

        public Criteria andHouseNameIsNull() {
            addCriterion("house_name is null");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNotNull() {
            addCriterion("house_name is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNameEqualTo(String value) {
            addCriterion("house_name =", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotEqualTo(String value) {
            addCriterion("house_name <>", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThan(String value) {
            addCriterion("house_name >", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("house_name >=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThan(String value) {
            addCriterion("house_name <", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThanOrEqualTo(String value) {
            addCriterion("house_name <=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLike(String value) {
            addCriterion("house_name like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotLike(String value) {
            addCriterion("house_name not like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameIn(List<String> values) {
            addCriterion("house_name in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotIn(List<String> values) {
            addCriterion("house_name not in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameBetween(String value1, String value2) {
            addCriterion("house_name between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotBetween(String value1, String value2) {
            addCriterion("house_name not between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseFloorIsNull() {
            addCriterion("house_floor is null");
            return (Criteria) this;
        }

        public Criteria andHouseFloorIsNotNull() {
            addCriterion("house_floor is not null");
            return (Criteria) this;
        }

        public Criteria andHouseFloorEqualTo(Integer value) {
            addCriterion("house_floor =", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorNotEqualTo(Integer value) {
            addCriterion("house_floor <>", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorGreaterThan(Integer value) {
            addCriterion("house_floor >", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_floor >=", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorLessThan(Integer value) {
            addCriterion("house_floor <", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorLessThanOrEqualTo(Integer value) {
            addCriterion("house_floor <=", value, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorIn(List<Integer> values) {
            addCriterion("house_floor in", values, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorNotIn(List<Integer> values) {
            addCriterion("house_floor not in", values, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorBetween(Integer value1, Integer value2) {
            addCriterion("house_floor between", value1, value2, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("house_floor not between", value1, value2, "houseFloor");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeIsNull() {
            addCriterion("house_describe is null");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeIsNotNull() {
            addCriterion("house_describe is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeEqualTo(String value) {
            addCriterion("house_describe =", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeNotEqualTo(String value) {
            addCriterion("house_describe <>", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeGreaterThan(String value) {
            addCriterion("house_describe >", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("house_describe >=", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeLessThan(String value) {
            addCriterion("house_describe <", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeLessThanOrEqualTo(String value) {
            addCriterion("house_describe <=", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeLike(String value) {
            addCriterion("house_describe like", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeNotLike(String value) {
            addCriterion("house_describe not like", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeIn(List<String> values) {
            addCriterion("house_describe in", values, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeNotIn(List<String> values) {
            addCriterion("house_describe not in", values, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeBetween(String value1, String value2) {
            addCriterion("house_describe between", value1, value2, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeNotBetween(String value1, String value2) {
            addCriterion("house_describe not between", value1, value2, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("data_status is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("data_status is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(String value) {
            addCriterion("data_status =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(String value) {
            addCriterion("data_status <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(String value) {
            addCriterion("data_status >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(String value) {
            addCriterion("data_status >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(String value) {
            addCriterion("data_status <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(String value) {
            addCriterion("data_status <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLike(String value) {
            addCriterion("data_status like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotLike(String value) {
            addCriterion("data_status not like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<String> values) {
            addCriterion("data_status in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<String> values) {
            addCriterion("data_status not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(String value1, String value2) {
            addCriterion("data_status between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(String value1, String value2) {
            addCriterion("data_status not between", value1, value2, "dataStatus");
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