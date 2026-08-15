class Solution{
    public List<Integer> spiralOrder(int[][] mat){

        //Initializing List
        List<Integer> ans=new ArrayList<>();

        int m=mat.length;      //row count
        int n=mat[0].length;   //column count

        int srow=0;
        int erow=m-1;
        int scol=0;
        int ecol=n-1;

        while(srow<=erow && scol<=ecol){

            //Top
            for(int j=scol; j<=ecol; j++ ){
                ans.add(mat[srow][j]);
            }
            srow++;
            //Right
            for(int i=srow; i<=erow; i++){
                ans.add(mat[i][ecol]);
            }
            ecol--;
            //Botton
            if(srow<=erow){
                for(int j=ecol; j>=scol; j--){
                    ans.add(mat[erow][j]);
                }
            }
            erow--;
            //Left
            if(scol<=ecol){
                for(int i=erow; i>=srow; i--){
                    ans.add(mat[i][scol]);
                }
            }
            scol++;
        }
        return ans;
    }
}