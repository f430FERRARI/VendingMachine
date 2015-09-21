package ca.ucalgary.seng301.myvendingmachine;

import java.util.ArrayList;
import ca.ucalgary.seng301.vendingmachine.Coin;
import ca.ucalgary.seng301.vendingmachine.Pop;

public class VendingMachine {
	
	int selectionButtonCount;
	ArrayList<SelectionButton> selectionButtons = new ArrayList<SelectionButton>(selectionButtonCount);  
	ArrayList<Integer> coinDenominations = new ArrayList<Integer>(); 						//List of coin kinds 
	ArrayList<ArrayList<Coin>> coinDispenser = new ArrayList<ArrayList<Coin>>();			//Coin types and their loaded coin objects
	ArrayList<Coin> loadedCoins = new ArrayList<Coin>();									//Payment coins 
	int currentPaymentCredit = 0;															//Current money for current purchase
	int totalPayments = 0;																	//Total value of money loaded into the machine
	ArrayList<ArrayList<Pop>> popDispenser = new ArrayList<ArrayList<Pop>>(); 				//Pop kinds and their loaded pop objects
	
	//Delivery chute items
	ArrayList<Pop> unextractedPop = new ArrayList<Pop>(); 
	ArrayList<Coin> change = new ArrayList<Coin>();
	
	public VendingMachine(int selectionButtonCount) { 
		this.selectionButtonCount = selectionButtonCount;
	}
		
}
