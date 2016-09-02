// Hayden McMullin
//AP Computer Sciences
// 09/01/16
// U1A3
//Academic Integrity Statement: 
// I have not copied, plagiarized or allowed another student to complete this exercise.  I attest that this is my own work //and reflects my understanding of the material.
/* Project Description: Project creates a roach object and sets
 * base population to 100 than increase or decreases that value to simulate time passage or insecticide being sprayed
*/
public class RoachPopulationDriver {
	public static void main(String Arg[]) { // creates a RoachPopulation object
											// and runs methods from
											// RoachPopulation
		RoachPopulation x = new RoachPopulation();
		x.timePasses();
		System.out.println(x.getRoaches());
		x.spray();
		System.out.println(x.getRoaches());
		x.spray();
		System.out.println(x.getRoaches());
		x.timePasses();
		System.out.println(x.getRoaches());
	}
}
