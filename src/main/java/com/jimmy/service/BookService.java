package com.jimmy.service;

import com.jimmy.domain.Book;

import java.util.List;

public interface BookService {

    //查询所有书籍
    List<Book> getAllBook();
}
