package sjsu.cmpe281.resourceAllocation;

/*import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.amazonaws.services.ec2.model.RunInstancesResult;

public class AllocateResourceOnAWSCloud {
	
	 EC2 ec2 = ServiceBuilder.forService(EC2.class)
		        .withRegion(Region.getRegion(Regions.US_WEST_2))
		        .build();
	 
	 AWSCredentials credentials =
			  new PropertiesCredentials(
			         AwsConsoleApp.class.getResourceAsStream("AwsCredentials.properties"));
	 
	 AmazonEC2Client amazonEC2Client =
			  new AmazonEC2Client(credentials);
	 
	 amazonEC2Client.setEndpoint("ec2-54-67-22-38.us-west-1.compute.amazonaws.com");
	 
	 RunInstancesRequest runInstancesRequest = 
			  new RunInstancesRequest();
		        	
		  runInstancesRequest.withImageId("ami-4b814f22")
		                     .withInstanceType("t1.micro")
		                     .withMinCount(1)
		                     .withMaxCount(1)
		                     .withKeyName("abxzThdwq")
		                     .withSecurityGroups("ssh-http");
		  
		  RunInstancesResult runInstancesResult = 
				  amazonEC2Client.runInstances(runInstancesRequest);
		  

}
*/