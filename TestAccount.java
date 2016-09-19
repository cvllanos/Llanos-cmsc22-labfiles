/*
 * A Test Driver for the Account class.
 */

/* Code by Catherine Llanos */

public class TestAccount {
   public static void main(String[] args) {

      // Test constructor and toString()
      Account a1 = new Account(123, 987.65); // A/C no:xxx, Balance = $xxx.xx
      System.out.println(a1);  // toString()
 
      // Test Setters and Getters
      a1.setBalance(44.44);
      System.out.println(a1);  // run toString() to inspect the modified instance
      System.out.println("The account number is: " + a1.getAccountNumber());
      System.out.println("The balance is: " + a1.getBalance());
 
      // Test setDate()
      a1.credit(100);
      System.out.println(a1);  // toString()
      a1.debit(10);
      System.out.println(a1);
      a1.debit(555); // test debit() error
      System.out.println(a1); 
   }
}