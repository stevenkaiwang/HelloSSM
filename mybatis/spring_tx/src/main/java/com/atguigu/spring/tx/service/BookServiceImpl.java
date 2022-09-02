package com.atguigu.spring.tx.service;

import com.atguigu.spring.tx.repository.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
@Transactional(timeout = 3)
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDao bookDao;
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void buyBook(Integer bookId, Integer userId) {
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        System.out.println("this book is " + price);
//        try {
//            TimeUnit.SECONDS.sleep(4);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId, price);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void buyBooks(Integer[] bookIds, Integer userId){
        for (Integer bookId: bookIds) {
            buyBook(bookId, userId);
        }
    }


}
