package list.controller;

import java.util.ArrayList;
import list.view.ListDisplay;

public class ListController
{
	private ArrayList<String> firstWords;
	private ListDisplay myPopups;
	public ListController()
	{
		firstWords = new ArrayList<String>();
		myPopups = new ListDisplay();
	}
	
	public void start()
	{
		firstWords.add("communism");
		firstWords.add("lolololololololol");
		firstWords.add(1, "*CRYING INSANELY*");
		displayList();
		firstWords.set(2, "life is riddled with capitilism");
		displayList();
		firstWords.remove(0);
		displayList();
		showOtherLoop();
	}
	
	private void displayList()
	{
		for(int spot = 0; spot < firstWords.size(); spot ++)
		{
			myPopups.showList("The contents at " + spot + " are " + firstWords.get(spot));
		}
	}
	private void showOtherLoop()
	{
		for(String words : firstWords)
		{
			myPopups.showList(words);
		}
	}
}
