package Stu.bcas;
public class RankTable {
		
	public static void main(String[] args) {
		
		int[][] studentMarks = new int [10][4];
		int sum = 0;
		double average = sum / studentMarks.length;
		
		for(int r = 0; r < studentMarks.length; r++){
			
		}
		studentMarks [0][0] = 76;
		studentMarks [0][1] = 100;
		studentMarks [0][2] = 79;
		studentMarks [0][3] = 75;
		
		studentMarks [1][0] = 76;
		studentMarks [1][1] = 66;
		studentMarks [1][2] = 85;
		studentMarks [1][3] = 45;
		
		studentMarks [2][0] = 25;
		studentMarks [2][1] = 85;
		studentMarks [2][2] = 23;
		studentMarks [2][3] = 78;
		
		studentMarks [3][0] = 25;
		studentMarks [3][1] = 45;
		studentMarks [3][2] = 23;
		studentMarks [3][3] = 45;
		
		for( int r=0; r<10; r++){
		for(int c=0; c<4; c++){
		System.out.println("studentMarks ["+r+"] ["+c+"] : "+ studentMarks[r][c]);
		sum=sum + studentMarks[r][c];
	}
		
	System.out.println("*****************");
	average = sum / studentMarks.length;
	
	System.out.println("Totalmarks : " + sum);
	System.out.println("Average is: + "+ average );
	
	}


		}
	}
	

