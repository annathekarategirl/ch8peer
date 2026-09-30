/*
Anna Moore
9/30/2026
Ch8peer
Find largest value in array */
import java.util.Scanner;
public class Ch8peer{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int rows=0;
        int columns=0;
        System.out.print("Enter the number of rows and columns: ");
        rows=scanner.nextInt();
        columns=scanner.nextInt();
        double[] [] myArr=new double[rows][columns];
        System.out.println("Type the array: ");
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){
                myArr[i][j]=scanner.nextDouble();
                //System.out.print(myArr[i][j]);
            }
        }
        /* 
         for(int i=0; i<rows;i++){
            System.out.println();
            for(int j=0; j<columns;j++){
                
                System.out.print(myArr[i][j]+", ");
            }
        }*/
        int[] largest=locateLargest(myArr);
        System.out.println("The location of the largest element is at ("+largest[0]+", "+largest[1]+")");
        
    }
    public static int[] locateLargest(double[][] a){
        //System.out.println(a.length);
        //System.out.println(a[0].length);
        int[] indicies=new int[2];
        double max=0;
        for(int i=0; i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                    indicies[0]=i;
                    indicies[1]=j;
                }
            }
            
        }
        
        return indicies;
    }
}
/* 
//create method withjava docs
/* 
single arrays
loop 
conditionals
two dimenstional array
traverse the arrays
*/
/**
 * description
 * @param varname vardescriptoin
 * @return <varname> "var"Description
 */ 