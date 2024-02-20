public class ifElse {
    //finding the greatest number
    //using nested if else
    public static void main(String[] args) {
    int a=10;
    int b=5;
    int c=2;
    if(a>b)
    {
        if(a>c)
        {
            System.out.println("a is greatest");
        }
        else {
            System.out.println("c is greatest");
        }
    }
        else {
            if(b>c)
            {
                System.out.println("b is greatest");
            }
            else {
            System.out.println("c is greatest");
            }
        }
    }
}
