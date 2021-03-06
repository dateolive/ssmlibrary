package com.datealive.mapper;

import com.datealive.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: BookMapper
 * @Description: TODO
 * @author: datealive
 * @date: 2021/1/27  13:20
 */
public interface BookMapper {

    /**
     * 添加一本书
     */
    int addBook(Books book);
    /**
     * //根据id删除一本书
     * @param id
     * @return
     */
    int deleteBookById(@Param("bookID") int id);

    /**
     *  //更新一本书
     * @param book
     * @return
     */
    int updateBook(Books book);

    /**
     * //根据id查询一本书
     * @param id
     * @return
     */
    Books queryBookById(@Param("bookID") int id);

    /**
     *  //查询所有书
     * @return
     */
    List<Books> queryAllBooks();

    /**
     * 根据名字查询书籍
     * @param bookName
     * @return
     */
    List<Books> queryBooksByName(@Param("bookName")String bookName);
}
