/**
 * Description : TODO(利用 JdbcTemplate 查询，对于老系统来说，不能修改表结构，只能用 native sql)
 * User: h819
 * Date: 2016/9/7
 * Time: 16:50
 * To change this template use File | Settings | File Templates.
 * ====
 * JPA 中几个重要特性，如何在 Jdbc 中实现？
 * ====
 * 1. 关于 BaseDao (即 JPA 中的 Repository)
 * 不用费心力去写 BaseDao 了，这个通用方法仅是多几个对 Entity 的增删改查而已， JdbcTemplate 完全可以简单的实现
 * ===
 * 2. 关于分页
 * 直接写 分页 sql
 * 分页 :可以参考 https://github.com/pagehelper/Mybatis-PageHelper/blob/master/src/main/java/com/github/pagehelper/Page.java
 * ===
 * 3. ResultSet to Entity
 * 3.1 返回结果满足 Bean 的，用  BeanPropertyRowMapper
 * 3.2 其他，手工 RowMapper
 * 3.3 ont , many 问题
 * 用 left join 实现 ，之后手工 RowMapper
 * select person.id, person.name, email.email from person person left join email on person.id = email.person_id
 * 3.4 动态 sql 参考  JpaDynamicSpecificationBuilder ，写
 */
package org.h819.web.spring.jdbc;