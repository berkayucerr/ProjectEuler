import java.util.ArrayList;

public class projecteuler3 {
    private double length;
    private double max;
    projecteuler3(){
    }
    public void primeFactor(){
        ArrayList<Long> a=new ArrayList<Long>();
        long d=600851475143l;
        for (long i = 2; i*i <=d ; i++) {
            if((d%i)==0){
                a.add(((i)));
            }
        }
        for (long i = 0; i <a.size() ; i++) {
            for (long j = 2; j <a.get((int) i)/2 ; j++) {
                if(a.get((int) i)%j==0){
                    j=a.get((int) i);
                }
                if(((j==(a.get((int)i)/2)-1)&&a.get((int) i)%j!=0)){
                    max=a.get((int)i);
                }
            }
        }
        System.out.println((int)max);

    }

    public static void main(String[] args) {
        projecteuler3 p =new projecteuler3();
        p.primeFactor();
    }
}
