public class Pattern {

    public static void pyramid(int num){

        for(int i = 0; i < num; i++){

            for(int j = 0; j < num - i - 1; j++){
                System.out.print("   ");
            }

            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print(" * ");
            }


            System.out.println();
        }
    }

    public static void pyramid2(int num){

        for(int i = 0; i < num; i++){

            for(int j = 0; j < i; j++){
                System.out.print("   ");
            }

            for(int j = 0; j < 2*num - (2 * i + 1); j++){
                System.out.print(" * ");
            }


            System.out.println();
        }
    }

    public static void pyramid3(int num){

        for(int i = 0; i < num; i++){

            for(char ch = 'A'; ch <= 'A' + (num - i - 1); ch++){
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){

        int num = 5;
       
        Pattern.pyramid3(num);
    }
}
