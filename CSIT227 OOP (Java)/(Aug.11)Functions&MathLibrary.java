// Activities: 4 Functions & 1 Built-in Math Library (Aug.11, 2025)
// 5 items each, 10 points per item

// Lesson 10: Topic 5 (Functions with no parameters and return values)
// Calculation (Given Area of triangle: (b*h)/2
/* Output:
   Enter the base of the triangle: 5.5
   Enter the height of the triangle: 10.5
   Result: 28.88 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        getCalculation();
    }
    public static void getCalculation(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle: ");
        float b = input.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        float h = input.nextFloat();
        
        float res = (b*h)/2;
        
        System.out.println("Result: " + String.format("%.2f", res));
        
        input.close();
    }
}

// Display Message Function
/* Output:
   I love programming */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        display();
    }
    public static void display(){
        System.out.print("I love programming");
    }
}

// Pass or Fail
/* Output:
   Enter the grade (between 0 and 100): 86
   Pass */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the grade (between 0 and 100): ");
        int g = input.nextInt();
        
        if(g >= 60){
            PrintPass();
        }else{
            PrintFail();
        }
    }
    static void PrintPass(){
        System.out.print("Pass");
    }
    static void PrintFail(){
        System.out.print("Fail");
    }
}

// Celsius to Fahrenheit II
/* Output:
   Enter the temperature in Celsius: 25
   Temperature in Fahrenheit: 77.00 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        convertTemperature();
    }
    public static void convertTemperature(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Celsius: ");
        float c = input.nextFloat();
        
        float f = (c*9/5)+32;
        
        System.out.println("Temperature in Fahrenheit: " + String.format("%.2f", f));
        
        input.close();
    }
}

// Matchstick House Builder
/* Output:
   Enter the number of houses to make: 5
   Number of matchsticks needed: 26 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        getMatchSticksNeeded();
    }
    public static void getMatchSticksNeeded(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of houses to make: ");
        int h = input.nextInt();
        
        int m = (5*h)+1;
        
        System.out.println("Number of matchsticks needed: " + m);
        
        input.close();
    }
}



// Lesson 10: Topic 6 (Functions with no parameters but with return values)
// Perimeter of Rectangle (Given: P = 2*(l+w)
/* Output:
   Enter length of the rectangle: 4.5
   Enter width of the rectangle: 6.8
   Perimeter of the rectangle: 22.60 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.print("Perimeter of the rectangle: " + String.format("%.2f", calculateRectanglePerimeter()));
    }
    public static double calculateRectanglePerimeter(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter length of the rectangle: ");
        float l = s.nextFloat();
        System.out.print("Enter width of the rectangle: ");
        float w = s.nextFloat();
        
        return 2*(l+w);
    }
}

// Volume of Cylinder Multiplied By 4 (Given: V = π*r²*h, then multiply V by 4)
/* Output:
   Enter the radius of the cylinder: 5.5
   Enter the height of the cylinder: 10.2
   Result: 3877.35 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.print("Result: " + String.format("%.2f", calculateCylinderVolume()));
    }
     public static double calculateCylinderVolume(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cylinder: ");
        float r = s.nextFloat();
        System.out.print("Enter the height of the cylinder: ");
        float h = s.nextFloat();
        
        return 3.141592653589793*r*r*h*4;
    }
}

// Average of Three Numbers
/* Output:
   Enter the first number: 5
   Enter the second number: 6
   Enter the third number: 2
   The average of the three numbers is: 4.33 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.print("The average of the three numbers is: " + String.format("%.2f", calculateAverage()));
    }
    public static float calculateAverage(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        float n1 = s.nextFloat();
        System.out.print("Enter the second number: ");
        float n2 = s.nextFloat();
        System.out.print("Enter the third number: ");
        float n3 = s.nextFloat();
        
        return (n1+n2+n3)/3;
    }
}

// Combined Geometric Areas (Given: Area of square = s², Area of cirle = π*r²)
/* Output:
   Enter the side of the square: 4
   Enter the radius of the circle: 5.5
   Total area (square + circle): 111.03 */
import java.util.Scanner;
public class Main{
    public static double calculateSquareArea(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the side of the square: ");
        double side = s.nextDouble();
        return side*side;
    }
    public static double calculateCircleArea(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double r = s.nextDouble();
        return 3.141592653589793*r*r;
    }
    public static void main(String[] args){
        double total = calculateSquareArea() + calculateCircleArea();
        
        System.out.print("Total area (square + circle): " + String.format("%.2f", total));
    }
}

// Return Sum of Two Numbers
/* Output:
   Sum of numbers: 15 */
import java.util.Scanner;
public class Main{
    public static int addNumbers(){
        int x = 5;
        int y = 10;
        return x+y;
    }
    public static void main(String[] args){
        System.out.print("Sum of numbers: " + addNumbers());
    }
}



