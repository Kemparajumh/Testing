import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("Enter the numbers: ");
        while (scan.hasNextInt()){
            int num = scan.nextInt();
            list.add(num);
        }

        int randomIndex = indexGen.nextInt(list.size());
        System.out.println("Random index is: " + randomIndex);
        System.out.println("Random value :" + list.get(randomIndex));

//        System.out.println(list);


    }
}

///////////////////////////////////////////////////////////////////////////////////

//import java.util.*;
//
//public class Activity13 {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        Random indexGen = new Random();
//
//        System.out.print("Enter integers please ");
//        System.out.println("(EOF or non-integer to terminate): ");
//
//        while(scan.hasNextInt()) {
//            list.add(scan.nextInt());
//        }
//
//        Integer nums[] = list.toArray(new Integer[0]);
//        int index = indexGen.nextInt(nums.length);
//        System.out.println("Index value generated: " + index);
//        System.out.println("Value in arary at generated index: " + nums[index]);
//
//        scan.close();
//    }
//}