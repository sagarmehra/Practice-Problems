import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int[] choc_array = new int[N];
        int[] sum = new int[N];
        String[] temp = br.readLine().split(" ");
        choc_array[0] = Integer.parseInt(temp[0]);
        sum[0] = choc_array[0];
        for (int i = 1; i < N; i++) {
            choc_array[i] = Integer.parseInt(temp[i]);
            sum[i] = sum[i-1] + choc_array[i];
        }
        int Q = Integer.parseInt(br.readLine());
        int beg = 0, end = N-1, mid = beg+(end-beg)/2;
        for(int i = 0; i < Q; i++){
        	int index = Integer.parseInt(br.readLine());
        	beg = 0; end = N-1;
        	while(beg <= end){
        		mid = beg+(end-beg)/2;
        		if ( sum[mid] < index )
		        	beg = mid + 1;    
			    else
			         end = mid - 1;
		 	    }
        	System.out.println(beg+1);
        }
    }
}
