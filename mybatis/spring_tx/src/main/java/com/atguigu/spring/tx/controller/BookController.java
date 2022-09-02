package com.atguigu.spring.tx.controller;

import com.atguigu.spring.tx.service.BookService;
import com.atguigu.spring.tx.service.CheckoutServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CheckoutServiceImpl checkoutService;

    public void buyBook(Integer bookId, Integer userId) {
        bookService.buyBook(bookId, userId);
    }

    public void  buyBooks(Integer[] bookIds, Integer userId){
        checkoutService.buyBooks(bookIds, userId);
    }

}
