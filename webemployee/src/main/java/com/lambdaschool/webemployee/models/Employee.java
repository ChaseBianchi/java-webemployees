package com.lambdaschool.webemployee.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The employee's data
 */
@Entity
@Table(name = "employees")
public class Employee
{
    /**
     * The id (long) of an employee object. Unique to all employees
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long empid; // Long > int Integer

    /**
     * The first name (String) of the employee. Any format is acceptable
     */
    String fname;

    /**
     * The last name (String) of the employee. Any format is acceptable
     */
    String lname;

    /**
     * The salary (double) of the employee.
     */
    double salary;

    /**
     * Given the parameters, create a new employee object!
     * <p>
     * id is autogenerated
     *
     * @param fname  The first name (String) of the employee
     * @param lname  The last name (String) of the employee
     * @param salary The salary (double) of the employee
     */
    public Employee(String fname,
                    String lname,
                    double salary)
    {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public Employee(Employee newEmp)
    {
        this.empid = newEmp.empid;
        this.fname = newEmp.fname;
        this.lname = newEmp.lname;
        this.salary = newEmp.salary;
    }

    /**
     * The default constructor is required by Spring Data JPA
     */
    public Employee()
    {

    }

    /**
     * Getter for id.
     *
     * @return the id (long) of the employee's object
     */
    public long getEmpid()
    {
        return empid;
    }

    /**
     * Setter for id
     *
     * @param empid the new id (long) of this employee object
     */
    public void setEmpid(long empid)
    {
        this.empid = empid;
    }

    /**
     * Getter for first name
     *
     * @return employee's first name (String)
     */
    public String getFname()
    {
        return fname;
    }

    /**
     * Setter for first name
     *
     * @param fname the new first name (String) of the employee
     */
    public void setFname(String fname)
    {
        this.fname = fname;
    }

    /**
     * Getter for last name
     *
     * @return the last name (String) of this employee
     */
    public String getLname()
    {
        return lname;
    }

    /**
     * Setter for last name
     *
     * @param lname the new last name (String) of the employee
     */
    public void setLname(String lname)
    {
        this.lname = lname;
    }

    /**
     * Getter for salary
     *
     * @return the salary (double) of this employee
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     * Setter for salary
     *
     * @param salary the new salary (double) of this employee
     */
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    /**
     * Custom toString for the employee object
     *
     * @return the current state of the employee object
     */
    @Override
    public String toString()
    {
        return "Employee{" +
                "empid=" + empid +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", salary=" + salary +
                '}';
    }
}