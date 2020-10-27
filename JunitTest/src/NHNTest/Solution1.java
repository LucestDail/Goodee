package NHNTest;

import java.util.*;

public class Solution1 {
	public static char[][] solution() {
		int numOfAllPlayers = 17;
		int numOfQuickPlayers = 5;
		char[] namesOfQuickPlayers = { 'B', 'D', 'I', 'M', 'P' };
		int numOfGames = 11;
		int[] numOfMovesPerGame = { 3, -4, 5, 6, -7, -8, 10, -12, -15, -20, 23 };

		char[][] answer = new char[numOfAllPlayers][2];
		LinkedList<Character> name = new LinkedList<>();
		LinkedList<Integer> score = new LinkedList<>();
		System.out.println("game score--------------------");
		// score setting
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {
				if (j == 0) {
					answer[i][j] = (char) ('A' + ((i + 1) % numOfAllPlayers));
					name.add((char) ('A' + ((i + 1) % numOfAllPlayers)));
					System.out.print(answer[i][j] + " ");
				} else {
					answer[i][j] = '0';
					System.out.print(answer[i][j]);
					score.add(0);
				}
			}
			System.out.println();
		}
		char curOwnerName = 'A';
		score.set(numOfAllPlayers-1, score.get(numOfAllPlayers-1) + 1);
		System.out.println(name + " : " + name.size());
		System.out.println(score + " : " + score.size());

		// game setting
		System.out.println("game setting--------------------");
		char[] curPosition = new char[numOfAllPlayers - 1];
		boolean[] curOwner = new boolean[numOfAllPlayers];
		curOwner[0] = true;
		char buff;
		for (int i = 0; i < curPosition.length; i++) {
			curPosition[i] = (char) ('B' + i);
			System.out.print("Sitting : " + curPosition[i]);
			System.out.println(", owner Check : " + curOwner[i]);
		}

		// item moving
		int positionIndex = 0;
		boolean checkRetired = false;
		for (int i = 0; i < numOfGames; i++) {
			System.out.println("Round start : " + i);
			for (int j = 0; j < curOwner.length; j++) {
				if (curOwner[j]) {
					curOwner[j] = false;
					int positionBuff = positionIndex;
					positionIndex = (positionIndex + numOfMovesPerGame[i]) % curPosition.length;
					if(positionIndex < 0) {
						positionIndex = numOfAllPlayers + ((positionIndex + numOfMovesPerGame[i]) % curPosition.length);
						System.out.println("position index is under zero! : " + ((positionIndex + numOfMovesPerGame[i]) % curPosition.length) + " -> " + positionIndex);
					}
					for (char item : namesOfQuickPlayers) {
						if (curPosition[positionIndex] == item) {
							positionIndex = positionBuff;
							checkRetired = true;
							break;
						}
					}
					if (checkRetired) {
						break;
					} else {
						curOwner[positionIndex] = true;
						buff = curPosition[positionIndex];
						curPosition[positionIndex] = curOwnerName;
						curOwnerName = buff;
						break;
					}
				}
			}
			System.out.println("position : " + positionIndex);
			System.out.println("cur Onwer : " + curOwnerName);
			for (int in = 0; in < curPosition.length; in++) {
				System.out.print("Sitting : " + curPosition[in]);
				System.out.println(", owner Check : " + curOwner[in]);
			}

			for (int namei = 0; namei < name.size(); namei++) {
				if (name.get(namei) == curOwnerName) {
					score.set(namei, score.get(namei) + 1);
				}
			}
			System.out.println(name);
			System.out.println(score);

		}
		return answer;
	}

}
