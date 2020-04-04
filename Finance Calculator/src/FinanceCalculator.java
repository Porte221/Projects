/*
 * Objective:  You have been hired by CarsAndCars to write a Car payment calculator application. 
The UI mockups are getting done by the customer and you are required to follow the requirements once they are complete.
However, the decision has not yet been made if this application will be a desktop application, a web application, or a mobile application.
What you know is that backend business logic needs to be implemented using latest java and should be able to be called by any driver application.

Requirements: 
- let the user enter any three values from 
  1. Loan amount 2.Num of payments 3.Annual Interest Rate 4. Payment Amount
Once any of the values are entered you should calculate the fourth value.
Payment zero is not acceptable
number of payments needs to be greater than 2 but less than 72
A negative interest rate is not allowed to be input
Zero is a legal interest rate 

Design a class called financeCalculator and overload 4 methods called calculator
that take in different parameters and different return types
 */

/**
 *  This class maintains the elements of a Finance calculator
 * @author Xavier Porter
 * 
 * 
   
 */


public class FinanceCalculator implements ICalculator{

    //Declare field variables
    private double loanAmount;
    private int numberOfPayments;
    private float annualInterestRate;
    private double paymentAmount;
    
    //Constructor
    public FinanceCalculator(){
        
    }
    
 //Method to retrive the loanAmount
    public double getLoanAmount(){
        return loanAmount;
    }
    
    //Set a loan amount
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    //Set the annual interest rate
    public void setAnnualInterestRate(float annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    //get number of payments
    public double getNumberOfPayments(){
        return numberOfPayments;
    }
    
    //set number of payments
    public void setNumberOfPayments(int numberOfPayments){
        this.numberOfPayments = numberOfPayments;
    }
    
    //get payment amount
    public double getPaymentAmount(){
        return paymentAmount;
    }
    
    //set payment amount
    public void setPaymentAmount(double paymentAmount){
        this.paymentAmount = paymentAmount;
    }
   
   //Calculates the loan Amount
    public double calculate(int numberOfPayments, float annualInterestRate, double paymentAmount){
        double loanAmount;
        float monthlyInterest = (annualInterestRate / (12 * 100));
        double exponent = Math.pow(1 + monthlyInterest, numberOfPayments);

        loanAmount = paymentAmount * ((exponent) - 1) / (monthlyInterest * exponent);
       
        //Return amount
        return loanAmount;
    }
    
    //Calculate number of payments
    public int calculate( float annualInterestRate, double loanAmount, double paymentAmount){
        
        if (loanAmount <= 0){
            //base case
            return 0;
        }
        
        //Calculate monthlyInterest
        float monthlyInterest = ((annualInterestRate / (12 * 100)));
        
        //Calculate compounded 
        double compounded = (paymentAmount / (loanAmount * monthlyInterest));
        
        //calculate rate
        double rate = 1 + monthlyInterest;
        
        //Calculate difference
        double difference = compounded / (compounded - 1);
       
        //Return number of payments
        return (int)(Math.log(difference) / Math.log(rate)) + 1;
    }
    
    //Calculate the payment amount
    public double calculate(float annualInterestRate, double loanAmount, int numberOfPayments){
        
        //Declare variable to calculate payment amount
        double paymentAmount;
        float monthlyInterest = ((annualInterestRate / 12) / 100);

        if(annualInterestRate == 0f){
            paymentAmount = loanAmount/numberOfPayments;
        }
        else{
            
            
        
            
        //Calculate monthlyInterest
        double exponent = Math.pow(1+ monthlyInterest, numberOfPayments);
        
        //calculate monthly payment
        paymentAmount = loanAmount * (monthlyInterest * exponent) / ((exponent) - 1);
        
        }
        //Return monthlyPaymentAmount
        return paymentAmount;
    }    

    
    //Calculate the annual interest rate
    // APR = (loanAmount * Rate * Years / 100 ) / (loanAmount * Years) * 100
    public float calculate(double loanAmount, int numberOfPayments, double paymentAmount){
       //Don' need to pass variables since when invoked those values are present as long as you name variables inside method the same
     
       float annualInterestRate = 0.0f;
       double calculatedPayment = 1.0;
       
       boolean inc = false;
       boolean dec = false;

      //  paymentAmount = loanAmount * (monthlyInterest * exponent) / ((exponent) - 1);
        
       
        while(Math.abs(paymentAmount - calculatedPayment) > 0.0){
            
            //call method monthlyPayment 
           calculatedPayment = calculate(annualInterestRate, loanAmount, numberOfPayments);
           if (calculatedPayment > paymentAmount){
               dec = true;
               annualInterestRate -=0.001;
           }
           else{
               inc = true;
               annualInterestRate +=0.001;
           }
           
           if(inc && dec){
            //   System.out.println("found");
               break;
           }
       }
        //Return annual interest rate
        return annualInterestRate;
        
        
    }
    
    
}

