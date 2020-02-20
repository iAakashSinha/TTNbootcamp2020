//Ques 9: Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables.
// There are stress and fire tests for each products.

import javafx.scene.control.Tab;

import java.util.Date;

public class Ques9 {
    public static void main(String[] args) {

        Chair woodenChair = new Chair("NeelKamal",1000,"wooden");
        Chair metalChair = new Chair("blueLotus",1200,"metal");

        Table woodenTable = new Table("NeelKamal",2000,"wooden");
        Table metalTable = new Table("blueLotus",2200,"metal");

        System.out.println("Details of Wooden Chair-------------------------------");
        System.out.println(woodenChair.manufacturer);
        System.out.println(woodenChair.price);
        System.out.println(woodenChair.type);
        System.out.println(woodenChair.fireTest());
        System.out.println(woodenChair.stessTest());

        System.out.println("Details of Metal Chair-------------------------------");
        System.out.println(metalChair.manufacturer);
        System.out.println(metalChair.price);
        System.out.println(metalChair.type);
        System.out.println(metalChair.fireTest());
        System.out.println(metalChair.stessTest());

        System.out.println("Details of Wooden Table-------------------------------");
        System.out.println(woodenTable.manufacturer);
        System.out.println(woodenTable.price);
        System.out.println(woodenTable.type);
        System.out.println(woodenTable.fireTest());
        System.out.println(woodenTable.stessTest());

        System.out.println("Details of Metal Table-------------------------------");
        System.out.println(metalTable.manufacturer);
        System.out.println(metalTable.price);
        System.out.println(metalTable.type);
        System.out.println(metalTable.fireTest());
        System.out.println(metalTable.stessTest());
    }

}

class Furniture{
    String manufacturer;
//    Date manufaturingDate;
    float price;

//    Furniture(){}
    Furniture(String manufacturer, float price){
        this.manufacturer = manufacturer;
//        this.manufaturingDate= manufaturingDate;
        this.price = price;
    }

    public String stessTest(){

        return "Stress Test Passed";
    }
    public String fireTest(){

        return "Fire Test Passed";
    }
}

class Chair extends Furniture{
    String type ;

    Chair(String manufacturer, float price, String type){
        super(manufacturer,price);
        this.type = type;
    }
}

class Table extends Furniture{
    String type ;

    Table(String manufacturer, float price, String type){
        super(manufacturer,price);
        this.type = type;
    }
}
