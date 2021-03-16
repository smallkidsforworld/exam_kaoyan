# 进程相关

# 文件相关

# 网络相关

# 查看文件内容

# 查询相关
   - ls -al
   - find / -name filename.txt
   - lsof命令:列出打开文件,包括socket等套接字.
---
# epoll:是linux 内核实现IO多路复用（IO multiplexing）的一个实现
   - 优点
      - 没有最大并发连接的限制，能打开的fd上限远大于1024
      - 采用回调的方式，效率提升
      - 内存拷贝。使用mmap()文件映射内存来加速与内核空间的消息传递，减少复制开销
   - 事件触发模型:
      - LT水平触发:即当epoll_wait检测到某描述符事件就绪并通知应用程序时，应用程序可以不立即处理该事件；下次调用epoll_wait时，会再次通知此事件
      - ET边缘触发:epoll_wait检测到某描述符事件就绪并通知应用程序时，应用程序必须立即处理该事件。如果不处理，下次调用epoll_wait时，不会再次通知此事件.
   - 
   - 与poll,select差别
   ![blockchain](https://pic1.zhimg.com/v2-e6a869884585625dfc7eace1b90c3024_r.jpg)

