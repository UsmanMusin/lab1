import my.exceptions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLabTest {

        Clothes clo_one = new Clothes(2.4, "autumn",
                "botinki", 5400, "leather");

        Clothes clo_A = new Clothes(1.5, "winter",
                "kurtka", 3500, "krasniy", "ploskiy"
        );

        Clothes clo_B = new Clothes(2.5, "winter",
                "palto", 3500, "beliy", "ploskiy", "naturalniy"
        );

        Food foo_C = new Food("bulochka", 1.3, true,
                86.55, "domashnaya", "ploskiy");

        Bag bag_D = new Bag("meshok1", 1, 15,
                15.6, "tryapochniy");

        Box box_E = new Box("korobka1", 1, 3,
                340, "kartonniy", "cherniy");

        Stopka stopka_F = new Stopka("stopka_F", 1);
        Stopka stopka_E = new Stopka("stopka_E", 5);

/*
    @Test
    public void ItselfAddException_test() throws my.exceptions.TryAddInInsertedContainerException, my.exceptions.PredmetAlreadyPlacedException, my.exceptions.TryAddInCloseBoxException, my.exceptions.PredmetStoreException {
        assertThrows(my.exceptions.PredmetStoreException.class,
                ()-> {

                    box_E.openBox();
                    box_E.add(box_E);

                });
        /*try {
            box_E.openBox();
            box_E.add(box_E);
        }
        catch (my.exceptions.ItselfAddException e){
            System.out.println(e.getMessage());
        }
    }

    */
    @Test
    public void MaxCountException_test() throws PredmetException{
        try{
            stopka_F.add(box_E);
            stopka_F.add(bag_D);
        }
        catch (MaxCountException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void PredmetAlreadyPlacedException_test() throws PredmetException {
        bag_D.add(foo_C);

        try{
            stopka_F.add(foo_C);
            //fail()
        }
        catch (PredmetAlreadyPlacedException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void PredmetIsNotPloskiyException_test() throws PredmetException{
        try{
            stopka_F.add(clo_one);
        }
        catch (PredmetIsNotPloskiyException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void PredmetStoreException_test() throws PredmetException {
        box_E.openBox();
        assertThrows(PredmetStoreException.class,
        ()-> {
            box_E.add(foo_C);
            box_E.add(clo_B);
        });
    }

    @Test
    public void TryAddInInsertedContainerException_test() throws PredmetException {
        bag_D.add(box_E);
        try{
            box_E.openBox();
            box_E.add(foo_C);
        }
        catch (TryAddInInsertedContainerException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void other_one() throws PredmetException {
        stopka_E.add(clo_B);
        stopka_E.add(clo_A);
        assertTrue(stopka_E.getPredmet() == clo_A);

    }

    @Test
    public void other_getinfo() throws PredmetException {
        bag_D.add(clo_one);
        bag_D.add(clo_A);
        bag_D.getInfo();
    }

}