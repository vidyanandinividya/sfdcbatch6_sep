package session2.inheritance;

public class Part {
	private String identifier;
	private String manufacturer;
	protected String description;
	public Part(String identifier, String manufacturer, String description) {
		super();
		this.identifier = identifier;
		this.manufacturer = manufacturer;
		this.description = description;
	}
	public String getIdentifier() {
		return identifier;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public String toString() {
		return "Part [identifier=" + identifier + ", manufacturer=" + manufacturer + ", description=" + description
				+ "]";
	}
	
	

}
