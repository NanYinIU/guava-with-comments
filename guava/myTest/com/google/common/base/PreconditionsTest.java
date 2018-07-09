package com.google.common.base;

import junit.framework.TestCase;

public class PreconditionsTest extends TestCase {

    public void testCheckArgument() {
//       看源码就知道 checkArgument方法有三种构造形式 下面一一进行举例
        int x = 1;
        /*       平常当验证参数正确是否会这样写 要去手动抛异常
         *       而现在使用Preconditions.checkArgument方法只需要验证就行了 他内部也是使用抛出异常的机制，只不过
         *       替代我们封装了以下,这个方法有很多的重载，大致分为以下三种
         *       if (value < 0) {
         *             throw new IllegalArgumentException("input is negative: " + value);
         *           }
         */
//        第一种形式 如果expression不正确也就是返回false 会抛出异常
//        Preconditions.checkArgument(x > 2);
//        第二种形式 会打印出自定义的errorMessage
//        Preconditions.checkArgument(x > 2 ,"error message");
//        第三种形式 根据后面参数打印出特殊的errorMessage 类似c的printf
        Preconditions.checkArgument(x > 2,"message %s > 2 is not right",x);

    }

    public void testCheckNotNull(){
        String s = "hello world";
        String s1 = null;
//      和checkArgument相似，用来检验参数是否为空
//        Preconditions.checkNotNull(s1);
//        同样的有很多重载的方法。这样能够输出自定义的错误信息
        Preconditions.checkNotNull(s1," s1 is null!!!");
    }

    public void testCheckState(){
//   用来检查状态的函数 和checkArgument类似同样需要bool型的参数进行判断
//    但是不同的是checkState函数抛出的是IllegalStateException异常
    }

    public void testCheckElementIndex(){
//    检查索引是否有效
        int[] x = new int[0];
//        抛出indexOutOfBoundsException异常 同样也有很多重载的方法参见方法1
        Preconditions.checkElementIndex(1,x.length);
    }

    public void testCheckPosition(){
        int[] x = new int[2];
//        其实和上面的方法相同，都会去检查是否越界，但是这个更加定制一些。。大概吧。。7
        Preconditions.checkPositionIndex(1,x.length,"this is new index");
    }
}

