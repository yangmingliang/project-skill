package com.example.demo.service;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class JunitFlowTest {
     /**
     *1. @BeforeClass修饰的方法会在所有方法被调用前被执行，
     * 而且该方法是静态的，所以当测试类被加载后接着就会运行它，
     * 而且在内存中它只会存在一份实例，它比较适合加载配置文件。
     * 2. @AfterClass所修饰的方法通常用来对资源的清理，如关闭数据库的连接
     * 3. @Before和@After会在每个测试方法的前后各执行一次。
     **/
     @BeforeClass
     public static void setUpBeforeClass() throws Exception {
         System.out.println("this is beforeClass...");
     }
     @AfterClass
     public static void tearDownAfterClass() throws Exception {
         System.out.println("this is afterClass...");
     }
     @Before
     public void setUp() throws Exception {
         System.out.println("this is before...");

     }

     /**
     * 即使在@Before注解方法、@Test注解方法中抛出了异常，
     * 所有的@After注解方法依然会被执行
     **/
     @After
     public void tearDown() throws Exception {
         System.out.println("this is after");
     }


     /**
     *
     * 1. Failure一般由单元测试使用的断言方法判断失败所引起的，
     *  这经表示测试点发现了问题
     * ，就是说程序输出的结果和我们预期的不一样。
     * 2. error是由代码异常引起的，它可以产生于测试代码本身的错误，
     *  也可以是被测试代码中的
     * 一个隐藏的bug
     * 3.测试用例不是用来证明你是对的，而是用来证明你没有错。
     **/
     @Test
     public void testAdd() {
         assertEquals(5, 5);
     }
     @Test
     public void testDivide() {
         assertEquals(3, 3);
     }

}
