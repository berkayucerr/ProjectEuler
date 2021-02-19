public class projecteuler55
{

    projecteuler55(String x){
        int temp;
        int varInteger=Integer.parseInt(x);
        for (int i = 0; i <varInteger ; i++) {
            temp=(reverse(i)+i);
            if(reverse(temp)==temp){
                System.out.println(i+ " is a palindrome");
            }
        }

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

}