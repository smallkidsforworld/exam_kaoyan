## SE部分
   - static关键字 修饰代码块,方法,属性
   - final关键字 修饰类:不可继承 修饰属性:不被修改. 修饰方法:不能被重写.(finally中的代码,是一定会执行的)
   - 抽象类和接口区别: 一个是抽象具体类(获得某个类的部分功能),一个是抽象行为(制定行为规范);
   - transient:将不需要序列化的属性前添加关键字transient，序列化对象的时候，这个属性就不会被序列化
   
   - **happens-before**:

   - JAVA集合:
      - Collection
         - List
            - LinkedList(链表)
            - ArrayList(线性表)
            - Vector(类似与ArrayList,同步)
            - Stack(继承自Vector)
         - Set
            - HashSet:无重复元素,不保证顺序,0/1个null元素,不同步
            - TreeSet:相较于HashSet,可有序(红黑树)
      - Map
        - HashTable:实现一个key-value映射的哈希表。(同步)
        - HashMap:非同步的，并且允许null，即null value和null key
        - WeakHashMap:它对key实行“弱引用”，如果一个key不再被外部所引用，那么该key可以被GC回收
      - 重点讲解:HashMap:
        - 数据块结构:Node(key,value,next)数组,与链表结合组成的数据结构,数组中存放链表的首位置..
        - 冲突解决:链地址法,当链表长度大于等于8,且数组长度大于64的时候,变化成为红黑树.
        - hash函数:[扰动函数](https://www.cnblogs.com/zhengwang/p/8136164.html)重写对象的equals同时,也要重写hashCode
        - 并发时,put的异常:
        ![blockchain](https://pic2.zhimg.com/80/v2-68f6c6ac43dcdf661a7f28e25a4b5098_1440w.jpg?source=1940ef5c)
      - ConcurrentHashMap: segment,分段锁
   - JAVA创建对象的四种方式:
      - new方法创建
      - 反射创建:java.lang.reflect.Constructor/Class的newInstance方法
      - 对象的clone方法
      - 反序列化手段,ObjectInputStream.readObject();
   -  Object类
      - 方法
         - equals(),hasCode():该方法用于哈希查找，重写了equals方法一般都要重写hashCode方法。
         - getClass():返回Class类型的对象，反射来获取对象
         - clone():现对象的浅复制，只有实现了Cloneable接口才可以调用该方法
         - notify(),notifyAll():该方法唤醒在该对象上等待的线程。
         - wait():wait方法就是使当前线程等待该对象的锁，当前线程必须是该对象的拥有者，也就是具有该对象的锁
         - toString()
         - finalize()
   - java范型:
       - 参数化类型,限定详细的调用类型
       - 类型通配符.
          - ? extend 
          - ? super 
    - java注解和反射
       - 注解
          - 元注解:
             - @Target:注解使用范围
             - @Retention:注解生命周期
                - (SOURCE < CLASS < RUNTIME)
             - @Document:注解包含在javadoc
             - @Inherited:子类可以集成父类的注解.
          - 作用
             - 注释
             - 通过反射获取信息.
       - 反射
          - 在运行状态中,对于任意一个类,都能够知道类的属性和方法.
    - 序列化和反序列化
       - 序列化
           - 将对象写到磁盘.
           - 网络上传输对象的字节序列.
           - 方式:
             - 实现Serialize接口
             - 实现Exteranlizable接口,重写其中的writeExternel,readExternel.可以决定需要序列化的对象(可忽略transient关键字作用)
           - 静态变量不会序列化.
           - java.io.ObjectOutputStream
       - 反序列化
           - java.io.ObjectInputStream
    - 深拷贝和浅拷贝:
       - 深拷贝方法:
          - 构造函数重新构造
          - 序列化和反序列化的方式重新构造.
          - 重载clone方法
          - Jackson序列化
   ### IO部分
   - 字符流
      - Reader
      - Writer
   - 字节流
      - InputStream
      - OutputStream
   ### 异常部分
   - Error:此类错误发生时，JVM将终止线程
   - Exception
      - RuntimeException:系统自动抛出，应用本身可以选择处理或者忽略该异常
      - IOException:必须进行捕获或者抛出该方法之外交给上层处理
   - 常见异常
      - NullPointException:Optional
      - IndexOutOfBoundsException
      - NumberFormatException
      - ClassCastException
      - FileNotFoundException
      - ClassNotFoundException
      - OutOfMemoryError (解决,-Xms增大初始堆)
      - ConcurrentModificationException(使用迭代器删除的时候产生的问题)
   ### JAVA8新机制
   - Optional  
   - Stream
   - lambda表达式


  

## Spring相关
   - ioc
   - aop
   - 事务
## 设计模式
   ## 单例模式  
   ## 工厂模式