/*
7.4: Write methods to implement the multiply, subtract, and divide operation for
integers by only using addition.
We really need to ask ourselves what is subtraction, multiplication and division in terms of addition 
or the other methods we have created.
Subtraction is negating the second number and adding it to the first. a-b = a+(-1)b
Multiplication is adding a to a, b times.
Negation is essentially capturing the absolute value and using the distance
from 0 in the right direction.
The absolute value, is the negation if the number is negative.
Division is adding b to itself until you reach a.
*/
public class mathOperations{
    public static int negate(int b)
    {
	int constant = 0;
	int number = 0;
	if(b==0) return b;
	else if(b>0) constant = -1;
	else constant = 1;

	while(b!=0)
	    {
		b+=constant;
		number+=constant;
	    }

	return number;
    }
		  
    public static int minus(int a, int b)
    {
	return a+negate(b);
    }
    public static int divide(int a, int b)
	throws java.lang.ArithmeticException{
	    if(b==0){
		throw new java.lang.ArithmeticException("Don't divide by 0.");
	    }
	int absA = abs(a);
	int absB = abs(b);
	int sum = 0;
	int count = 0;
	while(sum<a){
	    sum+=b;
	    count++;
	}
	if(a>0&&b<0||a<0&&b>0) count = negate(count);
	return count;
    }
    public static int multiply(int a, int b)
    {
	if(b>a) return multiply(b,a); //6+6+6 faster than 3+3+3+3+3+3
	int sum = 0;
	for (int i=0;i<abs(b);i++) sum+=a;
	if(b<0) sum = negate(sum);
	return sum;
    }
    public static int abs(int a)
    {
	return (a<0) ? negate(a): a;
    }
    public static void main(String[] args)
    {
	if(minus(6,3) != 3) System.out.println("minus error");
	if(divide(6,3) != 2) System.out.println("divide error");
	if(multiply(6,3) != 18 || multiply(6,-3)!=-18 ||
	   multiply(-3,-6)!=18) System.out.println("mult error");
	divide(6,0);
    }
}