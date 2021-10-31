package decorator_pattern.ingredients;

import decorator_pattern.Boisson;
import decorator_pattern.DecorateurIngredient;

public class Vanilla extends DecorateurIngredient {
    public Vanilla(Boisson boisson) {
        super(boisson);
    }

    public double cout() {
        return 3.40 + boisson.cout();
    }

    public String getDescription() {
        return boisson.getDescription() + ", Vanilla";
    }

}
