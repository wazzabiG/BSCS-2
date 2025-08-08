//Before Class (Aug.8, 2025)

//1. Lesson 2 Topic 4 Input Operations
//Email Details Display
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the recipient: ");
        String rec = input.nextLine();
        System.out.print("Enter the message: ");
        String mes = input.nextLine();
        System.out.print("Enter the name: ");
        String name = input.nextLine();
        System.out.print("Enter the subject: ");
        String sub = input.nextLine();
        System.out.print("Enter the version: ");
        float ver = input.nextFloat();
        System.out.print("Enter the discount: ");
        float dis = input.nextFloat();
        System.out.print("Enter the status: ");
        char stat = input.next().charAt(0);
        input.nextLine();
        System.out.print("Enter the code: ");
        String code = input.nextLine();
        System.out.print("Enter the location: ");
        String loc = input.nextLine();
        System.out.print("Enter the age: ");
        int age = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter the company name: ");
        String com = input.nextLine();
        System.out.print("Enter the website: ");
        String web = input.nextLine();
        System.out.print("Enter the phone: ");
        String pho = input.nextLine();
        System.out.print("Enter the job title: ");
        String job = input.nextLine();
        System.out.print("Enter the department: ");
        String dep = input.nextLine();
        
        System.out.println("Dear " + rec + ", I hope this email finds you well.");
        System.out.println(mes);
        System.out.println("Subject: " + sub);
        System.out.println("Sender: " + name);
        System.out.println("Version: " + ver);
        System.out.println("Discount: " + String.format("%.2f", dis) + "%");
        System.out.println("Status: " + stat);
        System.out.println("Code: " + code);
        System.out.println("Location: " + loc);
        System.out.println("Age: " + age);
        System.out.println("Company: " + com);
        System.out.println("Website: " + web);
        System.out.println("Phone: " + pho);
        System.out.println("Job Title: " + job);
        System.out.println("Department: " + dep);
        
        input.close();
    }
}


//2. Lesson 4 Topic 1 String Handling
//Two String Input
Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        System.out.print(str1 + " " + str2 + " "  + str1);
        input.close();
//Three Strings Now
Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        System.out.print("Enter the third string: ");
        String str3 = input.nextLine();
        System.out.print(str1 + " - " + str2 + " - "  + str3);
        input.close();
//Two Lovers
Scanner input = new Scanner(System.in);
        System.out.print("Enter lover1: ");
        String str1 = input.nextLine();
        System.out.print("Enter lover2: ");
        String str2 = input.nextLine();
        System.out.print(str1 + " and " + str2 + " are in love.");
        input.close();
//Color Mixer
Scanner input = new Scanner(System.in);
        System.out.print("Enter color 1: ");
        String str1 = input.nextLine();
        System.out.print("Enter color 2: ");
        String str2 = input.nextLine();
        System.out.print("Enter color 3: ");
        String str3 = input.nextLine();
        System.out.print("Mixing " + str1 + ", " + str2 + ", and " + str3 + " creates a new color!");
        input.close();
//Game Characters
Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of your first character: ");
        String str1 = input.nextLine();
        System.out.print("Enter the name of your second character: ");
        String str2 = input.nextLine();
        System.out.print("Enter the name of your third character: ");
        String str3 = input.nextLine();
        System.out.print("Enter the name of your fourth character: ");
        String str4 = input.nextLine();
        System.out.print("My most played characters in the game are " + str1 + ", " + str2 + ", " + str3 + ", and " + str4 + ".");
        input.close();


//3. Lesson 7 Topic 5 if else if else Statement
//All or Not
Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        if(num1>0 && num2>0 && num3>0){
            System.out.print("All numbers are positive.");
        }else if(num1<0 && num2<0 && num3<0){
            System.out.print("All numbers are negative.");
        }else if(num1%2==0 && num2%2==0 && num3%2==0){
            System.out.print("All numbers are even.");
        }else if(num1%2!=0 && num2%2!=0 && num3%2!=0){
            System.out.print("All numbers are odd.");
        }else{
            System.out.print("Numbers are different.");
        }
        input.close();
//Divisible By?
Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        if(num%4!=0){
            if(num%3!=0){
                if(num%2!=0){
                    System.out.print("The number is not divisible by 2, 3, or 4.");
                }else if(num%2==0){
                    System.out.print("The number is divisible by 2.");
                }
            }else if(num%3==0){
                System.out.print("The number is divisible by 3.");
            }
        }else{
            System.out.print("The number is divisible by 4.");
        }
        input.close();
