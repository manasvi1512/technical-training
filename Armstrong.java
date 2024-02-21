public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int a=n;
        int count=0, sum=0;
        while(n>0) {
            count++;
            n=n/10;
        }
        n=a;
        while(n>0) {
            int m=n%10;
            sum=sum+(int)(Math.pow(m,count));
            n=n/10;
        }
        if(sum==a){
        System.out.println("it is an Armstrong number");
        }
        else{
            System.out.println("it inot an Armstrong number");
        }
    }
}
