package com.jml.auth.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: jml
 * @Date: 18-4-14
 * @Description:
 */
@Entity
public class SysRole {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    public SysRole() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
