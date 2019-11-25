package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @PackageName: com.example.demo.mapper
 * @ClassName: RowMapper
 * @Description:
 * @Author: Raw
 * @Date: 2019/11/25 22:34
 */
public interface RowMapper<T> {
    public abstract T mapRow(ResultSet rs, int index) throws SQLException;
}
