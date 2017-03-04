# RMI範例
### RMI 
    基於Client Server架構，並採用stubs和skeletons來進行遠程物件的通訊
    ● stubs提供remote object的介面給Client端呼叫
    ● skeletons將Clinet端呼叫的方法指派分派給對應的物件執行(JAVA 1.2以後已將此移除)
- 優點
    - 分散式處理
    - 安全性
    - 容易撰寫
- 缺點
    - 僅JAVA
- 實作
    - Client端透過Stubs物件Hi的sayHi方法，來呼叫Server端的HiIm
