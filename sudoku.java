public class sudoku {
    public static void main(String[] args) {
        int[][] board=new int[][]{{5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}};

        if (solve(board)){
            display(board);
        }else{
            System.out.println("no");
        }

    }
    static boolean solve(int[][] board){
        int n= board.length;
        int col=-1;
        int row=-1;

        boolean empty=true;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c]==0){
                    col=c;
                    row=r;
                    empty=false;
                    break;

                }
            }
            //if empty element is found in the row
            if (empty==false){
                break;
            }

        }
        if (empty==true) {
            return true;
        }

        //backtracking
        for (int numb = 1; numb <=9 ; numb++) {
            if(isSafe(board,row,col,numb)){
                board[row][col]=numb;
                if(solve(board)){
                    return true;
                }else{
                    //backtrack
                    board[row][col]=0;
                }
            }
        }
        return false;

    }

    private static void display(int[][] board) {
        for (int[] row : board){
            for(int num: row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row , int col , int num){
        //check full row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i]==num){
                return false;
            }
        }

        //check full col
        for(int[] nums:board){
            if(nums[col]==num){
                return false;
            }
        }

        //check full box
        int sqrt=(int)(Math.sqrt(board.length));
        int rowStart= row-row%sqrt;
        int colStart = col-col%sqrt;

        for (int i = rowStart; i < rowStart+sqrt; i++) {
            for (int j = colStart; j < colStart+sqrt; j++) {
                if (board[i][j]==num){
                    return false;
                }

            }
        }
        return true;


    }

}


