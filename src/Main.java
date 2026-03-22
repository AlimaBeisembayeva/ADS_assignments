import java.util.Scanner;

public class Main {
    /*Task 1
    public static void printDigits(int n) {
        if (n == 0) return;
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = a.nextInt();
        printDigits(num);
    }

*/



    /*Task 2
    public static void fillArray(int[] arr, int index, Scanner a){
        if (index==arr.length) return;
        arr[index]=a.nextInt();
        fillArray(arr, index+1, a);
    }
    public static int sum(int[] arr, int n){
        if (n==0) return 0;
        return arr[n-1] + sum(arr, n-1);
    }

public static void main(String[] args){
    Scanner a=new Scanner(System.in);

    System.out.println("Enter number of elements");
    int n=a.nextInt();

    int[] arr= new int[n];
    System.out.println("Enter elements");
    fillArray(arr, 0, a);

    int s=sum(arr, n);
    System.out.println("Average= " + (double)s/n);


}*/

    /*Task 3
    public static boolean isPrime(int n, int i){
        if (n<=2) return (n==2);
        if (n%i==0) return false;
        if (i*i>n) return true;
        return isPrime(n, i+1);
    }

    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=a.nextInt();
        System.out.println(isPrime(num, 2) ? "Prime" : "Composite");
    }
*/

    /*Task 4
    public static int factorial(int n){
        if (n==1) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=a.nextInt();
        System.out.println("Factorial= " + factorial(num));
    }
*/
    /*Task 5
    public static int fibonacci(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=a.nextInt();
        System.out.println("Fibonacci= " + fibonacci(num));
    }
*/
    /*Task 6
    public static int power(int n, int m){
        if (m==0) return 1;
        return n* power(n, m-1);
    }

    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter n and m: ");
        int n=a.nextInt();
        int m=a.nextInt();
        System.out.println("Result= " + power(n, m));
    }
     */
    /*Task 7
    public static void reverse(Scanner a, int n){
        if (n==0) return;

        int x=a.nextInt();
        reverse(a, n-1);
        System.out.print(x + " ");
    }
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter count of numbers: ");
        int count=a.nextInt();
        System.out.println("Enter numbers: ");
        reverse(a, count);
        System.out.println();
    }
     */
    /*Task 8
    public static boolean isDigits(String s, int index){
        if (index==s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isDigits(s, index+1);
    }
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=a.next();
        System.out.println(isDigits(str, 0) ? "Yes" : "No");
    }
     */

    /*Task 9
    public static int countChar(String s){
        if (s.equals("")) return 0;
        return 1+ countChar(s.substring(1));
    }
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str2=a.next();
        System.out.println(countChar(str2));
    }
     */


    public static int gcd(int n, int m){
        if (m==0) return n;
        return gcd(m, n%m);
    }

    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x=a.nextInt();
        int y=a.nextInt();
        System.out.println(gcd(x, y));
    }




}