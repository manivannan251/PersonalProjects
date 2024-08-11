package executors;

import java.util.Random;

public class OrderServer {

    public static Order getNextOrder() {
        Random randomInt = new Random();
        return new Order(randomInt.nextInt(0,10000));
    }
}
