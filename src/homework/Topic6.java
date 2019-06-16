package homework;

import java.util.Arrays;

/**
 * 作业6: 使用数组实现一个栈,元素整型即可
 *
 * 要求:
 *
 * - 实现入栈,enqueue
 *
 * - 实现出栈,dequeue
 *
 * - 实现获取栈顶元素值,getFront
 *
 * - 实现获取栈的大小
 *
 * - 实现判断栈是否为空
 *
 * @author haoc
 */
public class Topic6 {

}

/**
 * 例如
 */
class IntStack {
    private int size;
    private int[] data = new int[10];

    //- 实现入栈,enqueue
    void enqueue(int element) {
        if(size>data.length){
            data= Arrays.copyOf(data, data.length*2);
        }

    }

  /**
   * 这个是取出栈顶元素,栈中就没有这个元素了
   */
    int dequeue() {
    return -1;
  }

  /**
   * 获取栈顶元素,意味着只是读取,这个元素还还会存储在栈中
   */
    int getFront() {
    return -1;
  }

    int length() {
    return -1;
  }

    boolean isEmpty() {
    return false;
  }
}
