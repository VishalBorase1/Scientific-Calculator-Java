package calci;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScientificCalculator {
	public static void main(String[] args) {
		double a, b;
		double c;
		System.out.println("*****Scientific Calculator******");

		System.out.println("\nCalculator is Turn On");	

		File file1 = new File("CalculationsHistory.txt");

		System.out.println("1.Add(+)   2.sub(-)  3.Mul(*)  4.Div(/)\n" + "5.power    6.Sqrt    7.Nrt     8.Log \n"
				+ "9.logn     10.Sine   11.iSine  12.Cos\n" + "13.iCos    14.tan    15.itan   16.stor\n"
				+ "17.recall  18.d2b    19.b2d    20.sip\n");
		System.out.println(" \nEnter User Choice :");

		Scanner sc = new Scanner(System.in);
		double choice = sc.nextDouble();

		while (true) {
			if (choice == 1) {
				System.out.println("Enter 2 num for Addition");
				a = sc.nextDouble();
				b = sc.nextDouble();
				System.out.println(a + b);
				break;
			}
			if (choice == 2) {
				System.out.println("Enter 2 num Subtraction");
				a = sc.nextDouble();
				b = sc.nextDouble();
				System.out.println(a - b);
				break;
			}
			if (choice == 3) {
				System.out.println("Enter 2 num for Multiplication");
				a = sc.nextDouble();
				b = sc.nextDouble();
				System.out.println("=\n" + a * b);
				break;
			}
			if (choice == 4) {
				System.out.println("Enter 2 num for Division");
				a = sc.nextDouble();
				b = sc.nextDouble();
				System.out.println("=\n" + a / b);
				break;
			}
			if (choice == 5) {
				System.out.println("Enter 2 num for power");
				a = sc.nextDouble();
				b = sc.nextDouble();
				System.out.println(Math.pow(a, b));
				break;
			}
			if (choice == 6) {
				System.out.println("Enter num for sqrt");
				a = sc.nextDouble();
				System.out.println(Math.sqrt(a));
				break;
			}
			if (choice == 7) {
				System.out.println("Enter 2 num for Nrt");
				a = sc.nextDouble();
				b = sc.nextDouble();
				System.out.println("Nth root is " + Math.pow(a, 1 / b));
				break;
			}
			if (choice == 8) {
				System.out.println("Enter num for logarithm");
				a = sc.nextDouble();
				System.out.println(Math.log(a));
				break;
			}
			if (choice == 9) {
				System.out.println("Enter num for Natural Log");
				a = sc.nextDouble();
				System.out.println(Math.log10(a));
				break;
			}
			if (choice == 10) {
				System.out.println("Enter num for Sine");
				a = sc.nextDouble();
				System.out.println(Math.sin(a));
				break;
			}
			if (choice == 11) {
				System.out.println("Enter num for Inverse sine");
				a = sc.nextDouble();
				System.out.println(Math.asin(a));
				break;
			}
			if (choice == 12) {
				System.out.println("Enter num for Cosine");
				a = sc.nextDouble();
				System.out.println(Math.cos(a));
				break;
			}
			if (choice == 13) {
				System.out.println("Enter num for Inverse Cosine");
				a = sc.nextDouble();
				System.out.println(Math.acos(a));
				break;
			}
			if (choice == 14) {
				System.out.println("Enter num for Tangent");
				a = sc.nextDouble();
				System.out.println(Math.tan(a));
				break;
			}
			if (choice == 15) {
				System.out.println("Enter num for Inverse Tangent");
				a = sc.nextDouble();
				System.out.println(Math.atan(a));
				break;
			}
			if (choice == 16) {
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true));
					System.out.println("Enter array size");
					int size = sc.nextInt();
					int numbers[] = new int[size];
					System.out.println("Enter data in array");
					for (int i = 0; i < size; i++) {
						numbers[i] = sc.nextInt();
					}
					System.out.println("file stored successfully");
					bw.close();
					break;
				} catch (IOException e) {
					System.out.println("file unsuccessfully stored");
					e.printStackTrace();
				}
			}
			if (choice == 17) {
				try {
					BufferedReader br = new BufferedReader(new FileReader(file1));
					String contents;
					while ((contents = br.readLine()) != null)
						System.out.println(contents);

					br.close();
					break;
				}

				catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (choice == 18) {
				System.out.println("Enter the Decimal num: ");
				a = sc.nextInt();
				System.out.println("Binary Value is:");
				System.out.println(Integer.toBinaryString((int) a));
				break;
			}

			if (choice == 19) {
				Scanner ab = new Scanner(System.in);
				System.out.println("Enter the Binary num: ");
				String binaryString = ab.nextLine();
				System.out.println("Decimal value is:");
				System.out.println("output: " + Integer.parseInt(binaryString, 2));
				break;
			}

			if (choice == 20) {
				System.out.println("Enter Investment rate: ");
				double investment = sc.nextInt();
				System.out.println("enter Annual rate: ");
				double annualRate1 = sc.nextInt();
				double monthlyRate = annualRate1 / 12 / 100;
				System.out.println("enter num of year:");
				double years = sc.nextInt();
				double futureValue = investment * Math.pow((1 + annualRate1 / 100), years);
				System.out.println(futureValue);
				break;
			} else {
				System.out.println("Invalid Input, try again");
			}

		}

		System.out.println("\n\nOperation Successfull\nStopped.");
	}

}