public class Fliptheposition {
    public static void main(String[] args) {
        //flip the position with digit
        int n = 32145;
        int a=n;//to retain original value of n
        int pos= 0;
        double sum=0;
        while(n>0) {
            int d=n%10;
            pos++;
            sum= sum+ pos*(Math.pow(10,d-1));
            n=n/10;
        }
        System.out.println("Flipping the position of "+a+ " gives " +(int)sum);
    }
}
