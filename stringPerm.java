public class stringPerm{
	 public static boolean perm(String s, String t)
	 {
	     if(s.length()!=t.length())
		 return false;
	     int[] letters = new int[256];
	     char[] s_arr = s.toCharArray();
		 for(char c: s_arr)
		     letters[c]++;
	     for(int i=0;i<t.length();i++)
		 {
		     int c = (int) t.charAt(i);
		     if(letters[c]==0)
			 return false;
		 }
	     return true;
	 }
	 public static void main(String[] args)
	 {
	     System.out.println(perm("pop","pop"));
	 }
}
/*                                                                                                                                     
1.3 Given two strings, write a method to decide if one is a permutation of the other.                                                  
1. Clarify what is meant by permutation. Is it case-sensitive?                                                                         
2. For example, is God a permutation of dog?                                                                                           
3. Is whitespace to be considered?                                                                                                     
Assuming it is sensitive to space and case:                                                                                            
If two strings are different lengths, they cannot be permutations.                                                                     
                                                                                                                                       
There are two ways we can go about it:                                                                                                 
1) Sort the arrays, and iterate through them to ensure they are the same. This is going to be slower because we need to sort and then \
iterate.                                                                                                                               
2) Faster: tally number of occurences of ASCII characters in a letter array                                                            
                                                                                                                                       
Sorting method:                                                                                                                        
public class permsSort{                                                                                                                
                                                                                                                                       
public static String sort(String str)                                                                                                  
{                                                                                                                                      
    char[] content = str.toCharArray();                                                                                                
    java.util.Arrays.sort(content);                                                                                                    
    return new String(content);                                                                                                        
}                                                                                                                                      
                                                                                                                                       
public static boolean perm(String s, String t)                                                                                         
{                                                                                                                                      
    if(s.length()!=t.length())                                                                                                         
        return false;                                                                                                                  
    return sort(s).equals(sort(t));                                                                                                    
}                                                                                                                                      
                                                                                                                                       
public static void main(String []args){                                                                                                
System.out.println(perm("dog","god"));                                                                                             
}                                                                                                                                      
}                                                                                                                                      
 */