//Day Identifier
Scanner input = new Scanner(System.in);
        System.out.print("Enter day: ");
        int num = input.nextInt();
        if(num==1){
            System.out.print("Monday");
        }else if(num==2){
            System.out.print("Tuesday");
        }else if(num==3){
            System.out.print("Wednesday");
        }else if(num==4){
            System.out.print("Thursday");
        }else if(num==5){
            System.out.print("Friday");
        }else if(num==6){
            System.out.print("Saturday");
        }else if(num==7){
            System.out.print("Sunday");
        }else{
            System.out.print("Invalid input");
        }
        input.close();
//Positive, Negative, or Zero Counter
Scanner input = new Scanner(System.in);
        int pos=0, neg=0, zero=0;
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        if(num1>0){
            pos++;
        }else if(num1<0){
            neg++;
        }else{
            zero++;
        }
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        if(num2>0){
            pos++;
        }else if(num2<0){
            neg++;
        }else{
            zero++;
        }
        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();
        if(num3>0){
            pos++;
        }else if(num3<0){
            neg++;
        }else{
            zero++;
        }
        System.out.print("Enter fourth integer: ");
        int num4 = input.nextInt();
        if(num4>0){
            pos++;
        }else if(num4<0){
            neg++;
        }else{
            zero++;
        }
        System.out.print("Enter fifth integer: ");
        int num5 = input.nextInt();
        if(num5>0){
            pos++;
        }else if(num5<0){
            neg++;
        }else{
            zero++;
        }
        System.out.println("Positive count: " + pos);
        System.out.println("Negative count: " + neg);
        System.out.println("Zero count: " + zero);
        input.close();
//What Year is it?
Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int yr = input.nextInt();
        if(yr%100!=0){
            if(yr%4!=0){
                System.out.println("It's neither a leap year nor a century year.");
            }else if(yr%4==0){
                System.out.println("It's a leap year.");
            }
        }else if(yr%100==0){
            if(yr%400==0){
                System.out.println("It's a leap century year.");
            }else{
                System.out.println("It's a century year.");
            }
        }
        input.close();


//4. Lesson 8 Topic 3 For Loop
//Difference of Digits
Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        String numStr = String.valueOf(num);
        int res = Character.getNumericValue(numStr.charAt(numStr.length()-1));
        for(int i=numStr.length()-2; i>=0; i--){
            int digit = Character.getNumericValue(numStr.charAt(i));
            res -= digit;
        }
        System.out.print("Result of subtracting digits: " + res);
        input.close();
//For Loop Counting
Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
        input.close();
//Multiplication by 5
Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            int res = i*5;
            System.out.println(res);
        }
        input.close();
//Odd Number Printer
Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            if(i%2!=0 && i<=num){
                System.out.println(i);
            }
        }
        input.close();
//A's and B's
Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int oA = 0, oB = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a'){
                oA++;
            }else if(str.charAt(i) == 'b'){
                oB++;
            }
        }
        System.out.println("Number of 'a' occurrences: " + oA);
        System.out.println("Number of 'b' occurrences: " + oB);
        input.close();


//5. Lesson 9 Topic 2 One Dimensional Arrays
//Array Vowel Count
Scanner input = new Scanner(System.in);
        char[] chars = new char[8];
        System.out.println("Enter 8 characters:");
        for(int i=0; i<8; i++){
            chars[i] = input.next().charAt(0);
        }
        int count = 0;
        for(int i=0; i<8; i++){
            char c = chars[i];
            if(c == 'a' || c == 'e' || c == 'i' ||c == 'o' || c == 'u' || 
            c == 'A' ||c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                count++;
            }
        }
        System.out.println("Number of vowel elements: " + count);
        input.close();
//Integer Array
Scanner input = new Scanner(System.in);
        int[] ints = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i=0; i<ints.length; i++){
            System.out.print(ints[i] + " ");
        }
        input.close();
//Array Sum
Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 integer numbers: ");
        for(int i=0; i<5; i++){
            nums[i] = input.nextInt();
        }
        int sum = 0;
        for(int i=0; i<5; i++){
            sum = nums[i] + sum;
        }
        System.out.println("Sum: " + sum);
        input.close();
//Double Separation Array
Scanner input = new Scanner(System.in);
        double[] nums = new double[6];
        System.out.println("Enter 6 double values: ");
        for(int i=0; i<6; i++){
            nums[i] = input.nextDouble();
        }
        System.out.println("Array elements:");
        for(int i=0; i<6; i++){
            System.out.print(String.format("%.3f", nums[i]) + "	");
        }
        input.close();
//Average of Floating-Point Numbers
Scanner input = new Scanner(System.in);
        float[] nums = new float[10];
        System.out.println("Enter 10 floating-point numbers:");
        for(int i=0; i<10; i++){
            nums[i] = input.nextFloat();
        }
        float sum = 0, ave = 0;
        for(int i=0; i<10; i++){
            sum = nums[i] + sum;
        }
        ave = sum/10;
        System.out.println("The average is: " + String.format("%.2f", ave));
        input.close();
