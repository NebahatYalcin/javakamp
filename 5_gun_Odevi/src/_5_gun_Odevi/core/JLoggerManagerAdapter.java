package _5_gun_Odevi.core;

import _5_gun_Odevi.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
	@Override
	public void logToSystem(String message) {
		JLoggerManager manager=new JLoggerManager();
		manager.log(message);
		
	}
}
