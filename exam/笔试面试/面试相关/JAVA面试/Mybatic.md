# Mybatic
   - Mybatis 中$与#的区别:
      - 1 <font color="red">#是将传入的值当做字符串的形式</font>，eg:select id,name,age from student where id =#{id},当前端把id值1，传入到后台的时候，就相当于 select id,name,age from student where id ='1'.
      - 2 <font color="red">$是将传入的数据直接显示生成sql语句</font>,eg:select id,name,age from student where id =${id},当前端把id值1，传入到后台的时候，就相当于 select id,name,age from student where id = 1.
      - 3 使用#可以很大程度上防止sql注入。(语句的拼接)
      - 4 但是如果使用在order by 中就需要使用 $.
      - 5 在大多数情况下还是经常使用#，但在不同情况下必须使用$. 
   - ResultMap