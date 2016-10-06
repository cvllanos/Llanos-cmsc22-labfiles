/*
 * Date
 */

/* Code by Catherine Llanos */

public class Date {

      // 3 private instance variables day, month, and year.
      private int year;
      private int month;
      private int day;

      // Constructors, public getters and setters for the private instance variables.

      // default blank constructor which will set the date to 1/1/1000
      public Date() {
      	this.year = 1000;
      	this.month = 1;
      	this.day = 1;
      }

      public Date(int year, int month, int day) {
      	this.year = year;
      	this.month = month;
      	this.day = day;
      }

      // public getters
      public int getYear() {
      	return this.year;
      }
      public int getMonth() {
      	return this.month;
      }
      public int getDay() {
      	return this.day;
      }

      // public setters
      public void setYear(int year) {
      	this.year = year;
      }
      public void setMonth(int month) {
      	this.month = month;
      }
      public void setDay(int day) {
      	this.day = day;
      }

      // A method setDate(), which sets the day, month and year.
      public void setDate(int year, int month, int day) {
      	this.year = year;
      	this.month = month;
      	this.day = day;
      }

      // error-checking
      public void checkDate(int year, int month, int day) {
            if (year < 1000 || year > 9999) {
                  System.out.println("year invalid!");
            }

            if (month <= 0 || month > 12) {
                  System.out.println("month invalid!");
            }

            if (day <= 0 || day > 31) {
                  System.out.println("day invalid!");
            }

            if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) {
                  System.out.println("day invalid!");
            }

            if (((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) && (month == 2) && (day > 29)) {
                  System.out.println("day invalid! it's a leap year.");
            }
      }

      /* A toString(), which returns "DD/MM/YYYY", with leading zero for DD and MM if applicable.
         * Write the Date class and a test driver to test all the public methods. */
      public String toString() {
      	return String.format("%02d/%02d/%4d", month, day, year);
      }

}