// Lesson 10: Topic 7 (Functions with parameters and no return values)
// Body Mass Index (BMI) Calculation (Given: bmi = w/(h*h)
/* Output:
   Enter your height (in meters): 1.2
   Enter your weight (in kilograms): 50
   BMI: 34.72 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your height (in meters): ");
        double h = s.nextDouble();
        System.out.print("Enter your weight (in kilograms): ");
        double w = s.nextDouble();
        
        displayBodyMetrics(h, w);
    }
    public static void displayBodyMetrics(double h, double w){
        double bmi = w/(h*h);
        System.out.print("BMI: " + String.format("%.2f", bmi));
    }
}

// Sum of Numbers Pt. 2
/* Output:
   Enter first integer: 1
   Enter second integer: 2
   Enter third integer: 3
   6 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int n1 = s.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = s.nextInt();
        System.out.print("Enter third integer: ");
        int n3 = s.nextInt();
        
        sumOfIntegers(n1, n2, n3);
    }
    public static void sumOfIntegers(int n1, int n2, int n3){
        int res = n1+n2+n3;
        System.out.print(res);
    }
}

// Polynomial Evaluation (Given: ax3 + bx2 + cx + d)
/* Output:
   Enter coefficient a: 2
   Enter coefficient b: -3
   Enter coefficient c: 1
   Enter coefficient d: 4
   Enter value of x: 2.5
   Value of the polynomial: 19.00 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter coefficient a: ");
        double a = s.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = s.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = s.nextDouble();
        System.out.print("Enter coefficient d: ");
        double d = s.nextDouble();
        System.out.print("Enter value of x: ");
        double x = s.nextDouble();
        
        evaluatePolynomial(a, b, c, d, x);
    }
    public static void evaluatePolynomial(double a, double b, double c, double d, double x){
        double res = (a*x*x*x) + (b*x*x) + (c*x) + d;
        System.out.print("Value of the polynomial: " + String.format("%.2f", res));
    }
}

// Calculate and Display Electricity Bill (Given: Bill = unitsConsumed * ratePerUnit)
/* Output:
   Enter Customer Name: John
   Enter Units Consumed: 5
   Enter Rate Per Unit: 1999.99
   Customer Name: John
   Units Consumed: 5.0
   Rate Per Unit: 2000.0
   Bill Amount: 10000.0
   Thank you for using our services! */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Customer Name: ");
        String name = s.nextLine();
        System.out.print("Enter Units Consumed: ");
        float units = s.nextInt();
        System.out.print("Enter Rate Per Unit: ");
        float rate = s.nextFloat();
        
        displayBillDetails(name, units, rate);
        calculateBill(units, rate);
    }
    public static void calculateBill(float units, float rate){
        float bill = units*rate;
        System.out.println("Bill Amount: " + String.format("%.1f", bill));
        System.out.println("Thank you for using our services!");
    }
    public static void displayBillDetails(String name, float units, float rate){
        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + String.format("%.1f", units));
        System.out.println("Rate Per Unit: " + String.format("%.1f", rate));
    }
}

