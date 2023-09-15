package Lab2c;

interface Chargable{
    public void charge();
}
public class Charger {
    public void charge(Chargable c){
        c.charge();
    }
}
