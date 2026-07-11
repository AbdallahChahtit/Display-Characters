import java.util.Scanner;
public class PrintCharacter {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int numberPerLine = input.nextInt();
        printChars('1', 'Z', numberPerLine);
        System.out.println(" Done!");
    }
public static void printChars(char c1, char c2, int n)
    {
        int count = 0;
        while(true)
        {
            System.out.print(c1 + " ");
            count++;
        
            if (count % n == 0) {
                System.out.println();
            }
        
            if (c1 == c2) {
                break;  
            }
            c1++;  
        }
    }

  
}


