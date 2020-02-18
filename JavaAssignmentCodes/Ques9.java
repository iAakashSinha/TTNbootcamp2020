//Write a program to display values of enums using a constructor & getPrice() method
// (Example display house & their prices)

public class Ques9 {

    enum House {
        oneBhk(30), twoBhk(40), threeBhk(50), fourBhk(60), fiveBhk(70);
        private int price;
        House(int p) {
            price = p;
        }

        int getPrice() {
            return price;
        }
    }

    public static void main(String args[]){
        System.out.println("All House prices:");
        for (House home : House.values()) System.out.println(
                home + " costs " + home.getPrice() + " Lakh Rupees.");
    }

    }



