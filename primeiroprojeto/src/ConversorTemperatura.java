public class ConversorTemperatura {
    private double temperatura;

    public void setTemperatura(double temperatura){

        this.temperatura = temperatura;
    }
    public double converter(){
        final double conversor = 1.8;
        return (temperatura * conversor) + 32;
    }

}
