/*
Name: Kaito Meagher
Date: September 3, 2020
*/

class DiceRoll {
  public static void main(String[] args){
    int max = 7;
    int min = 1;
    System.out.println("Dice roll result: " + ((int)(Math.random()* (max - min)) + min) +
    " " + ((int)(Math.random()* (max - min)) + min) + " " + ((int)(Math.random()* (max - min)) + min) + " " +
    ((int)(Math.random()* (max - min)) + min) + " " + ((int)(Math.random()* (max - min)) + min));
  }//end main
}//end class
