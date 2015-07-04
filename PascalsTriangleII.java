package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < rowIndex + 1; i++) {
			res.add(1);
			for (int j = i - 1; j > 0; j--) {
				res.set(j, res.get(j - 1) + res.get(j));
			}
		}
		return res;
	}

	public static void main(String args[]) {
		PascalsTriangleII pt = new PascalsTriangleII();
		List<Integer> test = pt.getRow(3);
		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i) + "-");
		}

	}
}
