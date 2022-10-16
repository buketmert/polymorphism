package polymorphism;

public class CustomerManager {

private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		super();
		this.logger = logger;
	}

	public void add() {
		System.out.println("Musteri Eklendi ");
		this.logger.log("success");
	}
}
