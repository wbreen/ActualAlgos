/**
 *  @author   J. Hollingsworth and YOUR NAME HERE
 *  
 *  Divide-and-Conquer approach to placing tromino
 *  tiles on a 2^k x 2^k board.
 */
import java.util.Scanner;
import java.awt.Color;

public class Tiling {
	
	private static Color randColor() {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		
		return new Color(r, g, b);
	}
	
	//Solve via Divide and Conquer method
	//db is the board, row + col is the upper-left corner to start tiling, n is Num rows/cols to tile
	public static void tile(DeficientBoard db, int row, int col, int n) {
		//Base case
		if(n >= 2){
			//Find deficiency
			int dr = db.getDeficientRow(row, col, n);
			int dc = db.getDeficientCol(row, col, n);
			int pieceType = 0;
			
			if(dr < row + n/2 && dc < col + n/2){
				pieceType = db.LR;
			}
			if(dr < row + n/2 && dc >= col + n/2){
				pieceType = db.LL;
			}
			if(dr >= row + n/2 && dc < col + n/2){
				pieceType = db.UR;
			}
			if(dr >= row + n/2 && dc >= col + n/2){
				pieceType = db.UL;
			}
			//tile the middle
			db.placeTromino(row+n/2 -1, col+n/2 -1, pieceType, randColor());
			
			//tile each quadrant
			tile(db, row, col, n/2);
			tile(db, row, col +n/2, n/2);
			tile(db, row + n/2, col, n/2);
			tile(db, row + n/2, col + n/2, n/2);
			
			
		}
		//Divide the board into 4 different quadrants
		
		//Put tromino in with empty square in the empty quadrant, and set the new tile spots as missing positions, then solve all them the same way
		
	}

	public static void main(String[] args) {
		
		DeficientBoard db = new DeficientBoard(4);
		System.out.println(db);
		
		tile(db, 0, 0, db.getSize());
		
		BoardViewer bv = new BoardViewer(db);
		bv.setVisible(true);

	}

}
