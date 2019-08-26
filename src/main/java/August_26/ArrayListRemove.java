package August_26;

/**
 * @author yanlianglong
 * @Title: ArraryListRemove.java
 * @Package August_26
 * @Description:
 * @date 2019/8/26 10:13
 */

import java.util.ArrayList;
import java.util.List;

/**
 * A、2,4,1,3,5
 * B、2,1,3,5
 * C、4,1,3,5
 * D、1,3,5
 */
public class ArrayListRemove {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(1);
        a.add(3);
        a.add(5);
        for (int i = 0; i < a.size(); i++) {
            int v = a.get(i);
            if (v % 2 == 0) {
                a.remove(i);
            }
        }
        System.out.println(a.toString());
    }
}
    /*
    public E remove(int index) {
      // 先检查下标索引是是否越界
      rangeCheck(index);
      // ArrayList的修改次数加1
      modCount++;
      // 获取索引对应的元素值
      E oldValue = elementData(index);
      // 获取删除元素后，需要移动的元素的个数
      int numMoved = size - index - 1;
      if (numMoved > 0)
          // 将元素进行移动拷贝
          System.arraycopy(elementData, index+1, elementData, index,
                             numMoved);
      // 最后将多出的位置设置为空，这样说明是没有引用的对象了
      elementData[--size] = null; // Let gc do its work
      // 返回删除的旧值
      return oldValue;
      }
        第一次remove后,list为4,1,3,5,但是i变成了1,第二次循环取得值为list中的1,跳过了4,所以答案选C
     */
