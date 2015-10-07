package list.controller;

import java.util.ArrayList;

public class ListController
{
	private ArrayList<String> firstWords;
	
	public ListController()
	{
		firstWords = new ArrayList<String>();
	}
	
	public void start()
	{
		firstWords.add("");
	}
}
