public class J3_4 {
 public static void main(String[] args) {
  int[][] a=new int[][]{{11,12},{21,22}};
  int[][] b=new int[4][6];
  int[][] c=arrayCoppy(a, b);
  for(int i=0;i<c.length;i++){
   for(int j=0;j<c[i].length;j++){
    System.out.printf("%2d", c[i][j]);
    System.out.print(" ");
   }
   System.out.println();
  }
 }
 public static int[][] arrayCoppy(int[][] a,int[][] b){
  System.arraycopy(a[0], 0, b[1], 2, 2);
  System.arraycopy(a[1], 0, b[2], 2, 2);
  return b;
 }
}