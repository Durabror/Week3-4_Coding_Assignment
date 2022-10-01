import java.util.ArrayList;
import java.util.List;

public class Application {

  public static int[] addX(int n, int ages[], int x) {
    int i;
    int newAges[] = new int[n + 1];
    for(i = 0; i < n; i++) {
      newAges[i] = ages[i];
    }
    newAges[n] = x;
    return newAges;
  }
  public static void main(String[] args) {
    //1.a
    int n = 8;
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
    System.out.println(ages[ages.length - 1] - ages[0]);
    
    //1.b
    int x = 7;
    ages = addX(n, ages, x);
    System.out.println(ages[ages.length - 1] - ages[0]);
    
    //1.c
    int total = 0;
    for(int i = 0; i < ages.length; i++) {
      total = total + ages[i];
    }
    int average = total / ages.length;
    System.out.println("The average age is: " + average);
    
    //2.a
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    double totalLetters = 0;
    for( String name: names ) {
      totalLetters += name.length();
    }
    double avgLetters = totalLetters / names.length;
      
    System.out.println("The average number of letters in the names is: " + avgLetters);
    
    
    //2.b

    for (int k = 0; k < names.length; k++) {
      String namesList = names[k] + " ";
      System.out.print(namesList);      
    }
    System.out.println("");
    
  


    //3
    //To access the last element of an array you would type array[array.length - 1]
    
    //4
    //To access the first element of an array you would type array[0]
    
    //5
    int[] nameLengths = new int[names.length];
    for (int l = 0; l < names.length ; l++) {
      nameLengths[l] = names[l].length();
    }
    
    //6
    int sum = 0;
    for (int m : nameLengths) {
      sum += m;
    }
    System.out.println("The sum of the letters is " + sum);
    
    //7 test
    System.out.println(multiplyString("Hello", 3));
    
    //8 test
    System.out.println(fullName("Kevin", "Parsons"));
    
    //9 test
    int[] numbers = {55, 42, 6};
    System.out.println(greaterThan100(numbers));
      
    //10 test
    double[] num = {10, 15, 47, 31};
    System.out.println(average(num));
    
    //11 test
    double[] group1 = {12, 11, 15, 17};
    double[] group2 = {4, 3};
    System.out.println(isGreaterThan(group1, group2));
    
    //12 test
    System.out.println(willBuyDrink(false, 12));

    
   
  }
  
  //7
  public static String multiplyString(String str, int num) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < num; i++) {
      result.append(str);
    }
    return result.toString();
  }
  
  //8
  public static String fullName(String firstName, String lastName) {
    String name = firstName + " " + lastName;
    return name;
  }
  
  //9
  public static boolean greaterThan100(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    if (sum > 100) {
      return true;
    } else {
      return false;
    }
  }
  
  //10
  public static double average(double[] num) {
    double sum = 0;
    for (int i = 0; i < num.length; i++) {
      sum += num[i];
    }
    double average = sum / num.length;
    return average;
  }
  
  //11
  public static boolean isGreaterThan(double[] group1, double[] group2) {
    double sum1 = 0;
    double sum2 = 0;
    for (int i = 0; i < group1.length; i++) {
      sum1 += group1[i];
    }
    double avg1 = sum1 / group1.length;
    for (int j = 0; j < group2.length; j++) {
      sum2 += group2[j];
    }
    double avg2 = sum2 / group2.length;
    if (avg1 > avg2) {
      return true;
    } else {
      return false;
    }
    
  }
  
  //12
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    if (moneyInPocket > 10.50 && isHotOutside == true) {
      return true;
    } else {
      return false;
    }
  }
  
  //13
  /**
   * Determines if I should take a fight in a game based on levels
   * @return if the fight should be taken
   */
  //made this method because I play a lot of video games and taking this into account could prevent a death
  public static boolean takeFight(int myLevel, int theirLevel) {
    if(myLevel > theirLevel) {
      return true;
    } else {
      return false;
    }
  }

}




  

    
    




  


