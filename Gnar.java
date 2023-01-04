import java.io.Serializable;
import java.util.*;
//gnar will extend pet. pet implemented my interfaces
public class Gnar extends Pet implements Serializable {
    int hunger = 0;
   int rage = 0 ;
public Gnar(){
    boolean isMega = false;
    int rage = 0;
   int hunger = 0;
}
public void sayHi(){
    System.out.println("hi");
}

public void doATrick(){
    System.out.println("does a little dance");
}

}
