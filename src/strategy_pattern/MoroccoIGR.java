package strategy_pattern;

public class MoroccoIGR implements IEmployeStrategy {
    private final float taux1 = 5;
    private  final float taux2 = 20;
    private final float taux3= 42;
    @Override
    public float calculerIGR(float salaireBrutMensuel) {
        float salaireBrutAnnuel = salaireBrutMensuel*12;
        if(salaireBrutAnnuel <= 40_000) return salaireBrutAnnuel*taux1/100;
        if(salaireBrutAnnuel > 40_000 && salaireBrutAnnuel <= 120_000) return salaireBrutAnnuel*taux2/100;
        if(salaireBrutAnnuel > 120_000) return salaireBrutAnnuel*taux3/100;
        return 0;
    }
}
