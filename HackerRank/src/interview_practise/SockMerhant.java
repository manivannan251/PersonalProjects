package interview_practise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerhant {

	static int sockMerchant(int n, int[] ar) {
		Map<Integer,Integer> count = new HashMap<>();
		int pair = 0;
		for(int i=0;i<ar.length;i++) {
			if(count.containsKey(ar[i])) {
				pair++;
				count.remove(ar[i]);
			}
			else
				count.put(ar[i], 1);
				
		}
		return pair;


    }
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Op.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println("The number of pairs is "+result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

	}


