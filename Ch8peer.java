import java.util.Scanner;
public class Ch8peer{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int rows=0;
        int columns=0;
        double[] [] myArr=new double[rows][columns]
        System.out.print("Enter the number of rows and columns");
        rows=scanner.nextInt();
        columns=scanner.nextInt();
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){
                myArr[i][j]=scanner.nextDouble();
            }
        }
    }
}
/* 
//create method withjava docs
/* 
single arrays
loop 
conditionals
two dimenstional array
*/
/**
 * description
 * @param varname vardescriptoin
 * @return <varname> "var"Description
 */ 