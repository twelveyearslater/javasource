package class14;

public class Select {
//	select

	
//	具体代码：
//	SELECT DISTINCT name FROM user_java where id<10

//	SELECT *FROM user_java WHERE id<10

//	SELECT name FROM user_java where id<10

//	SELECT * FROM user_java WHERE id<10 AND name = 'andelie' AND id>1
	
//	SELECT * FROM user_java where id>2 or id<2
    
//	SELECT * FROM user_java ORDER BY name ASC从小到大排序（其中asc可有可无）
	
//	SELECT * FROM user_java ORDER BY name DESC 从大到小排序
	
//	SELECT * FROM SU
	
//	SELECT * FROM user_java where name is NULL   输出name列字段中为null值的数据
	
//	SELECT * FROM user_java where name is not NULL    输出name列字段中不为null值的数据
	
//	SELECT column_name(s) FROM table_name WHERE column_name IN (value1,value2,...)  提取某列中的具体几个数据
	
//	SELECT * FROM Persons WHERE LastName IN ('Adams','Carter')    例子
	
//	SELECT column_name(s) FROM table_name WHERE column_name BETWEEN value1 AND value2    提取某列中某成员到某成员之间的数据
	
//	SELECT * FROM Persons WHERE LastName BETWEEN 'Adams' AND 'Carter'    例子
	
//	SELECT column_name(s) FROM table_name WHERE column_name not BETWEEN value1 AND value2  范围之外的...
	
//	以下是几个实例：
	
//	SELECT TOP 2 * FROM Persons
//	SELECT TOP 50 PERCENT * FROM Persons
//	SELECT * FROM Persons WHERE ROWNUM <= 5
//	SELECT * FROM Persons LIMIT 5
	
//	SELECT * FROM user_java UNION SELECT * FROM user2_java  把两个表一起打印出来，相同的值只打印一次。
//	NION ALL 命令和 UNION 命令几乎是等效的，不过 UNION ALL 命令会列出所有的值。
//	ELECT * FROM user_java UNION ALL SELECT * FROM user2_java    把两个表一起打印出来，相同的值也会打印。
	
//	SELECT column_name, aggregate_function(column_name)     GROUP BY 的语法
//	FROM table_name
//	WHERE column_name operator value
//	GROUP BY column_name
	
//	SELECT count(0), name from user_java Group BY name
//	SELECT sum(id), name from user_java Group BY name
//	SELECT avg(id), name from user_java Group BY name
//	SELECT max(id), name from user_java Group BY name
//	SELECT min(id), name from user_java Group BY name
	
//	SELECT sum(salary) as sala, name from user_java GROUP BY name HAVING sala>10000
	

}
   