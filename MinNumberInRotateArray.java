package com.niukebiancheng;

/**
*@Description: 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
*@Author： dyy
*/
public class MinNumberInRotateArray {
    public static void main(String[] args) {
        int[] array = new int[]{3,4,5,1,2};
        System.out.println(minNumberInRotateArray(array));
    }
    //旋转数组中最小的数字
    public static int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        //最下元素的位置
        int lowIndex = 0;
        //最大元素的位置
        int highIndex = array.length-1;
        //进行二分查找
        while (lowIndex<highIndex){
            //取得中间元素的位置
            int midIndex = lowIndex+(highIndex-lowIndex)/2;
            //当中间值 小于 下标最大元素时，说明midIndex和highIndex中间的值都为旋转部分，所以最小值应该在midIndex前面
            if(array[midIndex]<array[highIndex]){
                highIndex = midIndex;
            }
            //中间值 大于 小标最大的元素值时，说明是将midIndex前的部分旋转到后面
            else if(array[midIndex]>array[highIndex]){
                lowIndex = midIndex+1;
            }
            //中间值 等于 小标最大的元素值时，说明存在相同的值，则应该将highIndex的值-1进行下一次比较
            else{
                highIndex = highIndex - 1;
            }
        }
        return array[lowIndex];
    }
}
