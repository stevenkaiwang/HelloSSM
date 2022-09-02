package com.atguigu.spring.tx;

import com.atguigu.spring.tx.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextTx.xml")
public class TestTxByAnnotation {
    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        bookController.buyBook(1,1);
    }

    @Test
    public void testBuyBooks() {
        Integer[] bookIds = {1,2};
        bookController.buyBooks(bookIds, 1);
    }
}
