package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public float border;

	Nematode one = null;
	Nematode two = null;

	public void keyPressed()
	{
		for(Nematode n:nematodes)
		{
			if(keyCode == LEFT)
			{
				if(one == null)
				{
					one = n;
					break;
				}

				else if(two == null)
				{
					two = n;
					break;
				}

				else
				{
					one = n;
					two = null;
					break;
				}
			}
		}		
	}

	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}

	void printNematodes()
	{
		for(Nematode n:nematodes)
		{
			System.out.println(n);
		}
	}

	void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");
		for(TableRow t:table.rows())
		{
			Nematode n = new Nematode(t);
			nematodes.add(n);
		} 
	}

	public void drawNematodes()
	{
		for(Nematode n:nematodes)
		{
			n.render(this);
		}
	}

	public void draw()
	{
		background(0);
		drawNematodes();

	}
}
