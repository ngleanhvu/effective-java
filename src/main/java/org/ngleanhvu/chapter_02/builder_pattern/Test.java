package org.ngleanhvu.chapter_02.builder_pattern;

public class Test {
    public static void main(String[] args) {
        Pizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.HAM)
                .build();

        System.out.println(nyPizza.toppings);
    }
}
