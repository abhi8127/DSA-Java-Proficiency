package MasaiSchool.module1211;

import java.util.Scanner;

public class UnitConsume {
    /*
    The problem here involves calculating electricity units consumed based on a given bill amount, which includes a fixed charge of Rs. 80. The slab rates for electricity consumption are provided as follows:

0 to 50 units: Rs. 3 per unit
51 to 150 units: Rs. 5 per unit
Above 150 units: Rs. 10 per unit
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the bill");

        int bill=sc.nextInt();
        int totalBill=bill-80;
        int unitConsume=0;

        if(totalBill>0)
        {
            int slab1cost=50*3;
            if(totalBill<=slab1cost)
            {
             unitConsume=unitConsume+totalBill/3;
                System.out.println(unitConsume);
                return;
            }
            else{
                unitConsume=unitConsume+50;
                totalBill=totalBill-slab1cost;
            }
        }

        if(totalBill>0)
        {
            int slab2cost=100*5;
            if(totalBill<=slab2cost)
            {
                unitConsume=unitConsume+totalBill/5;
                System.out.println(unitConsume);
                return;

            }
            else {
                unitConsume=unitConsume+100;
                totalBill=totalBill-slab2cost;
            }
        }

        if(totalBill>0)
        {
            unitConsume=unitConsume+totalBill/10;
        }

        System.out.println(unitConsume);
    }
}
