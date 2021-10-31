package decorator_pattern;

import decorator_pattern.boissons.Colombia;
import decorator_pattern.boissons.Espresso;
import decorator_pattern.ingredients.Caramel;
import decorator_pattern.ingredients.Chocolate;

public class Main {
    public static void main(String[] args) {
        Boisson b1=new Espresso();
        System.out.println(b1.getDescription()+" € "+b1.cout());
        Boisson b2=new Colombia();
        b2=new Caramel(b2);
        b2=new Chocolate(b2);
        b2=new Chocolate(b2);
        System.out.println(b2.getDescription()+" € "+b2.cout());
    }
}
