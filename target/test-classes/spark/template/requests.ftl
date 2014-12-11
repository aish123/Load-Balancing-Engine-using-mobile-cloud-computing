<h1><div align="center">****** Generated 1000 Requests ****** </div></h1>
<div = "request page">
<div class= "table-responsive" align="center">

<table id="request" class="table" border="1" cellpadding="5">
<#list resourceRequest as resourceRequest>
     <tr>
     <th>CPU Units</th>
     <th>Memory Space</th>
     <th>Storage</th>
     <tr>
     <td>${resourceRequest.getCpu_units()}</td>
     <td>${resourceRequest.getMemory()}</td>   
     <td>${resourceRequest.getStorage()}</td>       
    </tr>    
  </#list> 
  </table>
  </div>