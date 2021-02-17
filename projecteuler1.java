public class projecteuler1 {
    int sum=0;
    projecteuler1(){
        for (int i = 0; i <1000 ; i++) {
            if(i%3==0)
                sum+=i;
            else if(i%5==0)
                sum+=i;
            else if(i%15==0)
                sum-=i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        projecteuler1 e =new projecteuler1();
    }
}
