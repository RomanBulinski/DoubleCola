import java.util.ArrayList;
import java.util.List;

public class Main {


    String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };


    public static String WhoIsNext(String[] names, int n) {
        int peopleUmonut = names.length;

       if(n<peopleUmonut){
           return  names[n-1];
       }else{
           int counter =1;
           int sum = peopleUmonut;
           while ( (sum + (sum*2)) < n) {
               sum = sum + (sum*2);
               counter++;
           }
           int rest = n-sum;

           List<String> tempString = new ArrayList<>();

           for(int j=0; j<names.length; j++){
               for(int i=0; i<counter+2; i++){
                   tempString.add(names[j]);
               }
           }
           return tempString.get(rest);
       }
       

    }

}
