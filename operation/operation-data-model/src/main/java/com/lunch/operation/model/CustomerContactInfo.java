package com.lunch.operation.model;

import com.lunch.common.enums.Gender;

/**
 * CustomerContactInfo
 *
 * @author torrisli
 * @date 2023/2/19
 * @Description: CustomerContactInfo
 */
public class CustomerContactInfo {

    private String name;

    private String gender;

    private String phoneAreaCode;

    private String phone;

    private String email;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneAreaCode() {
        return phoneAreaCode;
    }

    public void setPhoneAreaCode(String phoneAreaCode) {
        this.phoneAreaCode = phoneAreaCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
