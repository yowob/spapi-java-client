## README

1. use swagger-codegen for selling-partner-api-models at 2021/9/9,  run by JDK8

2. fix bugs of selling-partner-api-models

3. change code for RDT:

- OrdersV0Api#getOrdersCall   add new line:  localVarHeaderParams.put("isRDT", "true");

- LWAClient.getAccessToken

  Get a RDT and put it into lwaAccessTokenCache before invoke OrdersV0Api#getOrders, Then getOrders response PII Data.
  If you do not want support RDT, set RDT_ENBALE = false.

5. ReportsApi must run by JDK11, otherwise it throw error when decrypt report file.





## 使用说明

1. 基于 2021/9/9 的 selling-partner-api-models 版本, 并使用 swagger-codegen 生成. 基于JDK8

2. 修复了 selling-partner-api-models 自带的部分BUG.

3. 并为了支持 RDT 做了如下改动:

- OrdersV0Api#getOrdersCall 增加一行  localVarHeaderParams.put("isRDT", "true");
- LWAClient.getAccessToken 逻辑修改了

  在调用 OrdersV0Api#getOrders 前还需要取到RDT, 并提前设入lwaAccessTokenCache中. 这样就能在getOrders 直接返回卖家地址姓名了.
  如果你想关闭RDT, 则 RDT_ENBALE = false 即可

5. 使用ReportsApi, 需要基于JDK11运行, 否则在解密下载报表文件时会报错

