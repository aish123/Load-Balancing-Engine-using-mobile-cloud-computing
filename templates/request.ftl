<#include "./requestHeader.ftl"> 
<#list requestIDList ?keys as key> 
    ${key} = ${requestIDList[key]} 
</#list> 