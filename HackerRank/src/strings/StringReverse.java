package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean cond=true;
        for(int i=0,j=A.length()-1;i<j;i++,j--){
            if(A.charAt(i)==A.charAt(j))
                continue;
            else{
                cond=false;
                break;
            }
        }
        if(cond)
            System.out.println("Yes");
        else
            System.out.println("No");
        

	}

}
