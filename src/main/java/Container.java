import my.exceptions.*;

import java.util.Collection;
import java.util.HashSet;

public class Container extends Predmet {
    Collection<Predmet> container = new HashSet <Predmet>();

    Container(String name, double weight, String...arg){
        super(name, weight, arg);;

    }


    public void add(Predmet pred) throws PredmetException {
        if(this.isInserted){
            throw new TryAddInInsertedContainerException("Нельзя добавить в контейнер, помещенный в другой контейнер");
        }
        if(this==pred){
            throw new ItselfAddException("Нельзя добавлять самого в себя");
        }

        if(pred.isInserted == true){
            throw new PredmetAlreadyPlacedException("Данный предмет уже помещен в контейнер");
        }
        this.weight+=pred.weight;
        pred.isInserted = true;
        container.add(pred);

    }



}
