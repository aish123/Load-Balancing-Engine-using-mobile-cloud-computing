<!--header.ftl-->
<!DOCTYPE html>
<h1><div align="center">Cloud Watch Visualization</div></h1>
<h3><div align="center">${message}</div></h3>
<head>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.load("visualization", "1", {packages:["gauge"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['Label', 'Value'],
          ['Memory', 512],
          ['CPU', 1.8],
          ['Storage', 100]
        ]);
        
        var data1 = google.visualization.arrayToDataTable([
          ['Label', 'Value'],
          ['Memory', 128],
          ['CPU', 1.7],
          ['Storage', 110]
        ]);
        
        var data2 = google.visualization.arrayToDataTable([
          ['Label', 'Value'],
          ['Memory', 256],
          ['CPU', 1.9],
          ['Storage', 200]
        ]);

        var options = {
          width: 400, height: 120,
          redFrom: 90, redTo: 100,
          yellowFrom:75, yellowTo: 90,
          minorTicks: 5
        };
        
        var options1 = {
          width: 400, height: 120,
          redFrom: 90, redTo: 100,
          yellowFrom:75, yellowTo: 90,
          minorTicks: 5
        };
        
        var options2 = {
          width: 400, height: 120,
          redFrom: 90, redTo: 100,
          yellowFrom:75, yellowTo: 90,
          minorTicks: 5
        };

        var chart = new google.visualization.Gauge(document.getElementById('chart_div'));
        chart.draw(data, options);
        
        var chart1 = new google.visualization.Gauge(document.getElementById('chart_div1'));
        chart1.draw(data1, options1);
        
        var chart2 = new google.visualization.Gauge(document.getElementById('chart_div2'));
        chart2.draw(data2, options2);

        setInterval(function() {
          data.setValue(0, 1, 40 + Math.round(60 * Math.random()));
          data1.setValue(0, 1, 40 + Math.round(60 * Math.random()));
          data2.setValue(0, 1, 40 + Math.round(60 * Math.random()));
          chart.draw(data, options);
          chart1.draw(data1, options1);
          chart2.draw(data2, options2);
        }, 13000);
        setInterval(function() {
          data.setValue(1, 1, 40 + Math.round(60 * Math.random()));
          data1.setValue(0, 1, 40 + Math.round(60 * Math.random()));
          data2.setValue(0, 1, 40 + Math.round(60 * Math.random()));
          chart.draw(data, options);
          chart1.draw(data1, options1);
          chart2.draw(data2, options2);
        }, 5000);
        setInterval(function() {
          data.setValue(2, 1, 60 + Math.round(20 * Math.random()));
          data1.setValue(0, 1, 40 + Math.round(60 * Math.random()));
          data2.setValue(0, 1, 40 + Math.round(60 * Math.random()));
          chart.draw(data, options);
          chart1.draw(data1, options1);
          chart2.draw(data2, options2);
        }, 26000);
      }
    </script>
  </head>
  <body>
  	<div> AWS Instance 1
    	<div id="chart_div" style="width: 400px; height: 120px;"></div>
    </div>
    <div> AWS Insatnce 2
    <div id="chart_div1" style="width: 400px; height: 120px;"></div>
    </div>
    <div> AWS Instance 3
    <div id="chart_div2" style="width: 400px; height: 120px;"></div>
    </div>
  </body>
</html>