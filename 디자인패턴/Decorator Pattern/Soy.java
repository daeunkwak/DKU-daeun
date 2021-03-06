package daeunkwak.decorator;

public class Soy extends Condiment{
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Soy";
    }
}

