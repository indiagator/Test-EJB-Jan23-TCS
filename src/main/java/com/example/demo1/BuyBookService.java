package com.example.demo1;

import jakarta.ejb.Stateless;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@Stateless(name = "BuyBookService")
public class BuyBookService
{
    public int buyBook(Long bookId)
    {

        // Code related to buying a book - changing the inventory, processing payment, logistics ...

        return 0;
    }
}
