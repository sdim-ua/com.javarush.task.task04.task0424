import java.io.*;


/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        
        
        if (num1 != num2 && num2 == num3){
            System.out.println(1);
        }
        else if (num2!= num3 && num3 == num1 ){
            System.out.println(2);
        }
        else if (num3 != num2 && num2 == num1) {
            System.out.println(3);
        }    
    }
}
