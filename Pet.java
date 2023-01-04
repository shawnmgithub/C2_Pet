import java.io.Serializable;
// implements the 2 interfaces, all of those methods need tto be utilized in some way
public abstract class Pet implements NeedsFood, HasEmotions,Serializable {
  int hunger = 0;
  int rage = 0;
  public Pet(){
    int hunger = 0;
    int rage = 0;
  }
// methods to be implemented in the gnar class
  public abstract void doATrick();
  public abstract void sayHi();
// implemented methods

//it will have a MakeAngry method that will print somthing and increase rage by 1
  public void  makeAngry(){
  System.out.println("that was rude");
  if(rage < 5){
  rage = rage + 1;
  }}
  // it will have a coolDown method that wll print somthing and decrease rage by 1 
  public void coolDown(){
      System.out.println("that was nice");
      if (rage > 0){
          rage = rage -1;
          }
  }
  // it will have a get anger method that prints the rage with some text.
  public void getAnger(){
      if (rage == 0 ){
          System.out.println("gnar! :D");
      }
      if (rage == 1){
          System.out.println("gnar! :)");
      }
      if (rage == 2){
          System.out.println("gnar! :|")  ;
      }
      if (rage == 3){
          System.out.println("gnar =/");
      }
      if (rage ==4){
          System.out.println("gnar?!?! -_- ");
      }
      if (rage == 5){
          System.out.println("GNAAAAAARRRRRRRRRRRRRRR!!!!! :(");
      }
  }
  // it will have a getHunger method that will print the hunger value in a fun way with if methods.
  public void getHunger(){
      if (hunger == 0 ){
          System.out.println("gnar! (full)");
      }
      if (hunger == 1){
          System.out.println("gnar! (mostly full)");
      }
      if (hunger == 2){
          System.out.println("gnar! (gettin hungry)")  ;
      }
      if (hunger == 3){
          System.out.println("gnar (hungry)");
      }
      if (hunger ==4){
          System.out.println("gnar?!?! (hungry hungry)");
      }
      if (hunger == 5){
          System.out.println("Gnar? (starving)");
      }
  }
     // it will have a givebiscuit method that will print somthing decrease hunger by 1
  public void giveBiscuit(){
      System.out.println("is for me?");
      if(hunger>0)  {
          hunger = hunger - 1;
      }
  }
  // it will have a exercise method that will print somthing and increase hunger by 1
  public void exercise(){
    System.out.println("gnar does some sprints, they look more hungry than before");
    if(hunger<5){
        hunger = hunger+1;
    }
  }

} 
