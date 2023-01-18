package BOJ.G5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class BOJ_G5_9251_LCS {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new StringReader(src));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		dp = new int[str1.length()+1][str2.length()+1];
		
		for(int i = 1; i <= str1.length(); i++) {
			for(int j = 1; j <= str2.length(); j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		System.out.println(dp[str1.length()][str2.length()]);
	}
	private static String src = "ACAYKP\n" + 
			"CAPCAK";

}
