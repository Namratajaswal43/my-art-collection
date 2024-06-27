
    import java.util.*;
    public class twod_arrays {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
       
          /*   int [][] arr =new int[3][3];
            for(int i=0;i<3;i++){
                for(int j=0; j<3;j++){ 
                int n = scan.nextInt();
              
                arr[i][j] =n;
            }}
       System.out.println(Arrays.deepToString (arr));
       System.out.println("the value of index arr[1][2]"+arr[1][2]);
      
    */
    
    /*String [][] arr1 =new String[3][3];
            for(int i=0;i<3;i++){
                for(int j=0; j<3;j++){ 
                String n = scan.nextLine();
              
                arr1[i][j] =n;}}
    System.out.println(Arrays.deepToString (arr1));
       System.out.println("the value of index arr[1][1]"+arr1[1][1]);
      */


//to get even or odd nos in an 2d array

       /*  int [][] arr =new int[5][5];
        int sum=0;
            for(int i=0;i<5;i++){
                for(int j=0; j<5;j++){ 
                 
                    
                int n = scan.nextInt();
              
                arr[i][j] =n;
                sum =sum +arr[i][j];   //sum of array
            }}
       System.out.println(sum);
       for(int u=0;u<5;u++){
        for(int v=0;v<5;v++) {
            if(arr[u][v]%2!=0){
                System.out.println(arr[u][v]);
            }
        }
       }
       //System.out.println("the value of index arr[1][2]"+arr[1][2]);*/
   
   
   //count of values of 2 and 5 values
int count_2=0;
int count_5=0;
int[][] arr9 = new int[3][3];
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){ 
     arr9[i][j] = scan.nextInt();
if(arr9[i][j]==2){
     count_2 ++;

}
 if(arr9[i][j]==5){
     count_5 ++;
 }    }
}
System.out.println(Arrays.toString(arr9));
System.out.println("the occurence of element 2= " +count_2);
System.out.println("the occurence of element 5= " +count_5);
  



//count of even or odd nos
int even_count=0;
int odd_count =0;
int[][] arr10 = new int[3][3];
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){ 
     arr10[i][j] = scan.nextInt();
if(arr10[i][j]%2==0){
     even_count ++;

}
 if(arr9[i][j]%2!=0){
     odd_count ++;
 }    
}}
System.out.println(Arrays.toString(arr10));
System.out.println("the occurence of even elements = " +even_count);
System.out.println("the occurence of odd elements = " +odd_count);

    }
        
    }


