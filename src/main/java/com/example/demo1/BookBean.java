package com.example.demo1;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "BookBean") // Objects | Instances of this Java Class | EJBean are going to be stored inside the Database
public class BookBean
{
    @Id
    private Long id;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
}
