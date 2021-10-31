package decorator_pattern.boissons;

import decorator_pattern.Boisson;

public class Sumatra extends Boisson {
    public Sumatra(){
        description="Sumatra";
    }
    public double cout() {
        return 8.99;
    }
}
