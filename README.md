### 5.23更新

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
### 5.24更新

___

普通用户中，待授权，已授权，授权到期均可由getAllState中的字段判断。

1. 修改了数据库和实体类中的字段名。

2. 新增功能

   1. 普通用户申请重新授权

      controller：reApply(state)

      传入state参数，其实只需传参sid即可。

      申请重新授权步骤

      1. 修改state表，状态改为未授权
      2. 修改apply表， 修改begintime（当前时间）和endtime（三个月后）。
      
   2. 新建申请
   
      新建申请时，传入apply，此时需要用到session中的userNow对象来获取uid。
   
      在创建apply时需要创建一个状态state，而state表中需要用到applyid，此时发现mybatis一个巨好用的方法，因为刚才插入了一个apply，此时直接apply.getApplyid()即可获取刚才插入的记录的ID。

### 5.25更新 

---

1. 管理员查看授权

   isgrant = 0 未授权

   isgrant = 1 授权正常

   isgrant = 2 不足15天

   isgrant = 3 授权异常

2. 批准授权

   更新state

