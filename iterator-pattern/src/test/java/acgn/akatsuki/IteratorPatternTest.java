package acgn.akatsuki;

import acgn.akatsuki.aggregate.impl.AdvancedBookShelf;
import acgn.akatsuki.entity.Book;
import acgn.akatsuki.aggregate.BookShelf;
import acgn.akatsuki.aggregate.impl.DeficiencyBookShelf;
import acgn.akatsuki.iterator.Iterator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
@Slf4j
public class IteratorPatternTest {

    @Test
    public void deficiencyBookShelfIteratorTest() {
        BookShelf bookShelf = new DeficiencyBookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bile"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            log.info("{}", book.getName());
        }
        Assert.assertEquals(4, bookShelf.getLength());
    }

    @Test
    public void advancedBookShelfIteratorTest() {
        BookShelf bookShelf = new AdvancedBookShelf();
        bookShelf.appendBook(new Book("Death Note"));
        bookShelf.appendBook(new Book("Guilty Crown"));
        bookShelf.appendBook(new Book("Lycoris Recoil"));
        bookShelf.appendBook(new Book("Psycho Pass"));
        bookShelf.appendBook(new Book("Steins;Gate"));
        bookShelf.appendBook(new Book("Sword Art Online"));
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            log.info("{}", book.getName());
        }
        Assert.assertEquals(6, bookShelf.getLength());
    }
}
