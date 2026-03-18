      //gross salary ^
public class gross_salary {
     public static void main(String[] args) {
        int basic=35000;
        int TA=basic*5/100;
        int DA=basic*12/100;
        int PF=basic*10/100;
        int totalsalary=basic+TA+DA;
        int grossalary=totalsalary-PF;
        System.out.println(grossalary);

    }   
}
