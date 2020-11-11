[文章链接:Java面试常考的 BIO，NIO，AIO 总结](https://blog.csdn.net/m0_38109046/article/details/89449305)    
所有的IO流:   
![blockchain](https://img-blog.csdnimg.cn/20190717105014847.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY0MzI3Nw==,size_16,color_FFFFFF,t_70)
# BIO(Blocking I/O)
   - 同步阻塞I/O模式，数据的读取写入必须阻塞在一个线程内等待其完成
# NIO(New I/O)
   - NIO是一种同步非阻塞的I/O模型，在Java 1.4 中引入了NIO框架，对应 java.nio 包，提供了 Channel , Selector，Buffer等抽象
   - NIO 包含下面几个核心的组件：
        1. Channel(通道):通道是双向的，可读也可写.
        2. Buffer(缓冲区):通过缓冲区进行数据读写.
        3. Selector(选择器):单线程实现多通道数据处理