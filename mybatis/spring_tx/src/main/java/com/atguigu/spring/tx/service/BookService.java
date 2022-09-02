package com.atguigu.spring.tx.service;

public interface BookService {
    void buyBook(Integer bookId, Integer userId);
    void buyBooks(Integer[] bookIds, Integer userId);
}


