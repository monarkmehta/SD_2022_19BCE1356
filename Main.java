/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
    static String[][] board;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		    board=new String[5][5];
		    
		    for (String[] row : board){
		        Arrays.fill(row, "__");
		    }
            
		    
    		for(int i=0;i<board[0].length;i++){
    		    System.out.println("Please enter the Player A input at position:"+i);
    		    board[0][i]=sc.next();
    		}
    		
    		for(int j=0;j<board[0].length;j++){
    		    System.out.println("Please enter the Player B input at position:"+j);
    		    board[board.length-1][j]=sc.next();
    		}
    		
    		System.out.println("Please Enter the Player A");
    		String player1=sc.next();
    		System.out.println("Please Enter the Move for Player A as F-Foward,L-Left,R-Right,Back-B");
    		char move1=sc.next().charAt(0);
    		move(move1,player1);
    		printB(board);
    		
    		System.out.println("Please Enter the Player A");
    		String player2=sc.next();
    		System.out.println("Please Enter the Move for Player A as F-Foward,L-Left,R-Right,Back-B");
    		char move2=sc.next().charAt(0);
    		move(move2,player2);
    		printB(board);
    		
    		System.out.println("Please Enter the Player B");
    		String player3=sc.next();
    		System.out.println("Please Enter the Move for Player B as F-Foward,L-Left,R-Right,Back-B");
    		char move3=sc.next().charAt(0);
    		move(move3,player3);
    		printB(board);
    		
    		System.out.println("Please Enter the Player B");
    		String player4=sc.next();
    		System.out.println("Please Enter the Move for Player B as F-Foward,L-Left,R-Right,Back-B");
    		char move4=sc.next().charAt(0);
    		move(move4,player4);
    		printB(board);
    		
    		System.out.println("Please Enter 1 to exit");
    		int x=sc.nextInt();
    		if(x==1) break;
    		int c=0; 
    		
    		for(int i=0;i<board.length;i++){
    		    for(int j=0;j<board[0].length;j++){
    		        if(!(board[i][j]=="__")) c++;
    		    }
    		}
    		
    		if(c==1){
    		    System.out.println("The below Player wins");
    		    printB(board);
    		    break;
    		}
    		
    		
    		
		}
	}
		
		public static void move(char m,String player){
		    for(int i=0;i<board.length;i++){
		        for(int j=0;j<board[0].length;j++){
		            if(board[i][j]==player){
		                if(m=='F'){
		                    board[i+1][j]=player;
		                }
		                if(m=='L'){
		                    board[i][j-1]=player;
		                }
		                if(m=='R'){
		                    board[i][j+1]=player;
		                }
		                if(m=='B'){
		                    board[i-1][j]=player;
		                }
		            }
		        }
		    }

		}
		
		public static void printB(String board[][])
        {
        for (String[] row : board){
            System.out.println(Arrays.toString(row));
            }
        }
		
}
