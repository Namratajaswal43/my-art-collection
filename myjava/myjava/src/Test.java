public class Test {
    
        public static void main(String[] args) {
        // length() -> returns the number of characters in the string 
        String s = "Hello everyone !";
        int length = s.length();
        System.out.println("length of the given string: "+s+" is: " +length);
        //charAt(index)->returns the character at given index
         char in_string = s.charAt(4);
         System.out.println("character at index 4 is : "+in_string);
        //substring(index) -> helps in string slicing
         String sub = s.substring(5); 
        System.out.println(sub);
        String sub1 = s.substring(2,7); 
        System.out.println(sub1);
        //concatenation
        String d = "Let's learn java! ";
         String new_s = s.concat(d);
        System.out.println("concatenated string : "+new_s);
        //toUpperCase() and toLowerCase()
         System.out.println(new_s.toUpperCase());
          System.out.println(new_s.toLowerCase());
        //trim()-> remove trailing spaces from the string 
        System.out.println(s.trim());
        //contains(sequence)->checks whether sequence is present in string or not 
        System.out.println(s.contains("every"));
         //returns boolean value
        //indexOf(string)-> returns index of given substring
         System.out.println(s.indexOf("every"));
        //replace(target , replacement)-> replaces the target with replacement in the string 
        System.out.println(new_s.replace("everyone" , "friends"));
        //equals(string)->compares string for equality
         System.out.println(s.equals("hehehehe")); 
        System.out.println(s.equals( "myself namrata ! ")); 
        System.out.println(s.equals("Hello everyone !"));
        //split()-> splits the string into substring using the given delimiter
         System.out.println(new_s.split(" "));
         //system.out.println will print memory reference to array
          String[] arr = new_s.split(" ");
        for (String part : arr) {	
            //for each loop 
            System.out.println(part);}
        //reversing a string
        String[] arrr = new_s.split("");
         
        String[] arrr1 = new_s.split("");
        System. out.print("Reversed string is");
        for(int i = arrr.length-1 ; i>=0 ; i--) { 
            System.out.print(arrr[i]); 
        }
    }
}
        
        
