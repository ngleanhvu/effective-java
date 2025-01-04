package org.ngleanhvu.chapter_02.builder_pattern;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    protected enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping t) {
            toppings.add(Objects.requireNonNull(t));
            return self();
        }

        protected abstract T self();

        public abstract Pizza build();
    }

    public Pizza(Builder<?> builder) {
        this.toppings = builder.toppings.clone(); // giup dam bao tinh bat bien, ngan ngua thay doi tu ben ngoai
    }

}
