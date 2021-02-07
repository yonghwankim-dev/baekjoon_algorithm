/**
 * 힙정렬 응용 : 우선순위 큐
 */

package BOJ_11279;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0;i<tc;i++)
		{
			int key = Integer.parseInt(br.readLine());
			
			if(key==0)
			{
				if(queue.size()==0)
				{
					System.out.println(0);
				}
				else
				{
					System.out.println(queue.poll());
				}
			}
			else 
			{
				queue.add(key);
				
			}
		}
	}
}
