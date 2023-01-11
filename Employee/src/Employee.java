
import java.util.Scanner;


public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxAmount;
    double bonusAmount;
    double salaryIncrease;
    double totalSalary;
    double baseSalary;
    int currentYear=2021;
 Employee(){
     this.name = name;
     this.salary = salary;
     this.workHours = workHours;
 }
static double tax(double salary){
    double taxApplied;

    double taxRate= 0.03;                // as percentage(3%)
    if (salary < 1000){                  // Condition to apply tax rate.
        taxApplied = 0;
    }
    else {
        taxApplied = salary * taxRate;
    }
    return taxApplied;

}


static int bonusPay(double workHours){

    int bonus=0;
    int bonusPerHour = 30; // as TRY
    int totalBonus=0;
   
    if(workHours> 40){                  // Work Hours should be greater than 40 hours to have Bonus!
        while(workHours > 40){          // Add the amount of Bonus Per Hour for each hour worked extra.
            bonus += bonusPerHour;
            workHours -=1;
        }
        totalBonus = bonus;
    }
    
    return totalBonus;
    
}

static int raiseSalary(int hireYear){
    double salaryIncrease=0;
    double raiseRate1 = 5;
    double raiseRate2 = 10;
    double raiseRate3 = 15;
    int currentYear = 2021;
    int workYear;
    workYear = currentYear-hireYear;
    if(workYear< 10){               // Conditions in terms of work year, apply raiseRate differently for each condition.
        salaryIncrease = raiseRate1;
    } else if (workYear< 20 && workYear> 9) {
        salaryIncrease = raiseRate2;
    }   else if (workYear > 19) {
        salaryIncrease= raiseRate3;
    }
            return (int) salaryIncrease; }

    public static void main(String[] args){
     

            Scanner input = new Scanner(System.in); 
            System.out.println("Please Enter Employee Name: ");
            String name= input.nextLine();
            System.out.println("Please Enter Salary: ");
            double salary= input.nextDouble();
            System.out.println("Please Enter Work hours: ");
            int workHours= input.nextInt();                 // workHours: weekly working hours.
            System.out.println("Please Enter Hire Year: ");
            int hireYear= input.nextInt();

            double rTax = tax(salary);
            double rBonus = bonusPay(workHours);
            int rSalaryIncrease= raiseSalary(hireYear);  

            double raiseAmountSalary = rSalaryIncrease * salary / 100 ;
            double netPay = salary+rBonus - rTax;
            double totalPay = salary + rBonus + raiseAmountSalary - rTax;



            System.out.println("Adı : " + name);
            System.out.println("Maaşı : " + salary);
            System.out.println("Çalışma Saati : " + workHours);
            System.out.println("Başlangıç Yılı : " + hireYear);
            System.out.println("Vergi : " + rTax);
            System.out.println("Bonus : " + rBonus);
            System.out.println("Maaş Artışı : " + raiseAmountSalary);
            System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + netPay);
            System.out.println("Toplam Maaş : " +totalPay);
        


    }



}
