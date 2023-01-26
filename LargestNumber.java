import java.util.*;
public class LargestNumber {
    public static int LargestNum(int num[]){
        int value=Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++){
            if (num[i]>value){
                value=num[i];
            }
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int p1=sc.nextInt();
        int p2=sc.nextInt();
        int p3=sc.nextInt();
        int p4=sc.nextInt();
        int p5=sc.nextInt();
        int num[] ={p1,p2,p3,p4,p5};
        System.out.println(LargestNum(num));


    }
    }

