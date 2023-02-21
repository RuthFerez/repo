import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String read;
		String rate;
		do {
		Movie myMovie = new Movie();
		System.out.println("Enter the name of a movie: ");
		read = input.nextLine();
		myMovie.setTitle(read);
		
		System.out.println("Enter the rating of the movie :");
		rate = input.nextLine();
		myMovie.setRating(rate);
	
		System.out.println("Enter the nuber of tickets sold for this movie:  ");
		int tickets = input.nextInt();
		myMovie.setSoldTickets(tickets);
		input.nextLine();
		System.out.println(read+": " + "("+ rate +")" + ": " +" Tickets sold: "+ tickets);
		System.out.println("Do you want to enter another? (y/n) ");
		read = input.nextLine();
		}while(read.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
	}

}
