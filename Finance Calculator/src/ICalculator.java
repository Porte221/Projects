/*
 * Design an interface to impelment various methods within the FinanceCalculator class
 */

/**
 *
 * @author Jerome
 */

public interface ICalculator {
    
    
   /**
    * 
    * @param numberOfPayments
    * @param annualInterestRate
    * @param paymentAmount
    * @return loanAmount
    */
   double calculate(int numberOfPayments, float annualInterestRate, double paymentAmount);

  
  /**
   * Calculate the number of payments
   * @param annualInterestRate
   * @param loanAmount
   * @param paymentAmount
   * @return numberOfPayments
   */
  int calculate(float annualInterestRate, double loanAmount, double paymentAmount);
  
  /**
   * 
   * @param annualInterestRate
   * @param loanAmount
   * @param numberOfPayments
   * @return paymentAmount
   */
  double calculate(float annualInterestRate, double loanAmount, int numberOfPayments);
  
  /**
   * 
   * @param loanAmount
   * @param paymentAmount
   * @param numberOfPayments
   * @return Annual interest rate
   */
  float calculate(double loanAmount, int numberOfPayments, double paymentAmount);

      
}
