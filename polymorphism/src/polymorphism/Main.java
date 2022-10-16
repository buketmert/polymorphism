package polymorphism;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new EmailLogger());
		customerManager.add();

//		EmailLogger logger = new EmailLogger();
//		logger.log("Emaile Log Mesaji");
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
//		
//		for(BaseLogger logger1:loggers) {
//			logger1.log("Log Mesaji : ");
//		}

	}

}
