////Ques 1: Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.
//// Also try to use interfaces and abstract classes.

import java.util.Date;

enum BookFormat {
    HARDCOVER,
    PAPERBACK,
    AUDIO_BOOK,
    EBOOK,
    NEWSPAPER,
    MAGAZINE,
    JOURNAL
}
enum BookStatus {
    AVAILABLE,
    RESERVED,
    LOANED,
    LOST
}
enum ReservationStatus{
    WAITING,
    PENDING,
    CANCELED,
    NONE
}
enum AccountStatus{
    ACTIVE,
    CLOSED,
    CANCELED,
    BLACKLISTED,
    NONE
}
class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
}
class Constants {
    public static final int MAX_BOOKS_ISSUED_TO_A_USER = 5;
    public static final int MAX_LENDING_DAYS = 10;
}


//// For simplicity, we are not defining getter and setter functions. The reader can
//// assume that all class attributes are private and accessed through their respective
//// public getter methods and modified only through their public methods function.
public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;
    public boolean resetPassword();
}
public class Librarian extends Account {
    public boolean addBookItem(BookItem bookItem);
    public boolean blockMember(Member member);
    public boolean unBlockMember(Member member);
}
public class Member extends Account {
    private Date dateOfMembership;
    private int totalBooksCheckedout;
    public int getTotalBooksCheckedout();
    public boolean reserveBookItem(BookItem bookItem);
    private void incrementTotalBooksCheckedout();
    public boolean checkoutBookItem(BookItem bookItem) {
    }
    private void checkForFine(String bookItemBarcode) {
    }
    public void returnBookItem(BookItem bookItem) {
    }
    public boolean renewBookItem(BookItem bookItem) {
    }
}
public class BookReservation {
    private Date creationDate;
    private ReservationStatus status;
    private String bookItemBarcode;
    private String memberId;
    public static BookReservation fetchReservationDetails(String barcode);
}
public class BookLending {
    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private String bookItemBarcode;
    private String memberId;
    public static void lendBook(String barcode, String memberId);
    public static BookLending fetchLendingDetails(String barcode);
}
class Fine {
    private Date creationDate;
    private double bookItemBarcode;
    private String memberId;
    public static void collectFine(String memberId, long days) {}
}
