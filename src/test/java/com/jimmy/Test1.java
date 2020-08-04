package com.jimmy;

import com.jimmy.domain.Book;
import com.jimmy.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author xiongyang
 * @date 2020/7/17 11:35
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test1 {

    @Autowired
    BookService bookService;


    @Test
    public void run4(){
        List<Book> books = bookService.getAllBook();
        for (Book book : books) {
            System.out.println(book.getBookName());

        }
    }


    
}
