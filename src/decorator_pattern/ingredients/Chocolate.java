package decorator_pattern.ingredients;

import decorator_pattern.Boisson;
import decorator_pattern.DecorateurIngredient;

public class Chocolate extends DecorateurIngredient {
    public Chocolate(Boisson boisson) {
        super(boisson);
    }

    public String getDescription() {
       return boisson.getDescription() + ", Chocolate";
    }

    public double cout() {
        return 0.20 + boisson.cout();
    }
}
