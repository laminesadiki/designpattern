package decorator_pattern.boissons;

import decorator_pattern.Boisson;

public class Colombia extends Boisson {
    public Colombia(){
        description="Colombia";
    }
    public double cout() {
        return 7.89;
    }
}
