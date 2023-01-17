package acgn.akatsuki.aggregate.impl;

import acgn.akatsuki.aggregate.Aggregate;
import acgn.akatsuki.aggregate.BookShelf;
import acgn.akatsuki.entity.Book;

/**
 * 表示书架的类
 *
 * @author yXg
 * @version design-pattern V1.0
 **/
public class DeficiencyBookShelf extends BookShelf implements Aggregate {

    private final Book[] books;

    private int last = 0;

    public DeficiencyBookShelf() {
        this(10);
    }

    public DeficiencyBookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }
}
