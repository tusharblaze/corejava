package com.heraizen.cj.day2;

public class smilieFace {

	public static void main(String[] args) {
		int[][] smileFaceArray = {{0,0,0,1,1,1,1,0,0,0},
				 				  {0,0,1,0,0,0,0,1,0,0},
				 				  {0,1,0,1,0,0,1,0,1,0},
				 				  {0,1,0,0,0,0,0,0,1,0},
				 				  {0,1,0,1,0,0,1,0,1,0},
				 				  {0,0,1,0,1,1,0,1,0,0},
				 				  {0,0,0,1,1,1,1,0,0,0},
		 						  };
		int[][] swastikArray = {  {1,1,1,1,1,0,0,0,0,1},
				  				  {0,0,0,0,1,0,0,0,0,1},
				  				  {0,0,0,0,1,0,0,0,0,1},
				  				  {1,1,1,1,1,1,1,1,1,1},
				  				  {1,0,0,0,1,0,0,0,0,0},
				  				  {1,0,0,0,1,0,0,0,0,0},
				  				  {1,0,0,0,1,1,1,1,1,1},
								  };
		
		for(int i=0; i<smileFaceArray.length;i++) {
			for(int j=0; j<smileFaceArray[i].length;j++) {
				if(smileFaceArray[i][j] == 1) {
					System.out.printf("* ");
				}else {
					System.out.printf("  ");
				}
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		
		for(int i=0; i<swastikArray.length;i++) {
			for(int j=0; j<swastikArray[i].length;j++) {
				if(swastikArray[i][j] == 1) {
					System.out.printf("* ");
				}else {
					System.out.printf("  ");
				}
			}
			System.out.printf("\n");
		}

	}

}
