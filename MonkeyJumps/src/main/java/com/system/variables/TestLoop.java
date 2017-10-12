package com.system.variables;

public class TestLoop {
	public static void main(String[] args) {
		int[][] array1 = new int[4][4];
		System.out.println(array1.length);
		for (int row = 0; row < array1.length; row++) {
			for (int column = 0; column < array1[row].length; column++) {
				array1[row][column] = row + column;
			}
		}
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				System.out.print(array1[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
