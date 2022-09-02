package com.atguigu.spring.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service
public class CheckoutServiceImpl {
    @Autowired
    private BookService bookService;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void buyBooks(Integer[] bookIds, Integer userId){
        for (Integer bookId: bookIds) {
            bookService.buyBook(bookId, userId);
        }
    }


}
