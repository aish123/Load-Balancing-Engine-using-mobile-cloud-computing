package sjsu.cmpe281.requestAndResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ResourceStorage {

	public static HashMap<String, Resources> resourceDetails = new HashMap<String, Resources>();
	
	public void addResourceToHashMap(String resourceName, Resources resource)
	{
		resourceDetails.put(resourceName, resource);
	}
	
	public HashMap<String, Resources> getResourceFromHashMap()
	{
		return resourceDetails;
	}
	
	public ArrayList<Resources> getResourcesFromHashMap()
	{
		ArrayList<Resources> resourceList = new ArrayList<Resources>();
		
		for(String resourceName : resourceDetails.keySet())
		{
			resourceList.add(resourceDetails.get(resourceName));
		}
		
		return resourceList;
	}
	
	public ArrayList<String> updateResourcesInHashMap(ArrayList<Resources> resourceLists)
	{
		ArrayList<String> allocatedResources = new ArrayList<String>();
		
		for(int i = 0; i< resourceLists.size(); i++)
		{
			if(resourceDetails.containsKey(resourceLists.get(i).getResourceName()))
			{
				if((resourceLists.get(i).isFullAllocation()==true) || (resourceLists.get(i).isPartialAllocation() ==true))
				{
					resourceDetails.replace(resourceLists.get(i).getResourceName(), resourceLists.get(i));
					allocatedResources.add(resourceLists.get(i).getResourceName());
				}
			}
		}
		
		return allocatedResources ;
	}
	
	public ArrayList<Resources> getAllocatedResourcesFromHashMap()
	{
		ArrayList<Resources> allocatedResources = new ArrayList<Resources>();
		Resources resources = new Resources();
		
		Iterator<Map.Entry<String, Resources>> iterator = resourceDetails.entrySet().iterator() ;
		
		while(iterator.hasNext()){
            Map.Entry<String, Resources> resourceEntry = iterator.next();
            resources = resourceEntry.getValue();
            if((resources.isFullAllocation()==true) || (resources.isPartialAllocation()==true))
			{
				allocatedResources.add(resources);
			}
		}	
		return allocatedResources;
	}
	
}
