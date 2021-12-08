
package Application;

import Model.entities.Account;
import Model.exception.DomainException;
import java.util.Scanner;

/**
 *
 * @author Gussta
 */
public class Program {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        
        System.out.println("Enter account data:");
        System.out.println("Number:");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.println("Withdraw limit:");
        double withdrawLimit = sc.nextDouble();
        
        Account account = new Account(number, holder, balance, withdrawLimit);
        
        System.out.println("");
        System.out.println("Enter amount for withdraw:");
        double amount = sc.nextDouble();
        
       try{  
            account.withdraw(amount);
            System.out.println("New balance : " + account.getBalance());
        }
       
        catch(DomainException e ){
            System.out.println(e.getMessage());
        }
        
    
        
        
    }
    
}
