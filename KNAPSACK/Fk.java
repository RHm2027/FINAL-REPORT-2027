package FKnapsack;

import java.util.ArrayList;
import java.util.List;

public class Fk {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(75, 10));  
        items.add(new Item(90, 20));  
        items.add(new Item(135, 30)); 
        items.add(new Item(40, 10));  
        items.add(new Item(60, 15));   

        int capacity = 50;
        FractionalKnapsack obj = new FractionalKnapsack();
        double maxValue = obj.getMaxValue(items, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
