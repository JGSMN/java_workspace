package section06;

public class Practice006_04 {
  public static void main(String[] args) {
    

    int nextRow = 0;
    int nextCol = 2;
    
    int count = 1;
    
    int[][] mabang = new int[5][5];
    mabang[nextRow][nextCol] = count++;

    while(count <= 25) {
      nextRow--;
      nextCol++;

      if (nextRow < 0 && nextCol < 5) {
        nextRow = 4;
        }
      if (nextRow >= 0 && nextCol == 5) {
        nextCol = 0;
        }
      if (nextRow < 0 && nextCol > 4) { 
        nextCol -= 1;
        nextRow += 2;
      }
      if (mabang[nextRow][nextCol] != 0) {
          nextRow += 2;
          nextCol -= 1;
      }
      mabang[nextRow][nextCol] = count++;
      if (count == 26) {
        break;
      }
          

    }
    for (int i = 0; i < mabang.length; i++) {
      for (int j = 0; j < mabang[i].length; j++) {
        System.out.print(mabang[i][j] + " \t");

      }
      System.out.println();
    }

  }
  }

