package pkgCore;

import java.util.ArrayList;

import pkgException.DeckException;

public class DeckTest extends Deck {
	
	public static void main(String[] args) throws DeckException {
		//Tests for getRemaining() (couldn't figure out how to create a working set for Testing without making it Maven)
		
		//testing for suit
		Deck d = new Deck();
		
		System.out.println("NUMBER OF CARDS: " + d.getiDeckCount());
		System.out.println("HEARTS: " + d.getRemaining(pkgEnum.eSuit.HEARTS));
		
		Card c1 = d.Draw(pkgEnum.eSuit.HEARTS);
		Card c2 = d.Draw(pkgEnum.eSuit.HEARTS);
		
		System.out.println("NEW HEARTS: " + d.getRemaining(pkgEnum.eSuit.HEARTS) + "\n");
		
		//testing for rank
		
		Deck d2 = new Deck();
		
		System.out.println("NUMBER OF CARDS: " + d2.getiDeckCount());
		System.out.println("TWOS: " + d2.getRemaining(pkgEnum.eSuit.HEARTS));
		
		Card c3 = d2.Draw(pkgEnum.eRank.TWO);
		Card c4 = d2.Draw(pkgEnum.eRank.TWO);
		
		System.out.println("NEW TWOS: " + d2.getRemaining(pkgEnum.eRank.TWO) + '\n');
		
		//testing for drawing all cards
		Deck d3 = new Deck();
		
		System.out.println("NUMBER OF CARDS: " + d3.getiDeckCount());
		
		for (int i = 0; i < 52; i++) {
			Card c5 = d3.Draw();
		}
		
		System.out.println("NUMBER OF CARDS: " + d3.getiDeckCount());
		System.out.println("NEW TWOS: " + d3.getRemaining(pkgEnum.eRank.TWO));
		System.out.println("NEW NINES: " + d3.getRemaining(pkgEnum.eRank.NINE));
		System.out.println("NEW CLUBS: " + d3.getRemaining(pkgEnum.eSuit.CLUBS));
		System.out.println("NEW DIAMONDS: " + d3.getRemaining(pkgEnum.eSuit.DIAMONDS));
	}
}
