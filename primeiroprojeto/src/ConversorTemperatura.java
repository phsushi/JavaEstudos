public class ConversorTemperatura {
    private double temperatura;

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }
    public double converter(){
        return (temperatura * 1.8) + 32;
    }

}
