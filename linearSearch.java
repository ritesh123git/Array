import java.util.Scanner;
public class linearSearch {
    public static int LinearSearch(int numbers[] ,int key ){
        for (int i=0;i< numbers.length ;i++){//code to find the position of 10
            if (numbers [i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int LinearSearch(String Dishes[],String b) {

        for (int i = 0; i < Dishes.length;i++){
            if (Dishes[i] == b) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10,12,};
        String Dishes[]={"Dhosa", "Vada", "Shambhar"};
        String key1="Vada";
        int key=10;
        System.out.println(LinearSearch(numbers,key));
        System.out.println(LinearSearch(Dishes,key1));
    }
}
