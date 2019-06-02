package com.Shubhra;
import java.util.Scanner;

// Testing the Stack Class with a equation solver.
// Given a math equation, the program solves it.
public class Main
{

    public static boolean isNumber(char c)
    {
        return Character.isDigit(c);
    }

    public static int  DoCalculation(int a, int b, char op)
    {
        switch (op)
        {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;

        }
        return 0;
    }

    public static void EquationSolver()
    {
        String equation = "(1+((2+3) * (4*4)))";

        Scanner sc = new Scanner(System.in);

        Stack operatorStack = new Stack();
        Stack numberStack = new Stack();

        for(int i = 0;i<equation.length();i++)
        {
            if(equation.charAt(i) == '+' || equation.charAt(i) == '*')
            {
                operatorStack.Push(equation.charAt(i));
            }

            if(isNumber(equation.charAt(i)))
            {
                numberStack.Push(equation.charAt(i));
            }

            if(equation.charAt(i)==')')
            {
                int a = Integer.parseInt(numberStack.Pop().toString());
                int b = Integer.parseInt(numberStack.Pop().toString());
                char op = (char)operatorStack.Pop();

                int ans = DoCalculation(a,b,op);
                numberStack.Push(ans);
            }
        }


        System.out.println(numberStack.Pop());
    }

    public static void main(String[] args)
    {
        EquationSolver();
    }
}
