# synchronized和可重入锁
   - synchronized:jvm内部实现的加锁机制.
      - 锁升级:偏向锁->轻量级锁(前两种使用cas)->重量级锁.
      - 重量锁:使用操作系统底层互斥模型
         - 使用monitorenter与monitorexit实现加锁.
         - 使用两个队列,一个是刚尝试获取锁的队列,一个是等待队列.
   - 可重入锁:基于AQS实现
      - 特点
         - 可重入(与synchronized类似)
         - 可中断等待
         - 可绑定多个condition
         - 需要手动加锁和释放锁
         - 随时随地实现加锁.
         - 可以实现公平(消耗大)
      - 分类
         - 可重入.一个可重入锁，内部定义了公平锁与非公平锁。
         - 读写锁.文件的读写操作分开，分成2个锁来分配给线程，从而使得多个线程可以同时进行读操作
   - 比较
      - 存在层次:Syncronized 是Java 中的一个关键字，存在于 JVM 层面，Lock 是 Java 中的一个接口
      - 锁的释放条件:
         - synchronized实现的锁
            1. 获取锁的线程执行完同步代码后，自动释放；
            2. 线程发生异常时，JVM会让线程释放
         - Lock 必须在 finally 关键字中释放锁，不然容易造成异常线程死锁.
      - 锁的获取:
         - 在Syncronized中,假设线程A获得锁,B线程等待。如果A发生阻塞，那么B会一直等待
         - 而Lock则是可以尝试加锁tryLock.如果尝试获取到锁，则不用一直等待
      - 锁的状态
         - synrhronized不可以获取锁的状态
         - lock可以获取锁状态.
      - 锁的类型
         - synrhronized:可重入,非公平
         - Lock:可重入,公平,非公平
      - 锁的性能
         - synchronized的锁适用于少量同步
         - lock适用于大量同步
         - Lock锁可以提升操作效率(实现读写锁)
         - Lock锁可以中断