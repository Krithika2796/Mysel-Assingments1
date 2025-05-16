package Week3HomeAssignments;

public class Concreteclass implements DatabaseConnection {

	
		public void connect() {
			System.out.println("Connect database");
		
		}
	public void disconnect() {
		System.out.println("Database disconnected");
	}
	public void executeUpdate() {
		System.out.println("execute updated database");

	}
	public static void main(String[] args) {
		Concreteclass DBC=new Concreteclass();
		DBC.connect();
		DBC.disconnect();
		DBC.executeUpdate();
		
	}
}
