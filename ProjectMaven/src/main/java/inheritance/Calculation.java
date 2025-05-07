package inheritance;

public class Calculation extends Input{
Float hra;
Float pf;

public void Calculate()
{
	hra=0.05f*basicpay;
	pf=0.20f*basicpay;
}
}
