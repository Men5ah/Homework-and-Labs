public class Test{
    public static void main(String[] args) {
        int[][] intArr = {{1,2,3},{4,5,6},{7,8,9}};
        int row, col;
        for(row=0;row<intArr.length;row++){
            for(col=0;col<intArr[row].length;col++){
                if(row==0){
                    System.out.print(intArr[row][col]+" ");
                }
            }
        }
        for(col=0;col<intArr.length;col++){
            for(row=0;row<intArr[col].length;row++){
                if(col==0){
                    System.out.print(intArr[row][col]+" ");
                }
            }
        }
    }
}