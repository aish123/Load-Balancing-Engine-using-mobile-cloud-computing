package sjsu.cmpe281.requestAndResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LocationBased {

	public static HashMap<String, List<Resources>> locationDetails = new HashMap<String, List<Resources>>();
	public List<Resources> resourceList = new ArrayList<Resources>();
	public static HashMap<String, Resources> resourceDetails = new HashMap<String, Resources>();
	ResourceStorage resourceStorage = new ResourceStorage();
	
	public void putLocationBasedAllocatedResources(Resources resources)
	{
		String locationName = "";
     
        if(resources.getLocationId()==1)
        {
        	locationName = "N.California";
        	List<Resources> resourceList = new ArrayList<Resources>();
        	if(locationDetails.containsKey(locationName))
        	{
        		List<Resources> tempResourceList = new ArrayList<Resources>();
        		tempResourceList = locationDetails.get(locationName);
        		int size = tempResourceList.size();
        		tempResourceList.add(size, resources);
        	}
        	else
        	{
	        	resourceList.add(resources);
	        	locationDetails.put(locationName, resourceList);
        	}
        }
        if(resources.getLocationId()==2)
        {
        	locationName = "Oregon";
        	List<Resources> resourceList = new ArrayList<Resources>();
        	if(locationDetails.containsKey(locationName))
        	{
        		List<Resources> tempResourceList = new ArrayList<Resources>();
        		tempResourceList = locationDetails.get(locationName);
        		int size = tempResourceList.size();
        		tempResourceList.add(size, resources);
        	}
        	else
        	{
	        	resourceList.add(resources);
	        	locationDetails.put(locationName, resourceList);
        	}
        }
        if(resources.getLocationId()==3)
        {
        	locationName = "N.Virginia";
        	List<Resources> resourceList = new ArrayList<Resources>();
        	if(locationDetails.containsKey(locationName))
        	{
        		List<Resources> tempResourceList = new ArrayList<Resources>();
        		tempResourceList = locationDetails.get(locationName);
        		int size = tempResourceList.size();
        		tempResourceList.add(size, resources);
        	}
        	else
        	{
	        	resourceList.add(resources);
	        	locationDetails.put(locationName, resourceList);
        	}
        }
        if(resources.getLocationId()==4)
        {
        	locationName = "Singapore";
        	List<Resources> resourceList = new ArrayList<Resources>();
        	if(locationDetails.containsKey(locationName))
        	{
        		List<Resources> tempResourceList = new ArrayList<Resources>();
        		tempResourceList = locationDetails.get(locationName);
        		int size = tempResourceList.size();
        		tempResourceList.add(size, resources);
        	}
        	else
        	{
	        	resourceList.add(resources);
	        	locationDetails.put(locationName, resourceList);
        	}
        }
        if(resources.getLocationId()==5)
        {
        	locationName = "Tokyo";
        	List<Resources> resourceList = new ArrayList<Resources>();
        	if(locationDetails.containsKey(locationName))
        	{
        		List<Resources> tempResourceList = new ArrayList<Resources>();
        		tempResourceList = locationDetails.get(locationName);
        		int size = tempResourceList.size();
        		tempResourceList.add(size, resources);
        	}
        	else
        	{
	        	resourceList.add(resources);
	        	locationDetails.put(locationName, resourceList);
        	}
        }
		
	}
	
	public HashMap<String, List<String>> getLocationBasedAllocatedResources()
	{
		HashMap<String, List<String>> resourceListBasedOnLocation = new HashMap<String, List<String>>();
		List<String> resourceNameList = new ArrayList<String>();
		List<Resources> resourcesList = new ArrayList<Resources>();
		resourceDetails = resourceStorage.getResourceFromHashMap();	
		Resources resources1 = new Resources();
		
		Iterator <Map.Entry<String, List<Resources>>> locationIterator = locationDetails.entrySet().iterator();
		String LocationName = "";
		while(locationIterator.hasNext())
		{
			
			Map.Entry<String, List<Resources>> locationEntry = locationIterator.next();	
			LocationName = locationEntry.getKey();
			resourcesList = locationEntry.getValue();
			Iterator<Map.Entry<String, Resources>> resourceDetailsIterator = resourceDetails.entrySet().iterator() ;
			while(resourceDetailsIterator.hasNext())
			{
	            Map.Entry<String, Resources> resourceDetailsEntry = resourceDetailsIterator.next();
	            resources1 = resourceDetailsEntry.getValue();
	            
	            for(int i=0; i<resourcesList.size(); i++ )
	            {
		            if(resources1.getLocationId()==resourcesList.get(i).getLocationId())
		            {
		            	 if(resources1.isFullAllocation()==true||resources1.isPartialAllocation()==true)
		            	 {
		            		if(resourcesList.get(i).getResourceName()==resources1.getResourceName())
		            		{
		            			if(resources1.isFullAllocation()==true)
		            			{
		            				resourcesList.get(i).setFullAllocation(true);
		            				resourcesList.get(i).setPartialAllocation(false);
		            				
		            			}
		            			if(resources1.isPartialAllocation()==true)
		            			{
		            				resourcesList.get(i).setFullAllocation(false);
		            				resourcesList.get(i).setPartialAllocation(true);
		            			}
		            		}
		            	 }
		            	
		            }
	           
	            }
			}
			for(int i=0; i<resourcesList.size(); i++ )
	        {
				if(resourcesList.get(i).isFullAllocation()==true || resourcesList.get(i).isPartialAllocation()==true)
				{
					resourceNameList.add(resourcesList.get(i).getResourceName());
				}
	        }			
		}
		resourceListBasedOnLocation.put(LocationName, resourceNameList);
		return resourceListBasedOnLocation;
	}
}
