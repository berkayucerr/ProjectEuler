public class projecteuler2 {
    projecteuler2(){
        iterative();
    }
    private void iterative(){
        int a=1,b=2,c=1,sum=0;
        while (c<=4000000) {
            if (b % 2 == 0) {
                sum = sum + b;
            }
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(sum);

    }
    private void recursiveFib(){
        int sum=0,temp=0,i=0;
        while(temp!=4000000){
            temp=fibonacci(i);
            if(temp%2==0){
                sum+=temp;
                System.out.println(temp);
            }
            i++;}

        System.out.println(sum);
    }
    private int fibonacci(int x){
        if(x==2||x==1)
            return 1;
        else if(x==0)
            return 0;
        else
            return (fibonacci(x-2)+fibonacci(x-1));
    }

    public static void main(String[] args) {
        projecteuler2 e =new projecteuler2();
    }
}
