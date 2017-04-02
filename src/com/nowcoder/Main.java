package com.nowcoder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    /**
     *  @param index
     * @param object
     */
    public static  void print (int index , Object object) {
        System.out.println(String.format("{%d} ,%s" , index , object.toString()));
    }

    public static void demoOperation() {
        print(1 , 5 + 2);
        print(2, 5 -2);
        print(3 , 5 * 2);
        print(4 , 5 / 2);
        print(5 , 5 >> 2);//左移两位，乘二再乘二
        print(6 , 5 << 2);
        print(7 , 5 | 2);//0x101 0x10 0x111
        print(8 , 5 ^ 2);//异或
        print(9 , 5 == 2);
        print(10, 5 != 2);
        print(11, 5 % 2);
        print(12, 5.0 /  2);
        print(13, 5 / 2.0);



        int a = 11;
        double b = 2.2f ;
        a += 2;
        print(14 , a);
    }

    public static void demoStirng() {
        String str = "hello world";
        print(1 , str.indexOf("e"));//某个字母的索引 d://xx.exe,可以寻找关键的char"."
        print(2 , str.charAt(1));//str[3];c
        print(3 , str.codePointAt(1));//第一个是h在ascii码内部的取值
        print(4 , str.compareToIgnoreCase("HELLO WORLD"));
        print(5 , str.compareTo("hello volrd"));
        print(6 , str.compareTo("hello xxlrd"));
        print(6 , str.compareTo("hello xolrd"));
        print(6 , str.compareTo("hello Xolrd"));
        print(7 , str.contains("hello"));
        print(8 , str.concat("@@@"));
        print(9 , str.toUpperCase());
        print(10 , str.endsWith("world"));
        print(11  , str.startsWith("hell"));
        print(12  , str.replace("e" , "o"));
        print(13  , str.replaceAll("e|l" , "o"));//支持正则表达式
        print(14 , str.replaceAll("hello" , "hi"));

        print(15 , str);
        StringBuilder stringBuilder = new StringBuilder();  //线程不安全
        StringBuffer stringBuffer = new StringBuffer();
        stringBuilder.append("x ");
        stringBuilder.append(1.2);
        stringBuilder.append('a');
        stringBuilder.append(true);
        print(16 , stringBuilder.toString());

    }

    public static void demoControlFlow() {
        int a = 2;
        int target = a==2 ?1 : 3;
        print(1 , target);
        if (a == 2){
            target = 1;
        }else{
            target = 3;
        }
        print(2 , target);

        String grade = "B";
        switch (grade) {
            case "A":
                print(3 , ">80");
                break;
            case "B":
                print(4 , "60-80");
                break;
            case "C":
                print(5 , "<60");
                break;
                default:
                    print(6 , "unknown");
                    break;
        }//没有break会继续走下去

        for (int i = 0 ;i < 4 ;++i ) {
            if(i == 0){
                continue;
            }//跳出当前循环
            print(7 , i);
            if(i == 2) {
                break;
            }//跳出整个for
        }

        int score =60;
        while (score < 100) {
            print(8 , score);
            score += 20;
        }

        while (score <= 100) {
            print(9 , score);
            score += 20;
        }
    }

    public static void demoList() {
        List<String> strList = new ArrayList<String>(10);
        for (int i = 0 ;i < 4 ;++i ){
            strList.add(String.valueOf(i));
        }
        print(1 , strList);
        List<String> strListB = new ArrayList<String>(10);
        for (int i = 0 ;i < 4 ;++i ){
            strListB.add(String.valueOf(i));
        }
        strList.addAll(strListB);
        print(2 , strList);
        strList.remove(0);
        print(3 , strList);
        strList.remove(String.valueOf(1));//指为1
        print(4 , strList);
        print(5 , strList.get(1));
        Collections.reverse(strList);//反序
        print(6 , strList);
        Collections.sort(strList);//反序
        print(7 , strList);

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
                //反函数
                //先比分数
                //再比学号
            }
        });//内部匿名类的实现
        int[] array = new int[]{1,2,3};
        print(11 , array[1]);

    }

    public static void demoMapTable() {
        Map<String , String> map = new HashMap<String , String>();
        for(int i = 0 ; i < 4 ; ++i ){
            //pair<T , T>
            map.put(String.valueOf(i) , String.valueOf(i*i));
        }

        print(1 , map);
        //map<int , int>::iterator it = map.begin()
        for (Map.Entry<String , String> enrty :map.entrySet()){
            print(2 , enrty.getKey() +"|" + enrty.getValue());
        }
        print(2 , map.values());
        print(3 , map.keySet());
        print(4 , map.get("3"));
        print(5 , map.containsKey("3"));
        print(6 , map.containsValue("A"));
        map.replace("3", "27");
        print(7 , map.get("3"));
//相当与python/内部的字典


    }

    public static void  demoSet() {
        Set<String> strSet = new HashSet<String>();
        for (int i = 0; i < 3; ++i) {
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1, strSet);
        strSet.remove(String.valueOf(1));
        print(2, strSet);
        print(3, strSet.size());
        print(4, strSet.isEmpty());
        print(5, strSet.contains(String.valueOf(1)));
        strSet.addAll(Arrays.asList(new String[]{"A", "B", "C"}));
        print(6, strSet);
        for (String value : strSet) {
            print(7, value);
        }
    }
    public static void demoException() {
        try {

            int k = 2;
           // k = k/0;
            if(k == 2) {
                throw new Exception("for purpose");
            }
        } catch (Exception e) {
            //e.printStackTrace();
            //logger.errot();
            //代码中常用
         //   print(2 , e.getMessage());
            System.out.println("error happens" + e.getMessage());
        } finally {
System.out.println("条条大路通finally" );
            //print(3 , "finally");
//finally始终会到达
            //数据清零或者弥补异常
            //直接关掉数据的引用，不需要等到下次回收周期
        }
    }


    public static void demoOO() {
        Animal a = new Animal("dog" , 8);
        a.ssy();
        Animal human = new Human("Tom", 22 ,"Japan");
        human.ssy();
    }

    public static void demoFunction (){
        Random random = new Random();
        random.setSeed(1);//不设置的话是一个与时间相关的种子（伪随机中的第一个int）
        //nextint = 2;
        //nextint = nextint << xx &100001
        //nextint =nextint.current;
        print(1 , random.nextInt(1000));
        print(2 , random.nextFloat());//默认0-1之间

        List<Integer> array = Arrays.asList(new Integer[] {1, 2 ,3 , 4});
        Collections.shuffle(array);//随机打乱
        print(3 , array);

        Date date = new Date();
        print(4 , date);
        print(5 , date.getTime());

        DateFormat df = new SimpleDateFormat("MM/dd/yyy :HH:mm:ss");
        //时间的特殊格式化
        print(6 , UUID.randomUUID());//随机字符串
        print(7 , Math.log(16));
        print(7 , Math.min(20,16));
        print(7 , Math.max(1,6));
        print(7 , Math.ceil(1.2));
        print(7 , Math.floor(1.2));
//        print(7 , Math.log(16));
    }

    public static void main(String[] args) {
//        demoException();
        demoFunction();
        // demoSet();
     //demoMapTable();
        //demoList();
     //demoOperation();
        //demoStirng();
        //demoControlFlow();
    }
}
