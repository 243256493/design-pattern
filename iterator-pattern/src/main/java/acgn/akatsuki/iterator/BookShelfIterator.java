package acgn.akatsuki.iterator;

import acgn.akatsuki.entity.Book;
import acgn.akatsuki.aggregate.BookShelf;

/**
 * 用于遍历书架的类
 *
 * @author yXg
 * @version design-pattern V1.0
 **/
public class BookShelfIterator implements Iterator<Book> {

    private final BookShelf bookShelf;

    private int index;

    private BookShelfIterator() {
        throw new IllegalArgumentException("Need to use BookShelfIterator(BookShelf) to construct a BookShelfIterator.");
    }

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
