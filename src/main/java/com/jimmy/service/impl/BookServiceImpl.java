package com.jimmy.service.impl;

import com.jimmy.dao.BookMapper;
import com.jimmy.domain.Book;
import com.jimmy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiongyang
 * @date 2020/7/17 11:03
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> getAllBook() {
       return bookMapper.selectAll();
    }
}
