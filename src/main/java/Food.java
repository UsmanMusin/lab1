
public class Food extends Predmet{
    private boolean outOfDate;
    private double cost;
    Food(String name,double weight, boolean outOfDate, double cost, String...arg){
        super(name, weight,arg);
        this.outOfDate = outOfDate;
        this.cost = cost;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("Вес: " + weight);
        System.out.print("Срок годности: ");
        if(outOfDate){
            System.out.println("годен");
        }
        else{
            System.out.println("не годен");
        }
        System.out.println("Цена: " + cost);
    }




    @Override
    public String toString(){
        return Double.toString(cost)+" "+Boolean.toString(outOfDate)+" "+
                Double.toString(weight)+" "+this.getName();
    }


    public double getWeight(){
        return weight;
    }

}
