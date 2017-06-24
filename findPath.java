public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
              if(matrix==null)
              	return false;

              for(int i=0;i<rows;i++)
              {
              	for(int j=0;j<cols;j++)
              	{
              		int [][] flag = new int[rows][cols];
               		if(hasPath(matrix,rows,cols,str,flag,i,j,0))
              			return true;
              	}
              }
              return false;
    }
    private boolean hasPath(char[] matrix,int rows, int cols,char[] str,int [][] flag,int row,int col,int len)
    {
              int index= row+cols+col;
              if(row<0||row>=rows||col<0||col>=cols||matrix[index]!=str[len]||flag[row][col]==1)
              	 return false;
              if(len=str.length)
              	return true;
              	flag[row][col]=1;
              	return hasPath(matrix,rows, cols,str,flag,row-1,col,len+1)||
              	hasPath(matrix,rows, cols,str,flag,row,col-1,len+1)
              	||hasPath(matrix,rows, cols,str,flag,row+1,col,len+1)
              	||hasPath(matrix,rows, cols,str,flag,row,col+1,len+1);

    }
 }