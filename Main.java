// Learning 2D ArrayLists
// Adam Plesca
// 5/4/23

import java.util.*;

public class Main{
	public static void main(String args[]){
	//creating the ArrayList of ArrayLists
	ArrayList <ArrayList<String>> gamingSetup = new ArrayList();
	//ArrayList 1
	ArrayList <String> computerCase = new ArrayList();
	computerCase.add("CPU");
	computerCase.add("Motherboard");
	computerCase.add("GPU");
	//ArrayList 2
	ArrayList <String> PCsetup = new ArrayList();
	PCsetup.add("desk");
	PCsetup.add("144hz monitor");
	PCsetup.add("mouse");
	PCsetup.add("keyboard");
	//ArrayList 3
	ArrayList <String> other = new ArrayList();
	other.add("chair");
	other.add("old desk");
	other.set(1, "new desk");
	//adding the ArrayLists to the 2D ArrayList
	gamingSetup.add(computerCase);
	gamingSetup.add(PCsetup);
	gamingSetup.add(other);
	//printing out the 2D ArrayList
	System.out.println(gamingSetup);
	}
}