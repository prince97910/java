import java.io.*;
 
// Class 1
class Bankcoustomer{
    // data members of the class.
	int accno;
    String acctype;
    double amtfield;
 
    // Constructor would initialize data members
    // With the values of passed arguments while
    // Object of that class created
    Bankcoustomer(int accno, String acctype, double amtfield)
    {
        accno = accno;
        acctype = acctype;
		amtfield = amtfield;
    }
}
 
// Class 2
class Bank {
    // main  method
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        Bankcoustomer b1 = new Bankcoustomer(97910,"saving", 1855);
		Bankcoustomer b2 = new Bankcoustomer(97911,"current",2300);
		Bankcoustomer b3 = new Bankcoustomer(97985,"joint",4855);
        System.out.println("bank details of account holders"+b1 );
		System.out.println("bank details of account holders"+b2 );
		System.out.println("bank details of account holders"+b3 );
    }
}