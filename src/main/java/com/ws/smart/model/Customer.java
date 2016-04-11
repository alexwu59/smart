package com.ws.smart.model;

/**
 * Created by wushuai on 16/4/8.
 */
public class Customer {
    /**
     * 主键Id
     */
    private long id;

    /**
     * customer's name
     */
    private String cname;

    /**
     *  customer's contact info
     */
    private String contact;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 配注
     */
    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
