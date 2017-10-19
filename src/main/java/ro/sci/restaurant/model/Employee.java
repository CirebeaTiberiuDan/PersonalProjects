package ro.sci.restaurant.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employees")
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
//    private Integer age;
//    private Character gender;
//    private String phoneNumber;
//    private String email;
//    private Double salary;
//    private Date hireDate;

//    private Set<Credentials> credentials;


    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NotNull
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
//
//    @NotNull
//    @Min(18)
//    @Column(name = "age")
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @NotNull
//    @Column(name = "gender")
//    public Character getGender() {
//        return gender;
//    }
//
//    public void setGender(Character gender) {
//        this.gender = gender;
//    }
//
//    @NotNull
//    @Column(name = "phone_number", unique = true)
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    @Email
//    @Column(name = "email")
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Column(name = "salary")
//    public Double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Double salary) {
//        this.salary = salary;
////    }
////    @Temporal(TemporalType.DATE)
////    @Column(name = "hire_date")
////    @DateTimeFormat(pattern="dd-MMM-yyyy")
////    public Date getHireDate() {
////        return hireDate;
////    }
////
////    public void setHireDate(Date hireDate) {
////        this.hireDate = hireDate;
////    }
//
//    }


//
    }

