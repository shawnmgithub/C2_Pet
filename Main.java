import java.util.Scanner;
import java.io.*;
import java.io.Serializable;
import java.util.*;
// main will create an instance of gnar
class Main implements Serializable  {
   
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner myScan = new Scanner(System.in);
    Gnar g = new Gnar();
    //setting up the menu
    String menu = "Hello welcome to your virtual gnar pet\n please select from the following options\n 1) tease gnar\n 2) make gnar feel better about himself\n 3) check gnar's anger\n 4) make gnar exercise to make him hungry\n 5) feed gnar a biscuit\n 6) check gnar's hunger\n 7) make gnar do trick\n 8) make gnar say hi\n 9) quit \n S) save\n L) load a previous gnar ";
    boolean choice = true;
    // printing the menu
        System.out.print(menu);
        // while loop to keep menu open until the user is done all of the menu options will just utilize a method from gnar
        while(choice == true){
        String decision = myScan.nextLine();
        if(decision.equals("1")){
            g.makeAngry();
        }
        if(decision.equals("2")){
            g.coolDown();
        }
        if(decision.equals("3")){
            g.getAnger();
        }
        if(decision.equals("4")){
            g.exercise();
        }
        if(decision.equals("5")){
            g.giveBiscuit();
        }
        if(decision.equals("6")){
            g.getHunger();
        }
        if(decision.equals("7")){
            g.doATrick();
        }
        if(decision.equals("8")){
            g.sayHi();
        }
        if(decision.equals("9")){
        choice = false;
        }
        // save
        if(decision.equals("s") ||decision.equals("S") ){
           try{
        FileOutputStream fo = new FileOutputStream("Gnar.dat");
        ObjectOutputStream oOut = new ObjectOutputStream(fo);
        oOut.writeObject(g);
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
        }
        // load
    if(decision.equals("l") || decision.equals("L")){
        try{
        FileInputStream fIn = new FileInputStream("Gnar.dat");
        ObjectInputStream obIn = new ObjectInputStream(fIn);
        g = (Gnar)obIn.readObject();
        System.out.println("your previous gnar was loaded");
    } catch(Exception e){
        System.out.println(e.getMessage());
    }
    }




    
  
  }
}
}
