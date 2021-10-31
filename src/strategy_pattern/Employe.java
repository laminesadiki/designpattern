package strategy_pattern;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    private IEmployeStrategy employeStrategy;

    public Employe(String cin, float salaireBrutMensuel) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public float calculerIGR() {
        float salaireBrutAnnuel = salaireBrutMensuel*12;
        float taux=42;
        return salaireBrutAnnuel*taux/100;
    }

    public float getSalaireNetMensuel() {
        float igr=calculerIGR();
        float salaireNetAnnuel=salaireBrutMensuel*12-igr;
        return salaireBrutMensuel/12;
    }

    public void setEmployeStrategy(IEmployeStrategy employeStrategy) {
        this.employeStrategy = employeStrategy;
    }
}
