public class Reverse_an_array {
    public static void Reverse(int num[]){
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
        int num[]={1,2,3,4};
        Reverse(num);
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
