package com.example.demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PublisherBean {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
