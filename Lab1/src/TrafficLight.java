import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice:\nRed---1\nYellow---2\nGreen---3 ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		default:
			System.out.println("Wrong Choice");
			
		}
		
	}

}
