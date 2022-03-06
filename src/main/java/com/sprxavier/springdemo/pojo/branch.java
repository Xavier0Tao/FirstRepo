package com.sprxavier.springdemo.pojo;


import org.springframework.stereotype.Component;

@Component
public class branch {
    /*
        * # branch_id	branch_name	mgr_id	mgr_start_date
    1	Corporate	100	2006-02-09
    2	Scranton	102	1992-04-06
    3	Stamford	106	1998-02-13
        在实体类中基本数据类型建议使用包装类型
        * */
    private Integer branch_id;
    private String branch_name;
    private int mgr_id;
    private String mgr_start_date;

    public branch() {
    }

    public branch(Integer branch_id, String branch_name, int mgr_id, String mgr_start_date) {
        this.branch_id = branch_id;
        this.branch_name = branch_name;
        this.mgr_id = mgr_id;
        this.mgr_start_date = mgr_start_date;
    }

    public Integer getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(Integer branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public int getMgr_id() {
        return mgr_id;
    }

    public void setMgr_id(int mgr_id) {
        this.mgr_id = mgr_id;
    }

    public String getMgr_start_date() {
        return mgr_start_date;
    }

    public void setMgr_start_date(String mgr_start_date) {
        this.mgr_start_date = mgr_start_date;
    }

    @Override
    public String toString() {
        return "entity_Branch{" +
                "branch_id=" + branch_id +
                ", branch_name='" + branch_name + '\'' +
                ", mgr_id=" + mgr_id +
                ", mgr_start_time='" + mgr_start_date + '\'' +
                '}';
    }
}
