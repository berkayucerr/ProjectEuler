public class projecteuler4 {
    private int maxI,maxJ;
    private long start,result;
    projecteuler4(){
        LargestPalindrome();
    }

    private void LargestPalindrome(){
        start=System.currentTimeMillis();
        for (int i = 999; i >99 ; i--) {
            for (int j = 999; j >99 ; j--) {
                    if(palindrome(i*j)){
                        maxI=i;
                        maxJ=j;
                        i=99;
                        j=99;
                    }
                }
            }
        System.out.println(result=System.currentTimeMillis()-start);
        System.out.println(maxI+" "+maxJ);
    }

    private boolean palindrome(int i) {
        if(reverse(i)==i)
            return true;
        else
            return false;

    }

    private int reverse(int x) {
        String a;
        a=String.valueOf(x);
        byte[] strAsByteArray = a.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return (Integer.parseInt(new String(result)));
    }

    public static void main(String[] args) {
        projecteuler4 p = new projecteuler4();
    }
}
