package com.google.common.base;

import junit.framework.TestCase;

/**
 * 中文文档：http://ifeve.com/google-guava-using-and-avoiding-null/
 * 首先null是一个非常让人头疼的问题，在guava中大部分的集合都不支持null，因此，guava
 * 对null采用快速失败的操作，guava使用了很多工具类，来让特定值去替换null
 */

public class OptionalTest extends TestCase {
/**
 * Guava用Optional<T>表示可能为null的T类型引用，一个optional类型的实例，可能包含非null的引用，成为引用存在，也可能什么也不包括，成为引用缺失。
 * 它不会说它包含null值！！
 * 同样的对返回值也要做这种空值的包装，可以更加清楚的知道返回值包不包含null
 */
public void testOptionalOf(){
//  首先使用checkNotNull 来检查是否为null，如果是空抛出异常（快速失败），否则创建optional子类Present的实例
    Optional<Integer> possible = Optional.of(5);
//    可以使用optional的方法了 如果引用缺失返回空集合
    possible.asSet();
//    返回true    false
    possible.isPresent();

    possible.get();
//  如果缺失返回defaultValue
    int is = possible.or(3);
//    如果引用缺失，返回null （如果确实值能够存在可以使用get，如果默认值就是null那就用orNull方法）-> 来代替or方法
    possible.orNull();
}

public void testAbsent(){
//    创建一个缺失
    Optional<Integer> possible = Optional.absent();
//   验证是否缺失 调用Absent类 创建引用缺失的optional类
    System.out.println(possible.isPresent());
}

public void  testFromNullable(){
//    构造optional的第三种方式， 如果参数是null那就放回执行Optional.<T>absent()，也就是创建缺失，如果
//    不是null，就返回 new Present<T>(nullableReference);
    Optional<Integer> possible = Optional.fromNullable(0);
}
}
