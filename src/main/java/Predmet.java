
import java.util.HashSet;
import java.util.Iterator;

public class Predmet {
    private String name;
    protected double weight;
    boolean isPloskiy() {
        return properties.contains("ploskiy");
    }

    boolean isInserted = false;
    HashSet <String> properties = new HashSet <String>();
    Iterator <String> iterProperties = properties.iterator();
    Predmet(String name, double weight, String...arg){
        this.name = name;
        this.weight = weight;
        if(arg.length>0){
            for(String i: arg){
                properties.add(i);

            }
        }
    }

    public void getInfo(){
        System.out.println("\nИмя предмета: " + name);
        System.out.print("Свойства предмета: ");
        int k = 0;
        for(String i: properties){
            k++;
            System.out.print(i);
            if(k<properties.size()){
                System.out.print(", ");
            }
        }
       // System.out.println(String.join(", ", properties));
        /*while(iterProperties.hasNext()){
            System.out.print(iterProperties.next());
        }
        */
        System.out.println();

    }

    public String getName(){
        return name;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return name;
    }


    }
