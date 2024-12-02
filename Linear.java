class Linear{
    public static void main(String[] args) {
        int mat[][]={{6,3,4},{6,7,8},{2,3,4}};
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==5)
                {
                    System.out.println("Five is present");
                }
                else
                {
                    System.out.println("Not present");
                }
            }
        }
    }
}