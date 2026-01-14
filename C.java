public class C{
public static void main(String[] args){

double number= 50.34;
int integralpart= (int)number;
double fractionalpart= number-integralpart;
System.out.println("Actual number = " +number);
System.out.println("integral part = " +integralpart);
System.out.println("fractional part = "+fractionalpart);
}
}