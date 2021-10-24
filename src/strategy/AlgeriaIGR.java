package strategy;

public class AlgeriaIGR implements IEmployeStrategy {
    private final float algeriaTaux= 35;
    @Override
    public float calculerIGR(float salaireBrutMensuel) {
        float salaireBrutAnnuel = salaireBrutMensuel*12;
        return salaireBrutAnnuel*algeriaTaux/100;
    }
}
