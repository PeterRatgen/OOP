import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.*;

public class Average{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    ArrayList<Double> averageList = new ArrayList<Double>();

    System.out.println("Enter three numbers to compute average of:");
    Pattern p = Pattern.compile("\\d+\\n");

    while(!input.hasNext(p)){
      averageList.add(input.nextDouble());
    }

    int size = averageList.size();

    double average = 0;
    while(!averageList.isEmpty()){
      average += averageList.remove(0);
    }

    System.out.println("The average is: " + (average/size));
    
  }
}
