package com.jimmy.controller;

import com.jimmy.domain.Book;
import com.jimmy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xiongyang
 * @date 2020/7/17 11:25
 * @Description:
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("store/getAllBook")
    public String getAllBook(Model model){
        System.out.println("controller层：查询所有书籍");

        List<Book> list = bookService.getAllBook();
        model.addAttribute("list",list);

        return "list";//在视图解析器中配置了前缀后缀
    }
}
