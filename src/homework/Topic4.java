package homework;

/**
 * 作业4: 封装一个数组对象(暂时用int型即可)
 *
 * 可先定义个数组看下,比如int[],有哪些方法提供,太少了
 *
 * 要求实现: 数组类
 *
 * - new 时传入指定大小
 *
 * - 可以添加元素
 *
 * - 可以删除元素
 *
 * - 可以根据给定元素,找到索引位置
 *
 * - 并支持跨度寻找,如find(1234,5),即夸过5个索引之后寻找
 *
 * - 实现对数组的遍历功能
 *
 * - 实现判断数组是否为空
 *
 * - 不理解,看下Topic6,栈的设计
 *
 * @author haoc
 */
public class Topic4 {
    public static void main(String[] args) {
        new IntArray(5);

    }

    static class IntArray{

        int[] intArray;

        //new 时传入指定大小
        public IntArray(int size) {
            intArray = new int[size];
        }
        //可以添加元素
        public void set(int index, int value){
            intArray[index] = value;

        }
        //可以删除元素
        public void delete(int index){
            intArray[index] = 0;

        }

        //可以根据给定元素,找到索引位置
        public int get(int value){
            for(int i =0;i<intArray.length;i++){
                if(intArray[i] == value){
                    return i;
                }else{
                    System.out.println("该元素不存在！");
                }
            }
            return 0;
        }
        //支持跨度寻找,如find(1234,5),即夸过5个索引之后寻找
        public int find(int value,int index) throws Exception {
            if (index>intArray.length-1){
                throw new Exception("已超出数组的长度！");
            }else{
                for(int i=index;i<intArray.length-1;i++){
                    if(intArray[i]==value){
                        return i;
                    }
                }
                System.out.println("不存在该元素！");
            }
            return 0;
        }
        // 实现对数组的遍历功能
        public void circulatory(int[] intArray){

            for(int element:intArray){
                System.out.println(element);

            }
        }

        //实现判断数组是否为空
        public boolean isNull(int[] arr){
            if(intArray.length==0){
                return true;
            }else {
                return false;
            }
        }


    }



}
