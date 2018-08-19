class leapyear
{
public static void main(String[]args)
{
int a=Integer.parseInt(args[0]);
if(a%4==0&&a%100==0||a%400==0 )
{

System.out.println("this is leap year");
}
else
{
System.out.println("not a leap year");
}
}
}