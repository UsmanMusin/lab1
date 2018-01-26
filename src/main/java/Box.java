

public class Box extends WeightLimitedContainer {
    private double volume;
    private boolean closeStatus=true;
    Box(String name, double weight, double maxWeight, double volume, String...arg){
        super(name, weight, maxWeight,arg);
        this.properties.add("ploskiy");
        this.volume = volume;
    }


    public void getInfo(){
        super.getInfo();
        System.out.println("Вес: " + weight);
        System.out.println("Максимальная нагрузка: " + this.getMaxWeight());
        System.out.println("Объем: " + volume);
        for(Predmet i: container){
            i.getInfo();
        }
    }

    public void openBox(){
        closeStatus = false;
    }

    public void closeBox(){
        closeStatus = true;
    }

    public boolean get_open_closeStatus(){
        return closeStatus;
    }

    @Override
    public String toString(){
        return Double.toString(volume)+" "+Double.toString(this.getMaxWeight())+" "+
                Double.toString(weight)+" "+this.getName();
    }





}
