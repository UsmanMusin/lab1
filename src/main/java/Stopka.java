import my.exceptions.MaxCountException;
import my.exceptions.PredmetException;
import my.exceptions.PredmetIsNotPloskiyException;

import java.util.Stack;
public class Stopka extends Container {

    private int maxCount;

    Stack <Predmet> stack = new Stack <Predmet>();

    private int itemCount() {
        return stack.size();
    };

    public Stopka(String stackName, int maxCount){
        super(stackName,0,"ploskiy");
        this.maxCount = maxCount;
        this.container=stack;
    }

    @Override
    public void add(Predmet foo) throws PredmetException {

        if(itemCount()==maxCount){
            throw new MaxCountException("Превышение высоты стопки");
        }
        if(!foo.isPloskiy()) {
            throw new PredmetIsNotPloskiyException("В стопку нельзя добавить не плоский предмет");
        }
        super.add(foo);


    }


    public Predmet getPredmet(){

        stack.peek().isInserted = false;
        Predmet pr = stack.peek();
        stack.pop();
        return pr;

    }

    @Override
    public void getInfo(){
        System.out.println("Имя стопки: " + getName());
        System.out.println("Максимальная высота стопки: " + maxCount);
        for(Predmet i: stack){
            i.getInfo();
        }
    }

    public void mayAdd(){
        if(itemCount()<maxCount){
            System.out.println("Можно добавить предмет в стопку");
        }
        else{
            System.out.println("В стопке больше нет места");
        }
    }

    @Override
    public String toString(){
        return getName()+" "+Integer.toString(maxCount)+
                " "+Integer.toString(itemCount());
    }


}
