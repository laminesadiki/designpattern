package strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employe employe = new Employe("1111",12_000);
        Scanner clavier = new Scanner(System.in);
        while(true) {
            System.out.println("Choisir une stratégie : ");
            String nomStrategy =clavier.next();
            if(nomStrategy.equals("quit")) break;
            try {
                Class c = Class.forName(nomStrategy);
                IEmployeStrategy strategy = (IEmployeStrategy) c.newInstance();
                employe.setEmployeStrategy(strategy);
                System.out.println(employe.calculerIGR());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
