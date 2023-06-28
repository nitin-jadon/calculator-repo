class CalculatorTest
{
public static void main(String[] args)
{
	Calculator c = new Calculator();
if(c.add(1,2) == 3)
{
	System.out.println("Test case passed");
};

if(c.sub(2,1) == 1)
{
	System.out.println("Test case passed");
};

if(c.mul(2,4) == 8)
{
	System.out.println("Test case passed");
};
}
}