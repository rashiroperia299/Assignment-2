class reverse
{  
public static void main(String[] args)
{  
int r,sum=0,temp;    
int n=Integer.parseInt(args[0]);   
while(n>0)
{    
r=n%10;  
sum=(sum*10)+r;    
n=n/10;
}
System.out.println(sum);
  
}
}