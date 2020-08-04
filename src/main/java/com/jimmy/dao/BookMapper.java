package com.jimmy.dao;

import com.jimmy.domain.Book;
import java.util.List;

public interface BookMapper {
    int insert(Book record);

    List<Book> selectAll();
}