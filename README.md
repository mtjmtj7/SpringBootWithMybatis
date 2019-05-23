5.23更新

___

***查询某一普通用户所有授权记录***（回忆一哈Mybatis多表查询

1. 主要查询对象	状态表
2. 关联          状态表中uid，aid均为一对一关系

实现：

1. 在状态表实体中添加 其他对象。该场景中，申请人、批准人和申请表详情均为外键

   ![](https://cdn.sinaimg.cn.52ecy.cn/large/005BYqpgly1g3boxz4cwcj309s08odfx.jpg)

2. xml中，查询均为正常查询，但是在自定义结果集中，如下图所示。

   ![](https://cdn.sinaimg.cn.52ecy.cn/large/005BYqpgly1g3bpj4fo7nj30sg0gzjt2.jpg)

   association即为一对一查询，property对应实体中的bean对象，select为查询方法，column为数据库列名。

   通过一对一查询，我们即可得到该状态表的所有详细信息。

   如果想要得到部分信息，对结果集修改即可。

   