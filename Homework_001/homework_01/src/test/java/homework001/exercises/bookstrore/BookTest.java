package homework001.exercises.bookstrore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import homework001.exercises.bookstore.Author;
import homework001.exercises.bookstore.Book;

public class BookTest {

    @Test
    void testConstructorSuccess() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'M');
        Book book = new Book("Java for dummies", author, 19.95, 1000);

        assertEquals("Java for dummies", book.getName());
        assertEquals(author, book.getAuthor());
        assertEquals(19.95, book.getPrice(), 0.001);
        assertEquals(1000, book.getQty());
    }

    @Test
    void testConstructorNullName() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'M');
        assertThrows(IllegalArgumentException.class, () -> {
            new Book(null, author, 19.95, 1000);
        });
    }

    @Test
    void testConstructorEmptyName() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'M');
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("", author, 19.95, 1000);
        });
    }

    @Test
    void testConstructorNullAuthor() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("Java for dummies", null, 19.95, 1000);
        });
    }

    @Test
    void testConstructorNegativePrice() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'M');
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("Java for dummies", author, -19.95, 1000);
        });
    }

    @Test
    void testConstructorNegativeQty() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'M');
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("Java for dummies", author, 19.95, -1000);
        });
    }

    @Test
    void testSetPriceSuccess() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'M');
        Book book = new Book("Java for dummies", author, 19.95, 1000);

        book.setPrice(29.95);
        assertEquals(29.95, book.getPrice(), 0.001);
    }

    @Test
    void testSetPriceNegative() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'M');
        Book book = new Book("Java for dummies", author, 19.95, 1000);

        assertThrows(IllegalArgumentException.class, () -> {
            book.setPrice(-29.95);
        });
    }

    @Test
    void testSetQtySuccess() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'M');
        Book book = new Book("Java for dummies", author, 19.95, 1000);

        book.setQty(2000);
        assertEquals(2000, book.getQty());
    }

    @Test
    void testSetQtyNegative() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'M');
        Book book = new Book("Java for dummies", author, 19.95, 1000);

        assertThrows(IllegalArgumentException.class, () -> {
            book.setQty(-2000);
        });
    }

    @Test
    void testToString() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'M');
        Book book = new Book("Java for dummies", author, 19.95, 1000);

        String result = book.toString();
        assertTrue(result.contains("Java for dummies"));
        assertTrue(result.contains("Tan Ah Teck"));
        assertTrue(result.contains("19.95"));
        assertTrue(result.contains("1000"));
    }
}
