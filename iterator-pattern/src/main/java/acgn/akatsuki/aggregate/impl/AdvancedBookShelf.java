package acgn.akatsuki.aggregate.impl;

import acgn.akatsuki.aggregate.BookShelf;
import acgn.akatsuki.entity.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示书架的类
 *
 * @author yXg
 * @version design-pattern V1.0
 **/
public class AdvancedBookShelf extends BookShelf {

    private final List<Book> books;


    public AdvancedBookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }


}
