package com.example.rupesh.ToDo.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="todo")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    private String email;

    //@Size(min = 10, message = "Enter at least 10 characters...")
    private String workDescription;
    private Date startDate;
    private Date targetDate;

    public ToDo(){
        super();
    }

    public ToDo(long userId, Date startDate, Date targetDate, String workDescription, String email ){
        super();
        this.userId = userId;
        this.startDate = startDate;
        this.targetDate = targetDate;
        this.workDescription = workDescription;
        this.email= email;

    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

}
