package oopsProject;

public class Household {
	String b="Thank you";
	
public static void main(String[] args) {
	 String name="Gowri";
	 long mobile= 2407680987L;
	 float salary= 900000.85f;
	 int grossery= 620;
	 byte carInsurance= 100;
     float schoolFee= 22000.60F;
     int healthInsuranace=500;
     short otherExpenses=12200;
     float spentMoney=grossery+carInsurance+schoolFee+healthInsuranace+otherExpenses;
     double Monthly=salary-(grossery+carInsurance+schoolFee+healthInsuranace+otherExpenses);
     float spentMoney2=spentMoney*12;
     double yearly=(salary-grossery+carInsurance+schoolFee+healthInsuranace+otherExpenses)*12;
     System.out.println("name: "+name);
     System.out.println("mobile: "+mobile);
     System.out.println("salary: "+salary);
     System.out.println("Money Spent on grassery: "+grossery);
     System.out.println("Money Spent on carinsurance: "+carInsurance);
     System.out.println("Money Spent on schoolFee: "+schoolFee);
     System.out.println("Money Spent on healthinsuranace:"+healthInsuranace);
     System.out.println("otherExpenses: "+otherExpenses);
     System.out.println("Monthly spent the money: "+spentMoney);
     System.out.println("Total amount monthly: "+Monthly);
     System.out.println("Yearly spent the money: "+spentMoney2);
     System.out.println("Total amount yearly: "+yearly);
     Household myhousehold=new Household();
     System.out.println(myhousehold.b);
     
    }
}
