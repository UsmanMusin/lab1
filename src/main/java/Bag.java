
import java.util.*;
import java.util.Iterator;

public class Bag extends WeightLimitedContainer{
    private double cost;
    Bag(String name, double weight, double maxWeight, double cost, String...arg){
        super(name,weight,maxWeight,arg);
        this.cost = cost;
    }


    public void getInfo(){
        super.getInfo();
        System.out.println("Вес: " + weight);
        System.out.println("Максимальная нагрузка: " + this.getMaxWeight());
        System.out.println("Цена: " + cost);
        for(Predmet i: container){
            i.getInfo();
        }
    }

    public void getRandomPredmet(){
        int random_number = 0 + (int) (Math.random() * container.size());
        ArrayList <Predmet> list = new ArrayList<Predmet>();
        list.addAll(container);
        System.out.println("Случайный предмет №"+(random_number+1));
        System.out.println(list.get(random_number));
    }

    public void findByName(String byName){
        int p=0;
        for(Predmet i: container){
            if(i.getName()==byName){
                System.out.print("Найден предмет по имени "+byName+":");
                System.out.println(" "+i); p=1;
            }
        }
        if(p==0){
            System.out.println("Предмета по имени "+byName+" в мешке нет");
        }
    }

    @Override
    public String toString(){
        return Double.toString(cost)+" "+Double.toString(this.getMaxWeight())+" "+
                Double.toString(weight)+" "+this.getName();
    }




}
