
public class Clothes extends Predmet {
    private String season;
    private double cost;
    Clothes(double weight, String season, String name, double cost, String...arg){
        super(name,weight,arg);
        this.cost = cost;
        this.season = season;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("Вес: " + weight);
        System.out.println("Сезон: " + season);
        System.out.println("Цена: " + cost);
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public String toString(){
        return Double.toString(cost)+" "+season+" "+
                Double.toString(weight)+" "+this.getName();
    }

}
