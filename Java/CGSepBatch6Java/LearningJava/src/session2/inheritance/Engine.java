package session2.inheritance;

public class Engine extends Part {
	private String engineType;
	
	public Engine(String identifier, String manufacturer, String description, String engineType) {
		super(identifier, manufacturer, description);
		this.engineType = engineType;
	}
	public String getEngineType() {
		return engineType;
	}
	@Override
	public String toString() {
		return super.toString()+ "Engine [engineType=" + engineType + "]";
	}
	
	
	
}
