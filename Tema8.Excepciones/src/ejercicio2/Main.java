package ejercicio2;

public class Main {

	public static void main(String[] args) {

		try {
			
			HoraExacta hora = new HoraExacta(4, -5, -6);		

		} catch (NegativeHourException e) {
			System.err.println(e.getMessage());
		} catch (NegativeMinuteException e) {
			System.err.println(e.getMessage());
		} catch (NegativeSecondException e) {
			System.err.println(e.getMessage());
		}

	}

}
