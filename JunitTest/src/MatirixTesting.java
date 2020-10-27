import java.util.Scanner;
import java.util.*;

class Database{
	
	static int TestNumber = 6;
//	static int TestNumber = 4;
	static int[][] testArray = {
			{0, 1, 1, 0, 0, 0},
			{0, 1, 1, 0, 1, 1},
			{0, 0, 0, 0, 1, 1},
			{0, 0, 0, 0, 1, 1},
			{1, 1, 0, 0, 1, 0},
			{1, 1, 1, 0, 0, 0}		
	};
//	static int[][] testArray = {
//			{0, 0, 0, 0},
//			{0, 0, 0, 0},
//			{0, 0, 0, 0},
//			{0, 0, 0, 0}	
//	};
}

class Node{
    int x;
    int y;
    int position;

    Node(int x, int y, int position){
        this.x = x;
        this.y = y;
        this.position = position;
    }
}

public class MatirixTesting {
	
    static int N =0; //행
    static int M =0; //열
    static int[][] arr;
    static boolean[][] visited;
    
	public static void main(String[] args) {
		 Queue<Node> q = new LinkedList<>();
		 
		 
		 
		int sizeOfMatrix = Database.TestNumber;
		int[][] matrix = Database.testArray;

		//input check
		System.out.println(sizeOfMatrix);
		for (int[] array : matrix) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
			}
			System.out.println();
		}

		//check zero array
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length;j++) {
				if(matrix[i][j] == 0) {
					System.out.println(0);
					return;
				}
			}
		}
		
		//check
		boolean isChecker = false;
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length;j++) {
				if(matrix[i][j] == 1) {
					System.out.println(0);
					return;
				}
			}
		}

	}
	
	static void BFS(int start, int end){

	    try{

	        Queue<Node> q = new LinkedList<>();
			//최초 queue 삽입
	        q.add(new Node(start,end,1));

	        while(!q.isEmpty()){

	            Node node = q.poll();
	            visited[node.x][node.y] = true;
	            System.out.println(node.x + "," +node.y );
				//상하좌우 이동 가능여부를 확인해본다.

				//좌
	            if(node.y-1 >= 0 && node.y-1 < M && arr[node.x][node.y-1] == 1 && visited[node.x][node.y-1] == false){
	                q.add(new Node(node.x,node.y-1,node.position+1));
	            }

				//우
	            if(node.y+1 >= 0 && node.y+1 < M &&arr[node.x][node.y+1] == 1 && visited[node.x][node.y+1] == false){
	                q.add(new Node(node.x,node.y+1,node.position+1));
	            }

				//위	
	            if(node.x-1 >= 0 && node.x-1 < N &&arr[node.x-1][node.y] == 1 && visited[node.x-1][node.y] == false){
	                q.add(new Node(node.x-1,node.y,node.position+1));
	            }

				//아래
	            if(node.x+1 >= 0 && node.x+1 < N && arr[node.x+1][node.y] == 1 && visited[node.x+1][node.y] == false){
	                q.add(new Node(node.x+1, node.y,node.position+1));
	            }

	            if(visited[N-1][M-1]){
	                System.out.println("완료");
	                System.out.println(node.position);
	                break;
	            }

	        }

	    }catch (Exception e){
	        System.out.println(e.toString());
	    }
	}
}