// Personal Preferences Profile
/* Output:
   Enter your favorite color: Blue
   Enter your favorite animal: Dog
   Enter your favorite number: 7
   Favorite Color: Blue
   Favorite Animal: Dog
   Favorite Number: 7 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your favorite color: ");
        String c = s.nextLine();
        System.out.print("Enter your favorite animal: ");
        String a = s.nextLine();
        System.out.print("Enter your favorite number: ");
        int n = s.nextInt();
        
        displayFavorites(c, a, n);
    }
    public static void displayFavorites(String c, String a, int n){
        System.out.println("Favorite Color: " + c);
        System.out.println("Favorite Animal: " + a);
        System.out.println("Favorite Number: " + n);
    }
}



// Lesson 10: Topic 8 (Functions with parameters and return values)
// Product Rating Analysis
/* Output:
   Enter Product Name: Nike
   Enter Category: Shoes
   Enter Quality Rating: 9.9
   Enter Price Rating: 6.7
   Enter Service Rating: 8.6
   Product Name: Nike
   Category: Shoes
   Quality Rating: 9.90
   Price Rating: 6.70
   Service Rating: 8.60
   Overall Average Rating: 8.40 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Product Name: ");
        String name = s.nextLine();
        System.out.print("Enter Category: ");
        String cat = s.nextLine();
        System.out.print("Enter Quality Rating: ");
        double qual = s.nextDouble();
        System.out.print("Enter Price Rating: ");
        double price = s.nextDouble();
        System.out.print("Enter Service Rating: ");
        double rate = s.nextDouble();
        
        double average = calculateAverageRating(qual, price, rate);
        analyzeProductRating(name, cat, qual, price, rate);
        
        System.out.println("Overall Average Rating: " + String.format("%.2f", average));
    }
    public static double calculateAverageRating(double qual, double price, double rate){
        double ave = (qual+price+rate)/3;
        return ave;
    }
    public static void analyzeProductRating(String name, String cat, double qual, double price, double rate){
         System.out.println("Product Name: " + name);
         System.out.println("Category: " + cat);
         System.out.println("Quality Rating: " + String.format("%.2f", qual));
         System.out.println("Price Rating: " + String.format("%.2f", price));
         System.out.println("Service Rating: " + String.format("%.2f", rate));
    }
}

// Sum of Numbers
/* Output:
   Enter first number: 11
   Enter second number: 22
   Sum of numbers: 33 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter second number: ");
        int n2 = s.nextInt();
        
        int res = addNumbers(n1, n2);
        System.out.print("Sum of numbers: " + res);
    }
    public static int addNumbers(int n1, int n2){
        int result = n1+n2;
        return result;
    }
}

// The Bare Minimum
/* Output:
   Enter first value: 12.123
   Enter second value: 1.123
   Enter third value: 7.456
   Minimum Value: 1.123 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first value: ");
        float n1 = s.nextFloat();
        System.out.print("Enter second value: ");
        float n2 = s.nextFloat();
        System.out.print("Enter third value: ");
        float n3 = s.nextFloat();
        
        float res = min(n1, n2, n3);
        System.out.print("Minimum Value: " + String.format("%.3f", res));
    }
    public static float min(float n1, float n2, float n3){
        float minimum=0;
        if(n1<n2 && n1<n3){
            minimum = n1;
        }else if(n2<n1 && n2<n3){
            minimum = n2;
        }else if(n3<n1 && n3<n2){
            minimum = n3;
        }
        return minimum;
    }
}

// Linear Equation Calculator (Given: y = mx + b)
/* Output:
   Enter x: 2.4
   Enter slope: 1.66
   Enter y intercept: 8
   Result: 12.0 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter x: ");
        double x = s.nextDouble();
        System.out.print("Enter slope: ");
        double slope = s.nextDouble();
        System.out.print("Enter y intercept: ");
        double y = s.nextDouble();
        
        double res = calculateLinearEquation(x, slope, y);
        System.out.print("Result: " + String.format("%.1f", res));
    }
    public static double calculateLinearEquation(double x, double slope, double y){
        double result = slope*x+y;
        return result;
    }
}

// Percentage Calculator
/* Output:
   Enter the value: 10.5
   Enter the total: 20.55
   51.09% of 20.55 is 10.50 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        double val = s.nextDouble();
        System.out.print("Enter the total: ");
        double total = s.nextDouble();
        
        double res = calculatePercentage(val, total);
        System.out.print(String.format("%.2f", res) + "%" + " of " + String.format("%.2f", total) + " is " + String.format("%.2f", val));
    }
    public static double calculatePercentage(double val, double total){
        double result = (val/total)*100;
        return result;
    }
}



// Lesson 5: Topic 7 (Pre-defined Math functions)
// Calculation Result
/* Output:
   Enter the first number: 5
   Enter the second number: 7
   Result: 2.83 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = s.nextInt();
        
        int dif = n1-n2;
        int posDif = Math.abs(dif);
        double power = Math.pow(posDif, 3);
        double sq = Math.sqrt(power);
        
        System.out.print("Result: " + String.format("%.2f", sq));
    }
}

// Absolute Value Calculator
/* Output:
   Enter a negative number: -1
   Absolute value: 1 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a negative number: ");
        int n = s.nextInt();
        
        int res = Math.abs(n);
        
        System.out.print("Absolute value: " + res);
    }
}

// Area of a Pentagon (Given: A = (1/4)*(√(5(5+2)√5)*a²)
/* Output:
   Enter side: 5
   Area of Pentagon: 43.01 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter side: ");
        int side = s.nextInt();
        
        double res = (Math.sqrt(5*(5+2*(Math.sqrt(5)))))*side*side/4;
        
        System.out.print("Area of Pentagon: " + String.format("%.2f", res));
    }
}

// Power Calculator
/* Output:
   Enter the base: 2
   Enter the exponent: 3
   Result: 8.00 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the base: ");
        float b = s.nextFloat();
        System.out.print("Enter the exponent: ");
        float e = s.nextFloat();
        
        double res = Math.pow(b, e);
        
        System.out.print("Result: " + String.format("%.2f", res));
    }
}

// Maximum Value Finder
/* Output:
   Enter the first number: 5
   Enter the second number: 6
   The largest number is: 6 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = s.nextInt();
        
        int larg = -100000;
        if(n1>n2){
            larg = n1;
        }else{
            larg = n2;
        }
        
        System.out.print("The largest number is: " + larg);
    }
}
