public class Crossword {
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares)
    {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int cnt = 1;
        for (int i = 0; i < blackSquares.length; i++){
            for (int j = 0; j < blackSquares[0].length; j++){
                puzzle[i][j] = new Square(blackSquares[i][j], 0);
                if(toBeLabeled(i, j, blackSquares)){
                    puzzle[i][j].setNum(cnt++);
                }
            }
        }
        // To be implemented.

    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
    {
        if(blackSquares[r][c]) return false;
        if(r==0 || c==0) return true;
        if(blackSquares[r-1][c] || blackSquares[r][c-1])return true;
        // To be implemented.
        return false;
    }

    public Square[][] getPuzzle(){
        return this.puzzle;
    }
}
