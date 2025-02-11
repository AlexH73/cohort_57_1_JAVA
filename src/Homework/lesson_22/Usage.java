package Homework.lesson_22;

import java.util.Arrays;

public class Usage {
    public static void main(String[] args) {
        ProductTemp apple = new ProductTemp(1.5, "apple");
        ProductTemp orange = new ProductTemp(2.0, "orange");
        ProductTemp tomato = new ProductTemp(2.5, "tomato");
        // ProductTemp product = new ProductTemp();

        // массив ProductTemp:
        ProductTemp[] products = new ProductTemp[0]; // {}
        // products[0] = apple;
        System.out.println("Arrays.toString(products) = " + Arrays.toString(products));

        // Arrays.copyOf(массив, размер) -  создаст копию массива "массив" с указанным количеством ячеек "размер",
        // в нашем примере, увеличит размер на 1
        products = Arrays.copyOf(products, products.length + 1); // {null}
        System.out.println("Arrays.toString(products) = " + Arrays.toString(products));

        products[products.length - 1] = apple;

        System.out.println("Arrays.toString(products) = " + Arrays.toString(products));

        StoreTemp groceryStore = new StoreTemp(products);


        StoreTemp mechanicStore = new StoreTemp();

        ProductTemp engine = new ProductTemp(1500.0, "Engine");
        mechanicStore.addProduct(engine);

    }
}
