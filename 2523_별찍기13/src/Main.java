import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int k=1;
		int i=1;
		int len = N*2-1;
		
		while(k<=len) 
		{
			for(int t=0;t<i;t++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(k<N) {
				i++;
			}else {
				i--;
			}
			k++;
		}
	}

}
