import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;
public class scanner {
//Jeanine Najjar    Lab section 21
	public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
    
	 System.out.print("Enter required Income ") ;
     int requiredIncome = input.nextInt() ;
     System.out.print("Enter expected SSI income ") ;
     int SSI = input.nextInt() ;
     System.out.print("Enter years retired ") ;
     double yearsRetired = input.nextDouble(); 
     System.out.print("Enter annual return (0-3%)") ;
     double annualReturn = input.nextDouble(); 
     System.out.print("How many years do you plan to work? ") ;
     int yearsToWork = input.nextInt() ;

//p: present value
//f: future value
//y: payment (in each period)   10000-2642 required income- monthly SSI
//r: rate
//n: number of periods
               //t: type (true=pmt at end of period, false=pmt at begining of period)

double PV;
double p;
double f;
double y;
double r;
double n;
boolean t;

p = 0;
f = 0;
y = (requiredIncome - SSI);
r = (.01 * annualReturn)/12;
n =  yearsRetired * 12 ;
t = false;

PV = FinanceLib.pv(r, n, y, f,t);

System.out.println(PV);

double PMT;

System.out.print("Enter annual return (0-20%)") ;
double annualReturn1 = input.nextDouble(); 

r = (.01 * annualReturn1)/12;
n = yearsToWork * 12;
p = 0;
f = PV;
t = false;

PMT = FinanceLib.pmt(r, n, p, f, t);

System.out.println(PMT);
	} }



