package chapter1.com.springinaction.jdbctemplate;

import java.math.BigDecimal;

/**
 * Created by liyu on 2017/7/12.
 */
public class Employee {
    private long id;
    private String firstname;
    private String lastname;
    private BigDecimal salary;

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
