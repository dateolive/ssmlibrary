package com.datealive.service;

import com.datealive.mapper.BookMapper;
import com.datealive.pojo.Books;

import java.util.List;

/**
 * @ClassName: BookServicelmpl
 * @Description: TODO
 * @author: datealive
 * @date: 2021/1/27  13:33
 */
public class BookServiceImpl implements BookService{
    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    @Override
    public List<Books> queryBooksByName(String bookName) {
        return bookMapper.queryBooksByName(bookName);
    }
}
