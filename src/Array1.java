import java.util.Scanner;

public class Array1 {
    public static void main(String[] args){

       Sum();
       userSum();
       Names();
       five();
        reverse();
        Replace();
        match();

    }

    public static void Sum(){
        int values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += i;
            System.out.println();
        }
        System.out.println("Thes sum is " + sum + ".");


    }

    public static void userSum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 different numbers, and I will tell you the sum.");
        int sum = 0, result = 0;
        String display = "";
        int[] user = new int[10];

        for(int i = 0; i < 10; i++) {
            int num = input.nextInt();
            input.nextLine();
            user[i] = num;
            sum += num;
        }
        for(int i = 0 ; i < user.length; i++) {
            result = user[i];
            display += result + ", " ;
        }
        System.out.println("The numbers you put in are " + display.substring(0,display.length()-2) +  ".");
        System.out.println( "The sum is " + sum +".");
        System.out.println();
    }

    public static void Names(){
        String[] names = {"Ali", "Koki", "Metadel"};
        for(int i = 0; i < names.length; i++){
            System.out.println("Hi, My name is " + names[i] + ".");
        }
        System.out.println();
    }

    public static void five(){
        int[] values = {2,5,9,0,2,1,8,5,4};
        String five = "";
        for(int i = 0; i < values.length; i++){
            if (values[i] == 5 ){
                five += i +", ";
            }
        }
        System.out.println("You have 5 at index " + five.substring(0,five.length()-2) + ".");
        System.out.println();
    }
    public static void reverse(){
        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i= 9; i >= 0; i--){
            System.out.print(value[i] + " ");
        }
        System.out.println("\n");
    }
    public static void Replace(){
        String[] array = {"w", "t", "y", "h", "k"};

        for(int i = 0 ; i < array.length; i++){
            if(array[i] == "t"){
                array[i] = "hello";

            }else{
                continue;
            }
        }
        for(int i= 0; i < array.length; i++){
            System.out.print(array[i] + " ");

        }
        System.out.println();

    }

    public static void match(){
        int[] arr1 = {1, 7, 6, 5, 9};
        int[] arr2= {2, 7, 6, 3, 4};
        String match = "";

        for(int i = 0; i < arr1.length; i++){
            for(int j= 0; j< arr1.length; j++){
                if(arr1[i] == arr2[j]){
                    match +=  "( " + arr1[i] + ", " + arr2[j] + " ) ";
                }else{
                    continue;
                }
            }
        }
        if (match.length() == 0){
            System.out.println("There is no match.");
        }else if (match.length() < 9){
            System.out.println(match);
        }else{
            System.out.println(match.substring(0,match.length()-9) + "and " +
                    match.substring(match.length()-9, match.length()));
        }

}


}
