//Hayden McMullin
//U1A3 Roach Population

public class RoachPopulation 
{
	int num; //Total Population
	public RoachPopulation()
	{ //constructor sets roach population to 100
		num = 100;
	}
	
	public void timePasses()
	{ //multiplies num by 2 to simulate time passing
		num = num*2;
	}
	
	public void spray()
	{ // decreases the total population by 10% simulating being sprayed by insecticide
		num = num*90/100;
	}
	
	public double getRoaches()
	{ // getter used to get the total roach population.
		return num;
	}
}
