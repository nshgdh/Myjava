java programs

printf:
   System.out.printf("Hello %s", "World");
Syntax:
    System.out.printf("format string", arguments);

1.loan amount is eligible/not:

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your monthly salary: ");
        int salary = scanner.nextInt();

        System.out.print("Enter desired loan amount: ");
        int loanAmount = scanner.nextInt();
        if (age >= 18) {
            if (salary >= 20000) {
                if (loanAmount <= 50000) {
                    System.out.println("You are eligible for the loan.");
                } else {
                    System.out.println("You are not eligible: Loan amount exceeds 50,000 limit.");
                }
            } else {
                System.out.println("You are not eligible due to low salary.");
            }
        } else {
            System.out.println("You are not eligible due to age.");
        }

        scanner.close();
    }
}

2.maximum number using nested if :

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = s.nextInt();
        System.out.println("enter the second number:");
        int b = s.nextInt();
        System.out.println("enter the third number:");
        int c = s.nextInt();
        if (a>b){
            if(a>c){
                System.out.println("Maximun number is: " +a);
            }else{
                System.out.println("Maximum number us: " +c);
            }
                if (b>c){
                    System.out.println("Maximum number is:" +b);
                }else{
                    System.out.println("Maximum number is:" +c);
                }
                s.close();
            }
        }
    }
3. Addition of Two Numbers:
  
   import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum: " + sum);
    }
}

4.Check Even or Odd:

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }
}



5. Print Numbers from 1 to 10:

public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

6.Simple Calculator (Add, Subtract, Multiply, Divide):

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        double result = 0;

        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': 
                if (b != 0)
                    result = a / b;
                else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}

7.two sum:

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 1; i < n; i++) {
            nums[i] = s.nextInt();
        }
        int target = s.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        System.out.println("No solution found");
        s.close();
    }
}

8.command line argument:

public class main{
public static void main(String[] args){
Sout (args[0]);
}}
output:
 javac filename.java
 java filename hello
  hello(print)

9.hollow pattern:

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int size = 4;
        for (int i = 0; i <= size; i++) {
            for (int j = 0;j<=size; j++) {
                if (i == 0 || i == size || j == 0 || j == size ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}


10.public class Main {
    public static void main(String[] args) {
        int size = 11;
        for (int i = 0; i < size; i++) { 
            for (int j = 0; j < size; j++) { 
                if (i == 0 || i == size-1 || j == 0 || j == size-1
                    || i == j || i+j == size-1||i==size/2||j==size/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

output:
* * * * * * * * * * * 
* *       *       * * 
*   *     *     *   * 
*     *   *   *     * 
*       * * *       * 
* * * * * * * * * * * 
*       * * *       * 
*     *   *   *     * 
*   *     *     *   * 
* *       *       * * 
* * * * * * * * * * * 

=== Code Execution Successful ===
11. length of the even word in a sentence:

import java.util.*;
public class Main {
            public static void main(String[] args) {
                String word = "A stitch in time saves nine.";
                printEvenWord(word);
            }
        
            public static void printEvenWord(String str) {
                String[] words = str.split(" ");
                for (String word : words) {
                    int length = word.length();
                    if (length % 2 == 0) {
                        System.out.println("Word: " + word + ", Length: " + length);
                    }
                }
            }
        }
output:
Word: stitch, Length: 6
Word: in, Length: 2
Word: time, Length: 4

12. set of sentence first word should be capital:
String s = "Java is an object oriented"
String[] words = s.split("");
for(String result.words){
if (result.length()>0){
String firstchar = result.substring(0,1).touppercase();
String remaining = result.substrin(1);
}
Sout(firstchar + remaining);

13.min,max,sum,average using array:

import java.util.Scanner;
public class ArrayStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        double average = (double) sum / n;
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        scanner.close();
    }
}

output:
Enter the number of elements: 7
Enter 7 numbers:
11 41 67 2 39 78 24

Minimum: 2
Maximum: 78
Sum: 262
Average: 37.42857142857143

14.reverse the array using reverse loop:

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] original = new int[n];
        int[] reversed = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            original[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            reversed[i] = original[n - 1 - i];
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(reversed[i] + " ");
        }
        scanner.close();
    }
}

15. reverse an array with loop:
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        reverseArray(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    
    public static void reverseArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
}
}
}

16. without reverse the loop:

import java.util.*;
public class arr3{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
           arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}

17.  initialize a one dimension array with first nine natural number and then display then in the following format.
1 2 3
4 5 6
7 8 9

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if ((i + 1) % 2 == 0) {
                System.out.println();
            }
        }
    }
}
 output:
1 2 3 
4 5 6 
7 8 9 

18. read the index:

import java.util.*;
public class Main{
    public static void main(String [] args){
        int[] arr = {1, 2, 3, 4, 5};
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

2D Array:
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int arr [][] = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
             arr[a][b]=s.nextInt();
            }
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
             System.out.println(arr[a][b]+" ");
            }
        }
        
    }
}

diagonal value:
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int arr [][] = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
             arr[i][j]=s.nextInt();
            }
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if (i == j)
             System.out.print(arr[i][j]+" ");
            }
        }
        
    }
}

secondary diagonal:

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int arr [][] = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
             arr[i][j]=s.nextInt();
            }
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                
            if(i+j==arr.length-1)
            
             System.out.print(arr[i][j]+" ");
            }
        }
    }
        
 }

boundary diagonal:

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int arr [][] = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
             arr[i][j]=s.nextInt();
            }
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                
             if (i == 0 || i == a-1 || j == 0 || j == b-1)
            
             System.out.print(arr[i][j]+" ");
            }
        }
    }
        
    }
reverse the odd row:
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int arr [][] = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
             arr[i][j]=s.nextInt();
            }
        }
        for(int i=0; i<a; i++){
            if(i % 2 == 0)
            for(int j=0; j<b; j++){
             System.out.print(arr[i][j]+" ");
            
            }else{
                for(int j = b-1; j>=0; j--){
                   System.out.print(arr[i][j]+" ");  
                }
            }
            System.out.println(" "); 
        }
        
    }
}

spiral traversal :
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = s.nextInt();

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }
        }
    }
}









