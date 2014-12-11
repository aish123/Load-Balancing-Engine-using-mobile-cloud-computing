<#include "./resourceHeader.ftl"> 
<#list resourceNames ?keys as key> 
    ${key} = ${resourceNames[key]} 
</#list> 
</body>