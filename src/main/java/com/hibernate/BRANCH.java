package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * table name: BRANCH
 * columns: BRANCH_ID, ADDRESS, CITY, NAME, STATE, ZIP_CODE
 */

@Entity
@Table(name = "BRANCH")

public class BRANCH {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer branch_id;
    private String address;
    private String city;
    private String name;
    private String state;
    private String zip_code;

    BRANCH(String name, String address, String city, String state, String zip_code) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
    }

    // to String method
    @Override
    public String toString() {
        return "BRANCH [branch_id=" + branch_id + ", address=" + address + ", city=" + city + ", name=" + name
                + ", state=" + state + ", zip_code=" + zip_code + "]";
    }
    
}
