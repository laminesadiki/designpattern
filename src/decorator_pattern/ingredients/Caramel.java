package decorator_pattern.ingredients;

import decorator_pattern.Boisson;
import decorator_pattern.DecorateurIngredient;

public class Caramel extends DecorateurIngredient {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }

    @Override
    public double cout() {
        return 2.90 + boisson.cout();
    }
}
