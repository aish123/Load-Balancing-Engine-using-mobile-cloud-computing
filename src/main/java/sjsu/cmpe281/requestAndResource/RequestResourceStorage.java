package sjsu.cmpe281.requestAndResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RequestResourceStorage {
	
	public static HashMap<Integer, ResourceRequest> requestDetails = new HashMap<Integer, ResourceRequest>();

	public void addRequestsToHashMap(int requestID, ResourceRequest resourceRequest)
	{
		requestDetails.put(requestID, resourceRequest);
	}
	
	public ArrayList<Integer> getRequestsFromHashMap (){
		
		ArrayList<Integer> requestIDs = new ArrayList<Integer>();
		 
		 for(int requestID : requestDetails.keySet())
		 {
			 requestIDs.add(requestID) ;
		 }	 
		 return requestIDs;	
	}
	
	public ArrayList<ResourceRequest> getResourcesFromHashMap()
	{
		ArrayList<ResourceRequest> resourceRequestList = new ArrayList<ResourceRequest>();
		
		for(int requestID : requestDetails.keySet())
		{
			resourceRequestList.add(requestDetails.get(requestID));
		}
		
		return resourceRequestList;
	}
	
	public ArrayList<ResourceRequest> getAllocatedRequestFromHashMap()
	{
		ArrayList<ResourceRequest> resourceRequestList = new ArrayList<ResourceRequest>();
		ResourceRequest resourceRequest = new ResourceRequest();
		Iterator<Map.Entry<Integer, ResourceRequest>> iterator = requestDetails.entrySet().iterator() ;
		
		while(iterator.hasNext()){
            Map.Entry<Integer, ResourceRequest> requestEntry = iterator.next();
            resourceRequest = requestEntry.getValue();
            if(resourceRequest.isAllocated()==true)
            {
            	resourceRequestList.add(resourceRequest);
            }
		}
		
		return resourceRequestList;
	}

}
