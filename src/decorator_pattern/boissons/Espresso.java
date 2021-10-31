package decorator_pattern.boissons;

import decorator_pattern.Boisson;

public class Espresso extends Boisson {
    public Espresso(){
        description="Espresso";
    }
    public double cout() {
        return 1.99;
    } }
