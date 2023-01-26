import java.util.*;
public class Palindrome_array {
    public static void reverse(int num[]){
        int first=0,last=num.length-1;
        while(first<last){
            int tempo=num[last];
            num[last]=num[first];
            num[first]=tempo;
            first++;
            last--;

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
       a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        int num[]={a,b,c,d};
        reverse(num);
        int ans=0;
        for (int i=0;i<num.length;i++){
            ans=(ans*10+num[i]);
        }
        System.out.println(ans);
    }
}
