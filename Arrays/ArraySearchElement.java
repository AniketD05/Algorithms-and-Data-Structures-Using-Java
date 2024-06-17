
public class ArraySearchElement{

    public static int SearchElement(int arr[], int num, int size){

        for(int i = 0; i < size; i++){

            if(arr[i] == num){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args){

        int arr[] = {5,9,6,7,8};

        int num = 8;

        int size = arr.length;
        int result = ArraySearchElement.SearchElement(arr, num, size);

        if(result != -1){
            System.out.println("Number Found At index " + result);
        } else {
            System.out.println("Number Not found!");
        }

    }
}