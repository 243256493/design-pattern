package acgn.akatsuki.entity;

import acgn.akatsuki.iterator.BookShelfIterator;
import acgn.akatsuki.iterator.Iterator;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
public abstract class BookShelf implements Aggregate {

    public abstract Book getBookAt(int index);

    public abstract void appendBook(Book book);

    public abstract int getLength();

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
