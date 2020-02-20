// Qoes 10: Design classes having attributes and method(only skeleton) for a coffee shop. There are three different actors in our scenario and i have listed the different actions they do also below
//
//        * Customer
//        - Pays the cash to the cashier and places his order, get a token number back
//        - Waits for the intimation that order for his token is ready
//        - Upon intimation/notification he collects the coffee and enjoys his drink
//        ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order. Customer always likes the drink served. Exceptions like he not liking his coffee, he getting wrong coffee are not considered to keep the design simple.)
//
//        * Cashier
//        - Takes an order and payment from the customer
//        - Upon payment, creates an order and places it into the order queue
//        - Intimates the customer that he has to wait for his token and gives him his token
//        ( Assumption: Token returned to the customer is the order id. Order queue is unlimited. With a simple modification, we can design for a limited queue size)
//
//        * Barista
//        - Gets the next order from the queue
//        - Prepares the coffee
//        - Places the coffee in the completed order queue
//        - Places a notification that order for token is ready



import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ques10 {
    public static void main(String[] args) {

    }
    }


class Barista implements QueueOfPendingOrder,QueueOfCompletedOrder {
    String name;
    QueueOfPendingOrder queueOfPendingOrder;
    QueueOfCompletedOrder queueOfCompletedOrder;
    @Override
    public void remove(Order order) {
        queueOfPendingOrder.remove(order);
        System.out.println(order + "removed from Pending queue");
    }
    public void makeCoffee(Order order){
        System.out.println("Making coffee for " + order);
    }
    public void notifyAboutCompletedOrder(Customer customer,Order order) {
        System.out.println(customer + "your order " + order + " has been completed");
    }
    @Override
    public void addToCompleteOrderQueue(Order order) {
        queueOfCompletedOrder.addToCompleteOrderQueue(order);
        System.out.println(order + " added to Completed queue");
    }
}
class Cashier extends Order implements QueueOfPendingOrder {
    String name;
    QueueOfPendingOrder queueOfPendingOrder;
    List<Customer> customerList;
    public Cashier(String name,Long id) {
        super(id);
        this.name = name;
        customerList = new ArrayList<>();
    }
    String AcceptOrderAndAddCustomerToCustomerList(Customer customer,Order order,double cash) {
        customerList.add(customer);
        System.out.println("Accepted order");
        return "token";
    }
    void addOrderInOrderQueue(Order order){
        queueOfPendingOrder.add(order);
        System.out.println(order + " added to order queue");
    }
}
class Customer {
    private String name;
    private String token;
    Cashier cashier;
    Order order;
    double amount;
    void placeOrder() {
        token = cashier.AcceptOrderAndAddCustomerToCustomerList(this,order,amount);
        System.out.println("This is the order token: " + token);
    }
    boolean waitingState(){
        System.out.println("Customer" + this.name + "is waiting");
        return true;
    }
    boolean drinkingState() {
        System.out.println("Customer " + this.name + " has collected coffee");
        return true;
    }
}
class Order {
    private Long id;
    public Order(Long id) {
        this.id = id;
    }
}
interface QueueOfPendingOrder {
    Queue<Order> queue = new PriorityQueue<>();
    default void add(Order order){
        queue.add(order);
    }
    default void remove(Order order) {
        queue.remove(order);
    }
}
interface QueueOfCompletedOrder {
    default void addToCompleteOrderQueue(Order order) {
        Queue<Order> queue = new PriorityQueue<>();
    }
}








