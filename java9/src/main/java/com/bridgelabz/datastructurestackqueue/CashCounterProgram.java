package com.bridgelabz.datastructurestackqueue;

import com.bridgelabz.utility.UtilityScanner;
/**
 * Cash counter program:where we show the balance in the account or add the amount to the bank 
 * withdraw the amount form the bank
 * @author Lokesh naik
 * */

public class CashCounterProgram
{   /**This we taken default Bank balance amount*/
public static int bankbalances=10000;
BankQueue bank=new BankQueue();
public static void main(String[] args)
{
System.out.println("Welcom to Bank Queue");
/**here we are creating object CashCounterQueue to call that method*/
CashCounterProgram repeat=new CashCounterProgram();
repeat.bankingLine();
}
/**
* This Method is used to calculate the bank balance
* {@value  CashCounterProgram#bankingLine()   }
* @return   bankbalances
*/
public static int bankBalance(int amt)
{
  if(amt<bankbalances)
  {
if(amt>0)
{

bankbalances=bankbalances+amt;
}else
{
bankbalances=bankbalances+amt;
}
  }else
  {
  System.out.println("Bank balance is to low you can't Withdrow money");
  }
return bankbalances;
}
          /**
           * This method frequently ask for Queue operation for add person to
           * queue and remove person from queue and while dequeue it ask to user
           * to deposit and Withdraw money on bank
           */
          public  void bankingLine()
          {
           

           int amountAdd = 0;
           int choice=0;
           int person=0;
       
               do {
            System.out.println();
                System.out.println("Enque           --> 1");
                System.out.println("Deque           --> 2");  
                System.out.println("Bank Balance    --> 3");
                System.out.println("Person in Queue --> 4");
                System.out.println("Exit program    --> 5");
                choice=UtilityScanner.integerInput();
                switch(choice)
                {
                case 1: /**Person is used add person into the queue */
                person++;
                int addpeson=person;
                     bank.enque(addpeson);  
                     System.out.println("Person "+ addpeson +" is added on Queue");
                     break;
                case 2:
                System.out.println("Select your choice");
                System.out.println("Deposit Cash  : 1");
                System.out.println("Withdraw Cash : 2");              
                int select=UtilityScanner.integerInput();
                   
                     
                switch(select)
              {
              case 1:
                                    /**Here we taking amount for deposit and pass this
                  *value for further calculation*/
              System.out.println("How much amount you want to Deposit");
              amountAdd=UtilityScanner.integerInput();
              bank.deque();
              CashCounterProgram.bankBalance(amountAdd);
              break;
              case 2:
              /**For withdraw money we are taking amount in negative*/
              int minus;
              System.out.println("How much amount you want to Withdraw");
            amountAdd=UtilityScanner.integerInput();
            minus=-1*amountAdd;
            CashCounterProgram.bankBalance(minus);
            bank.deque();              
            break;
              default:
              System.out.println("please Enter the amount for Transaction");
           
           
              }                
                      break;
                case 3:
            /**Here we check bank balance*/        
            System.out.println("Bank balance is " + bankbalances);
            break;
                case 4:
                  /**Here we are displaying number in person in queue*/
                bank.display();
                break;
                case 5:
                	choice=5;
                	break;
              default:
              {
            	  System.out.println("Enter correct choice:");
              }
              break;
                }
                
                
         
                }while(choice ==1 ||choice ==2 ||choice==3||choice==4);
         
         
          }
}
