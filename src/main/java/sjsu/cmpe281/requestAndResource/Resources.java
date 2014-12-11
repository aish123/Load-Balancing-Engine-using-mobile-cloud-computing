package sjsu.cmpe281.requestAndResource;

public class Resources {
	
	private int cpu_units;	
	private int memory;
	private int storage;
	private int locationId;
	private String resourceName;
	private boolean fullAllocation;
	private boolean partialAllocation;
	
	
	public int getCpu_units() {
		return cpu_units;
	}
	public void setCpu_units(int cpu_units) {
		this.cpu_units = cpu_units;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public boolean isFullAllocation() {
		return fullAllocation;
	}
	public void setFullAllocation(boolean fullAllocation) {
		this.fullAllocation = fullAllocation;
	}
	public boolean isPartialAllocation() {
		return partialAllocation;
	}
	public void setPartialAllocation(boolean partialAllocation) {
		this.partialAllocation = partialAllocation;
	}
}
