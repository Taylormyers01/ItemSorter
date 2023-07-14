package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {

    public int compare(Item a, Item b){
        if(a.getPrice()-b.getPrice()< 0){
            return -1;
        } else if (a.getPrice()-b.getPrice() > 0) {
            return 1;
        }
        else{
            return (int)(a.getPrice()-b.getPrice());
        }
    }
}
