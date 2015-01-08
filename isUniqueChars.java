public class isUniqueChars{
    public static Boolean isUnique(String str)
    {
	if(str.length()>128) return false;
	boolean[] characters = new boolean[256];
	for(int i=0; i<str.length(); i++)
	    {
		int val = str.charAt(i);
		if(characters[val])
		    return false;
		else characters[val] = true;
	    }
	return true;
    }
    public static void main(String []args)
    {
	System.out.println(isUnique("il"));
    }
}