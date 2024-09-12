package Challenge;

public class playWithDice {
    public static void main(String[] args) {


         while(true){
             double Random=Math.random();
              int diceNumber=(int)(10*Random);
              if(diceNumber<=6 && diceNumber>=1){
                  System.out.println("In Dice this number come "+diceNumber);
                  break;
              }
         }
    }
}
