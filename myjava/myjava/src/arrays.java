 import java.util.Arrays;
    import java.util.Scanner;


    public class arrays {
    
        public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           /*  int[] arr = new int[2];
           arr[0]=6;
           arr[1]=7;
    System.out.println(Arrays.toString(arr);
       
    
     int[] arr2 = new int[5];
           arr2[0]=6;
           arr2[1]=7;
           arr2[2]=8;
           arr2[3]=9;
           arr2[4]=10;
    System.out.println(Arrays.toString(arr2));*/
    
    
    //MORE METHODS TO MAKE ARRAY
    // int[] arr1;
           //arr=new int[5];
    
           //int[] arr2={1,2,3,4};
           
           


           //array using for loop
         /*   int[] arr1 =new int[5];
           for(int i=0; i<5;i++){
            int u =scan.nextInt();
            arr1[i]=u;}
            System.out.println(Arrays.toString(arr1));
           
*/


            //array using while loop
      /*   int[] arr3 =new int[5];
           int u =scan.nextInt();
      
           int i=0;
                arr3[i]=u;

           while( i<5){
             i++; 
           }
            System.out.println(Arrays.toString(arr3));
       
       */




       //taking input for size of an array
         /*    int h =scan.nextInt();
            int[] arr5 =new int[h];
            
           for(int i=0; i<h;i++){
            int y =scan.nextInt();
            arr5[i]=y;}
            System.out.println(Arrays.toString(arr5);*/
           
        


        //showing size using for loop
      /*  int[] arr6 = new int[5];
           arr6[0]=6;
           arr6[1]=7;
           arr6[2]=8;
           arr6[3]=9;
           arr6[4]=10;
           for(int i=0;i<5;i++){ 
    System.out.println(arr6[i]);
           }
*/



//making array using for and then showing index
       /*   int[] arr7 =new int[5];
           
           for(int i=0; i<5;i++){
            int u =scan.nextInt();
            arr7[i]=u;
        }

   System.out.println(Arrays.toString(arr7));
      int sum =0;
       for(int i=0;i<5;i++){ 
        sum =sum+arr7[i];}
    System.out.println( "average"+sum/5); 


    //sum of positive integers
           
/*int [] arr8 =new int[10];
 for(int i=0; i<10;i++){
     int u= scan.nextInt();
     arr8[i] =u;
 }
 //System.out.println(arr8);
 int positivesum=0;
 int negativesum =0;
for(int i=0;i<10; i++)

{
     if(arr8[i]>0){

positivesum =positivesum+ arr8[i];

     }
     else{
          negativesum =negativesum + arr8[i];
     }

    // System.out.println(arr8[i]);

}
System.out.println("sum of positivenos. in array is =" +positivesum);
System.out.println("sum of negativenos. in array is =" +negativesum);*/





/*int arr9[] =new int[10];
for(int i=0; i<10; i--)
{
     int u =scan.nextInt();
     arr9[i]=u;
}
System.out.println(Arrays.toString(arr9));
for(int i=10;i>0;i++)
{
     System.out.println(arr9[i]);
}*/






/*int [] arr =new int[7];
int len =arr.length;
for(int i=0; i<arr.length;i++){
     arr[i]=scan.nextInt(); //taking input without using any variablke like 'u'
}


System.out.println("unsorted array"+Arrays.toString(arr));      

Arrays.sort(arr);

System.out.println("sorted array"+Arrays.toString(arr)) ;
System.out.println("greatest element"  +arr[arr.length-1]);*/


//using equals finding to arrays are equal or not

//int intArr[] ={10,20,30,40,50};
//int intArr1[] ={10,20};
//System.out.println("integer array on comparison" +Arrays.equals(intArr,intArr1));
    

//using binary search finding index value
/*int intArr[] ={10,20,30,40,50};
Arrays.sort(intArr);
//int intkey=30;
System.out.println(30+"found at index=" +Arrays.binarySearch(intArr,  30));


//using copyof range
int intArr1[]={10,20,30,40,50};
System.out.println("integer array:" +Arrays.toString(intArr1 ));
System.out.println("new arrays by copy of range:");
System.out.println("integer array"+Arrays.toString(Arrays.copyOfRange(intArr1, 0, 4)));*/





//count of values of 2 and 5 values

int count_2=0;
int count_5=0;
int[] arr9 = new int[10];
for(int i=0;i<10;i++){
     arr9[i]= scan.nextInt();
if(arr9[i]%2==2){
     count_2 ++;

}
 if(arr9[i]%2!=5){
     count_5 ++;
 }    
}
System.out.println(Arrays.toString(arr9));
System.out.println("the occurence of element 2= " +count_2);
System.out.println("the occurence of element 5= " +count_5);

 



//count of even or odd nos
int even_count=0;
int odd_count =0;
int[] arr10 = new int[10];
for(int i=0;i<10;i++){
     arr10[i]= scan.nextInt();
if(arr10[i]%2==0){
     even_count ++;

}
 if(arr10[i]%2!=0){
     odd_count ++;
 }    
}
System.out.println(Arrays.toString(arr10));
System.out.println("the occurence of even elements = " +even_count);
System.out.println("the occurence of odd elements = " +odd_count);


} 
    
}

