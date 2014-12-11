package sjsu.cmpe281.clouwatch;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchClient;
import com.amazonaws.services.cloudwatch.model.PutMetricDataRequest;

public class CloudWatch {

	final String AWSAccessKeyId= "AKIAJMGEUJF5BN7W5FPA";
	final String AWSSecretKey= "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";
	BasicAWSCredentials props = new BasicAWSCredentials("","");
	
	AmazonCloudWatchClient cloudWatch = new AmazonCloudWatchClient(props);
	//cloudWatch = 

	
	PutMetricDataRequest putMetricDataRequest = new PutMetricDataRequest();
	
}
