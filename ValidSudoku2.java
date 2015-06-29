package leetcode;

public class ValidSudoku2 {
	public boolean isValidSudoku(char[][] board) {
		if(board == null || board.length < 8) return false;
		for(int i=0;i<9;i++){
			int[] nine = new int[10];
			for(int j=0;j<9;j++){
				if(board[i][j] == '.') continue;
				int temp = Integer.parseInt(board[i][j]+"");
				if(nine[temp] == temp) return false;
				else nine[temp] = temp;
			}
		}
		
		for(int i=0;i<9;i++){
			int[] nine = new int[10];
			for(int j=0;j<9;j++){
				if(board[j][i] == '.') continue;
				int temp = Integer.parseInt(board[j][i]+"");
				if(nine[temp] == temp) return false;
				else nine[temp] = temp;
			}
		}
		
		for(int start=0;start<9;start++){
			int i = start/3, j = start%3;
			int[] nine = new int[10];
			for(int k=0; k<9; k++){
				int ii = i*3 + k/3, jj =j*3 + k%3;
				if(board[ii][jj] == '.') continue;
				int temp = Integer.parseInt(board[ii][jj]+"");
				if(nine[temp] == temp) return false;
				else nine[temp] = temp;
			}
		}
        return true;
    }
	
	public static void main(String args[]){
		ValidSudoku2 vs = new ValidSudoku2();
		char[][] board = {{'.','8','7','6','5','4','3','2','1'},{'2','.','.','.','.','.','.','.','.'},{'3','.','.','.','.','.','.','.','.'},{'4','.','.','.','.','.','.','.','.'},{'5','.','.','.','.','.','.','.','.'},{'6','.','.','.','.','.','.','.','.'},{'7','.','.','.','.','.','.','.','.'},{'8','.','.','.','.','.','.','.','.'},{'9','.','.','.','.','.','.','.','.'}};
		System.out.print(vs.isValidSudoku(board));
	}
}
