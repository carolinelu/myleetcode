package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleI {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(numRows <= 0) return result;
		List<Integer> firstlist = new ArrayList<>();
		firstlist.add(1);
		result.add(firstlist);
		for(int i=2; i<=numRows; i++){
			List<Integer> subresult = new ArrayList<>();
			for(int j=0;j<i;j++){
				if(j <= (i-1)/2){
					if(j == 0){
						subresult.add(1);
					}else{
						int first = result.get(i-2).get(j-1);
						int second = result.get(i-2).get(j);
						subresult.add(first+second);
					}
				}else{
					subresult.add(subresult.get(i-1-j));
				}	
				System.out.print(subresult.get(j));
			}
			result.add(subresult);
			System.out.println();
		}
		return result;
    }
	
	public static void main(String args[]){
		PascalsTriangleI pt = new PascalsTriangleI();
		pt.generate(1);
		
		
	}
}
