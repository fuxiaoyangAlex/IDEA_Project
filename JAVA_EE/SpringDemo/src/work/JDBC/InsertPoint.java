package work.JDBC;

import org.aspectj.lang.ProceedingJoinPoint;

//切面类
public class InsertPoint {

    public void InsertBefore(){
           System.out.println("数据库连接，事务创建完成");
    }

    public void InsertAfterReturning(){
           System.out.println("完成事务提交,断开连接");
    }

    public Object InsertAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
           System.out.println("Join用户等待插入");
           Object obj = proceedingJoinPoint.proceed();
              System.out.println("Join用户插入完成");
              return obj;
    }
}
