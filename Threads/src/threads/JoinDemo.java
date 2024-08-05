package threads;

public class JoinDemo {

	public static void main(String[] args) {
		Colleague collegue1 = new Colleague();
		collegue1.setName("ameri");
		Colleague collegue2 = new Colleague();
		//Colleague collegue3 = new Colleague();
		collegue2.setName("jeorge");
		Colleague collegue3 = new Colleague("martins");

		collegue1.start();

		try {
			collegue1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		collegue2.start();
		collegue3.start();


	}

}