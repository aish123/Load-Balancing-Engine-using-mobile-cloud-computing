<#include "./locationHeader.ftl"> 
<#list location ? keys as key> 
    ${key} = ${location[key]} 
</#list> 
</body>