<#include "./billingHeader.ftl"> 
<#list billing ? keys as key> 
    ${key} = ${billing[key]} 
</#list> 