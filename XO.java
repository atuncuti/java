import java.util.Scanner;

public class Main {

		public static void main(String args[])
		{
			String[][] board = {{"X","O","X"},{"O","X","O"},{"X","O","X"}};
			
			printboard(board);
			
			int usermove = getusermove();
			System.out.println(usermove);

		}
		
		public static int getusermove()
		{
			System.out.println("");
			System.out.print("Your Move? : ");
			Scanner scanner = new Scanner(System.in);
			//scanner.close();
			return scanner.nextInt();
			
		}
		
		public static void printboard(String[][] board)
		{
		  for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					System.out.print(board[i][j]);
					if(j<2){System.out.print("|");}else{System.out.println("");}}
				if(i<2){System.out.println("-----");}}
			
		}
}
