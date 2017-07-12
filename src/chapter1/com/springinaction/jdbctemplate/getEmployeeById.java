package chapter1.com.springinaction.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by liyu on 2017/7/12.
 */
public class getEmployeeById {
    public Employee getEmployeeById(long id){
        return (new JdbcTemplate()).queryForObject(
            "select id, firstname, lastname, salary from employee where id=?",
            new RowMapper<Employee>(){
                public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Employee employee = new Employee();
                    employee.setId(rs.getLong("id"));
                    employee.setFirstname(rs.getString("firstname"));
                    employee.setLastname(rs.getString("lastname"));
                    employee.setSalary(rs.getBigDecimal("salary"));
                    return employee;
                }
            },
            id
        );
    }
}
