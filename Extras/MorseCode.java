/*
 * Joshua de Souza
 * February 2, 2022
 * U1 A2 Q7: Morse Code
 * Program converts given inputs to morse code.
 */
import javax.swing.JOptionPane;
public class MorseCode 
{
	public static void main(String[] args) 
	{
		//Variable Declaration & Initialization
		String userSentence = JOptionPane.showInputDialog("This program is a morse code generator.\n\nEnter a message to be changed into morse code:");
		String A = ".-", B = "-...", C = "-.-.", D = "-..", E = ".", F = "..-.", G = "--.", H = "....", I = "..", J = ".---", K = "-.-", L = ".-..", M = "--", N = "-.", O = "---", P = ".--.", Q = "--.-", R = ".-.", S = "...", T = "-", U = "..-", V = "...-", W = ".--", X = "-..-", Y = "-.--", Z = "--..", one = ".----", two = "..---", three = "...--", four = "....-", five = ".....", six = "-....", seven = "--...", eight = "---..", nine = "----.", zero = "-----";
		String[] brokenSentence = userSentence.split("");
		for(String letters : brokenSentence) 
		{
			if(letters.toLowerCase().equals("a")) 
			{
				System.out.print(A + " ");
			}
			if(letters.toLowerCase().equals("B")) 
			{
				System.out.print(B + " ");
			}
			if(letters.toLowerCase().equals("c")) 
			{
				System.out.print(C + " ");
			}
			if(letters.toLowerCase().equals("d")) 
			{
				System.out.print(D + " ");
			}
			if(letters.toLowerCase().equals("e")) 
			{
				System.out.print(E + " ");
			}
			if(letters.toLowerCase().equals("f")) 
			{
				System.out.print(F + " ");
			}
			if(letters.toLowerCase().equals("g")) 
			{
				System.out.print(G + " ");
			}
			if(letters.toLowerCase().equals("h")) 
			{
				System.out.print(H + " ");
			}
			if(letters.toLowerCase().equals("i")) 
			{
				System.out.print(I + " ");
			}
			if(letters.toLowerCase().equals("j")) 
			{
				System.out.print(J + " ");
			}
			if(letters.toLowerCase().equals("k")) 
			{
				System.out.print(K + " ");
			}
			if(letters.toLowerCase().equals("l")) 
			{
				System.out.print(L + " ");
			}
			if(letters.toLowerCase().equals("m")) 
			{
				System.out.print(M + " ");
			}
			if(letters.toLowerCase().equals("n")) 
			{
				System.out.print(N + " ");
			}
			if(letters.toLowerCase().equals("o")) 
			{
				System.out.print(O + " ");
			}
			if(letters.toLowerCase().equals("p")) 
			{
				System.out.print(P + " ");
			}
			if(letters.toLowerCase().equals("q")) 
			{
				System.out.print(Q + " ");
			}
			if(letters.toLowerCase().equals("r")) 
			{
				System.out.print(R + " ");
			}
			if(letters.toLowerCase().equals("s")) 
			{
				System.out.print(S + " ");
			}
			if(letters.toLowerCase().equals("t")) 
			{
				System.out.print(T + " ");
			}
			if(letters.toLowerCase().equals("u")) 
			{
				System.out.print(U + " ");
			}
			if(letters.toLowerCase().equals("v")) 
			{
				System.out.print(V + " ");
			}
			if(letters.toLowerCase().equals("w")) 
			{
				System.out.print(W + " ");
			}
			if(letters.toLowerCase().equals("x")) 
			{
				System.out.print(X + " ");
			}
			if(letters.toLowerCase().equals("y")) 
			{
				System.out.print(Y + " ");
			}
			if(letters.toLowerCase().equals("z")) 
			{
				System.out.print(Z + " ");
			}
			if(letters.toLowerCase().equals("1")) 
			{
				System.out.print(1 + " ");
			}
			if(letters.toLowerCase().equals("2")) 
			{
				System.out.print(2 + " ");
			}
			if(letters.toLowerCase().equals("3")) 
			{
				System.out.print(3 + " ");
			}
			if(letters.toLowerCase().equals("4")) 
			{
				System.out.print(4 + " ");
			}
			if(letters.toLowerCase().equals("5")) 
			{
				System.out.print(5 + " ");
			}
			if(letters.toLowerCase().equals("6")) 
			{
				System.out.print(6 + " ");
			}
			if(letters.toLowerCase().equals("7")) 
			{
				System.out.print(7 + " ");
			}
			if(letters.toLowerCase().equals("8")) 
			{
				System.out.print(8 + " ");
			}
			if(letters.toLowerCase().equals("9")) 
			{
				System.out.print(9 + " ");
			}
			if(letters.toLowerCase().equals("0")) 
			{
				System.out.print(0 + " ");
			}
			if(letters.toLowerCase().equals(" ")) 
			{
				System.out.print(" / ");
			}
			if(letters.toLowerCase().equals("$")) 
			{
				System.out.print("$");
			}
			if(letters.toLowerCase().equals("#")) 
			{
				System.out.print("#");
			}
			if(letters.toLowerCase().equals("?")) 
			{
				System.out.print("?");
			}
			if(letters.toLowerCase().equals("!")) 
			{
				System.out.print("!");
			}
			if(letters.toLowerCase().equals("&")) 
			{
				System.out.print("&");
			}
			if(letters.toLowerCase().equals("*")) 
			{
				System.out.print("*");
			}
			if(letters.toLowerCase().equals("@")) 
			{
				System.out.print("@");
			}
			if(letters.toLowerCase().equals(",")) 
			{
				System.out.print(",");
			}
			if(letters.toLowerCase().equals("'")) 
			{
				System.out.print("'");
			}
		}
	}
}
