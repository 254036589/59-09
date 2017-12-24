/**
 * Project Name:dt59homework
 * File Name:Cat.java
 * Package Name:dt59homework
 * Date:2017年12月24日上午11:19:33
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

import java.util.zip.ZipEntry;

/**
 * Description:   <br/>
 * Date:     2017年12月24日 上午11:19:33 <br/>
 * @author   lm
 * @version
 * @see
 */
public class Cat {

    
        //  Auto-generated method stub
       String name;
       double weight;
       int age;
       
      void one(){
          System.out.println("特别爱吃骨头");   
       }   
       int tow(){
           return 2;
       }
       void ona(){
           System.out.println("爱打架");   
        }   
        int toa(){
            return 2;
        }
        void onc(){
            System.out.println("爱打呼");   
         }   
         int toc(){
             return 2;
         }
       public static void main(String[] args) {
       Cat cat;
       cat=new Cat();
       cat.name="旺财";
       cat.weight=15d;
       cat.age=3;
       
       
       System.out.println("我的小狗叫："+cat.name);
       System.out.println("它特别胖有："+cat.weight+"斤");
       System.out.println("狗的年龄："+cat.age+"岁");
       
       
       cat.one();
       cat.ona(); 
       cat.onc();
    }

}

