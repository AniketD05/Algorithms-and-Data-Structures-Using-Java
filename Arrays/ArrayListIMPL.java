import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIMPL {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number You wish to search: ");
        int num = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(75);
        list.add(55);
        list.add(12);
        list.add(53);

        int size = list.size();
        System.out.println(size);

       for(int i = 0; i < size; i++){
        if(list.get(i) == num){
            System.out.println(i);
            break;
        }
        // if (list.get(i) == (size - 1)) {
        //     System.out.println("Element not found!");
        // }
       }
    }
}
