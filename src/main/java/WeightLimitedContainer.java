import my.exceptions.PredmetException;
import my.exceptions.PredmetStoreException;

public class WeightLimitedContainer extends Container
{
    private double maxWeight;

    public WeightLimitedContainer(String name, double weight, double maxWeight, String...arg){
        super(name, weight, arg);;
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Predmet pred) throws PredmetException {
        if(this.weight+pred.weight>maxWeight){
            throw new PredmetStoreException("Превышение допустимого максимального веса");
        }
        super.add(pred);
    }

    public double getMaxWeight(){
        return maxWeight;
    }
}
