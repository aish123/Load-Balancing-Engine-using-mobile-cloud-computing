package sjsu.cmpe281.resourceAllocation;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.StartInstancesRequest;

public class AllocateInstance {
	
	public static void main(String args[])
	{
		AmazonEC2  ec2;
		AWSCredentials credentials = null;
		try {
            credentials = new ProfileCredentialsProvider().getCredentials();
        } 
		catch (Exception e) 
		{
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (C:\\Users\\sukanyadass\\.aws\\credentials), and is in valid format.",
                    e);
        }
		
		ec2 = new AmazonEC2Client(credentials);
		ec2.setEndpoint("54.67.22.38");		
		Region usWest22 = Region.getRegion(Regions.US_WEST_2);
		((AmazonWebServiceClient) ec2).setRegion(usWest22);
		List<String> instancesToStart = new ArrayList<String>();
		instancesToStart.add("i-165529dc");
		StartInstancesRequest starttr = new StartInstancesRequest();                
        starttr.setInstanceIds(instancesToStart);
        ec2.startInstances(starttr);
        System.out.println("Started the instance: "+ instancesToStart.get(0));
		
	}

}
