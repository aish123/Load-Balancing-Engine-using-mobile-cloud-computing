package sjsu.cmpe281.clouwatch;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchClient;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.PutMetricDataRequest;


public class PutMetricDataTest {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    BasicAWSCredentials props = new BasicAWSCredentials(
        "JQCO27GFXAIFWYLV9XUMP",
        "jCPyXfQHfzgwRKm81CaJwAwfztKNYs6hoLHk8VG3");
    AmazonCloudWatchClient cloudWatch = new AmazonCloudWatchClient(props);
    cloudWatch.setEndpoint("http://192.168.51.71:8773/services/CloudWatch/");
    PutMetricDataRequest putMetricDataRequest = new PutMetricDataRequest();
    putMetricDataRequest.setNamespace("GetStarted");
    MetricDatum metricDatum1 = new MetricDatum();
    metricDatum1.setMetricName("SampleMetric");
    metricDatum1.setTimestamp(sdf.parse("2014-11-18T17:00:00"));
    metricDatum1.setValue(1.0);
    putMetricDataRequest.getMetricData().add(metricDatum1);
    MetricDatum metricDatum2 = new MetricDatum();
    metricDatum2.setMetricName("SampleMetric");
    metricDatum2.setTimestamp(sdf.parse("2014-11-18T17:00:00"));
    metricDatum2.setValue(2.0);
    putMetricDataRequest.getMetricData().add(metricDatum2);
    MetricDatum metricDatum3 = new MetricDatum();
    metricDatum3.setMetricName("SampleMetric");
    metricDatum3.setTimestamp(sdf.parse("2014-11-18T17:01:00"));
    metricDatum3.setValue(3.0);
    putMetricDataRequest.getMetricData().add(metricDatum3);
    MetricDatum metricDatum4 = new MetricDatum();
    metricDatum4.setMetricName("SampleMetric");
    metricDatum4.setTimestamp(sdf.parse("2014-11-18T17:01:00"));
    metricDatum4.setValue(4.0);
    putMetricDataRequest.getMetricData().add(metricDatum4);
    MetricDatum metricDatum5 = new MetricDatum();
    metricDatum5.setMetricName("SampleMetric");
    metricDatum5.setTimestamp(sdf.parse("2014-11-18T17:11:00"));
    metricDatum5.setValue(5.0);
    putMetricDataRequest.getMetricData().add(metricDatum5);
    MetricDatum metricDatum6 = new MetricDatum();
    metricDatum6.setMetricName("SampleMetric");
    metricDatum6.setTimestamp(sdf.parse("2014-11-18T17:11:00"));
    metricDatum6.setValue(6.0);
    putMetricDataRequest.getMetricData().add(metricDatum6);
    MetricDatum metricDatum7 = new MetricDatum();
    metricDatum7.setMetricName("SampleMetric");
    metricDatum7.setTimestamp(sdf.parse("2014-11-18T17:03:00"));
    metricDatum7.setValue(7.0);
    putMetricDataRequest.getMetricData().add(metricDatum7);
    MetricDatum metricDatum8 = new MetricDatum();
    metricDatum8.setMetricName("SampleMetric");
    metricDatum8.setTimestamp(sdf.parse("2014-11-18T17:03:00"));
    metricDatum8.setValue(8.0);
    putMetricDataRequest.getMetricData().add(metricDatum8);
    MetricDatum metricDatum9 = new MetricDatum();
    metricDatum9.setMetricName("SampleMetric");
    metricDatum9.setTimestamp(sdf.parse("2014-11-18T17:04:00"));
    metricDatum9.setValue(9.0);
    putMetricDataRequest.getMetricData().add(metricDatum9);
    MetricDatum metricDatum10 = new MetricDatum();
    metricDatum10.setMetricName("SampleMetric");
    metricDatum10.setTimestamp(sdf.parse("2014-11-18T17:04:00"));
    metricDatum10.setValue(10.0);
    putMetricDataRequest.getMetricData().add(metricDatum10);
    
    //cloudWatch.putMetricData(putMetricDataRequest);
   
  }
}
