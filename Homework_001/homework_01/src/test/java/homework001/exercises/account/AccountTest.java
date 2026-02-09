package homework001.exercises.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void defaultConstructor_shouldCreateAccountWithNullValues() {
        Account account = new Account();
        assertNull(account.getId());
        assertNull(account.getName());
        assertEquals(0, account.getBalance());
    }

    @Test
    void constructorWithIdAndName_shouldSetValues() {
        Account account = new Account("123", "Juana Perez");
        assertEquals("123", account.getId());
        assertEquals("Juana Perez", account.getName());
        assertEquals(0, account.getBalance());
    }

    @Test
    void constructorWithAllValues_shouldSetValues() {
        Account account = new Account("456", "Juana Rodriguez", 1000);
        assertEquals("456", account.getId());
        assertEquals("Juana Rodriguez", account.getName());
        assertEquals(1000, account.getBalance());
    }

    @Test
    void credit_shouldIncreaseBalance() {
        Account account = new Account("789", "Alice", 500);
        assertEquals(1500, account.Credit(1000));
        assertEquals(1500, account.getBalance());
    }

    @Test
    void debit_shouldDecreaseBalance() {
        Account account = new Account("101", "Bob", 2000);
        assertEquals(1500, account.Debit(500));
        assertEquals(1500, account.getBalance());
    }

    @Test
    void debit_withInsufficientFunds_shouldNotChangeBalance() {
        Account account = new Account("102", "Charlie", 300);
        assertEquals(300, account.Debit(500));
        assertEquals(300, account.getBalance());
    }

    @Test
    void toString_shouldReturnExpectedFormat() {
        Account account = new Account("103", "David", 750);
        assertEquals(
            "Account[id=103, name=David, balance=750]",
            account.toString()
        );
    }
}
