package class14;

public class Select {
//	select

	
//	������룺
//	SELECT DISTINCT name FROM user_java where id<10

//	SELECT *FROM user_java WHERE id<10

//	SELECT name FROM user_java where id<10

//	SELECT * FROM user_java WHERE id<10 AND name = 'andelie' AND id>1
	
//	SELECT * FROM user_java where id>2 or id<2
    
//	SELECT * FROM user_java ORDER BY name ASC��С������������asc���п��ޣ�
	
//	SELECT * FROM user_java ORDER BY name DESC �Ӵ�С����
	
//	SELECT * FROM SU
	
//	SELECT * FROM user_java where name is NULL   ���name���ֶ���Ϊnullֵ������
	
//	SELECT * FROM user_java where name is not NULL    ���name���ֶ��в�Ϊnullֵ������
	
//	SELECT column_name(s) FROM table_name WHERE column_name IN (value1,value2,...)  ��ȡĳ���еľ��弸������
	
//	SELECT * FROM Persons WHERE LastName IN ('Adams','Carter')    ����
	
//	SELECT column_name(s) FROM table_name WHERE column_name BETWEEN value1 AND value2    ��ȡĳ����ĳ��Ա��ĳ��Ա֮�������
	
//	SELECT * FROM Persons WHERE LastName BETWEEN 'Adams' AND 'Carter'    ����
	
//	SELECT column_name(s) FROM table_name WHERE column_name not BETWEEN value1 AND value2  ��Χ֮���...
	
//	�����Ǽ���ʵ����
	
//	SELECT TOP 2 * FROM Persons
//	SELECT TOP 50 PERCENT * FROM Persons
//	SELECT * FROM Persons WHERE ROWNUM <= 5
//	SELECT * FROM Persons LIMIT 5
	
//	SELECT * FROM user_java UNION SELECT * FROM user2_java  ��������һ���ӡ��������ͬ��ֵֻ��ӡһ�Ρ�
//	NION ALL ����� UNION ������ǵ�Ч�ģ����� UNION ALL ������г����е�ֵ��
//	ELECT * FROM user_java UNION ALL SELECT * FROM user2_java    ��������һ���ӡ��������ͬ��ֵҲ���ӡ��
	
//	SELECT column_name, aggregate_function(column_name)     GROUP BY ���﷨
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
   