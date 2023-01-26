public class Subarray {
    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        int addition=0;
        int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                int end =0;
                for(int k=i;k<=j;k++){
                    System.out.print(n[k]+" ");
                    end+=n[k];
                }
                addition+=end;
                System.out.println(addition);
            if (addition>max){
                max=addition;
            }
            if (addition<min){
                min=addition;
            }
            }

            System.out.println();
        }



        }
        System.out.println(max);
        System.out.println(min);

    }

