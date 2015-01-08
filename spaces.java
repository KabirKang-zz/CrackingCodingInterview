public class spaces{
    public static void spaceReplace(String str, int length)
    {
    }
    public static void main(String[] args)
    {
	System.out.println("Hello world");
    }
}

/*
Question 1.4
Write a method to replace all spaces in a string with '%20'. 
You may assume that the string has sufficient space at the 
end of the string to hold the additional characters and that 
you are given the true length of the string.
Input: "Mr John Smith    ", 13
Output: "Mr%20John%20Smith"

Strategy:
Java strings are immutable. Use an array of characters so that this can be done in place.
1. Go through the array and count how many spaces are in the text part of the array.
2. Calculate the total length which will be used for the reverse iteration. The total length would be length+numSpaces*2
3. Make the value at position "length" equal to the null terminator '\0'
4. Iterate from the back of the text part of the array: when you encounter a space, make the character at str[totalLength-1] = '0' etc
5. Substract 3 from the newLength in each round so that we can move iteratively from the back of the array
6. If str[i] != ' ' then make the position in the very back equal to that letter and subtract 1 from new length so we can keep moving
 */