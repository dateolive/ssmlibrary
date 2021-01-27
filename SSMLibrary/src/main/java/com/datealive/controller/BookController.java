package com.datealive.controller;

import com.datealive.pojo.Books;
import com.datealive.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

/**
 * @ClassName: BookController
 * @Description: TODO
 * @author: datealive
 * @date: 2021/1/27  15:36
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/booklist")
    public String list(Model model){
        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("list",books);
        return "booklist";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/booklist";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("book",books);
        return "updateBook";
    }
    @PostMapping("/updateBook")
    public String updateBook(Books book){
        bookService.updateBook(book);
        return "redirect:/book/booklist";
    }

    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/booklist";
    }

    @PostMapping("/queryBook")
    public String querybook(String queryBookName,Model model){
        List<Books> books = bookService.queryBooksByName(queryBookName);
        //System.out.println(books);
        if(books.isEmpty()){
            books=bookService.queryAllBooks();
            model.addAttribute("error","未找到");
        }
        model.addAttribute("list",books);

        return "booklist";
    }

}
