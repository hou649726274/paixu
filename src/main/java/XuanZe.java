public class XuanZe {

    public static void main(String[] args) {
        //原理：双层遍历，每次拿循环的第一个数和其余的数进行比较，获取最小的数再和第一个数进行位置互换。再遍历循环+1的数与后面的数比较。
        //选择排序：每次拿第一个值去与后面最小值进行比较，再互换位置，迭代加一。
        int[] shuZu = {11,9,8,11,12,13};
//        int temp,minIndex;
//        for(int i=0; i<shuZu.length-1 ; i++){
//            minIndex = i;
//            for(int j= i+1; j <shuZu.length-1;j++){
//                if(shuZu[j] < shuZu[minIndex]){
//                    minIndex = j;
//                }
//            }
//            if(minIndex != i ){
//                temp = shuZu[minIndex];
//                shuZu[minIndex] = shuZu[i];
//                shuZu[i] = temp;
//            }
//        }
        XuanZe xuanZe = new XuanZe();
        xuanZe.test(shuZu);
        for(int i : shuZu){
            System.out.println(i);
        }
    }

    void test(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int tmp = arr[i];
                arr[i]= arr[minIndex];
                arr[minIndex]= tmp;
            }
        }
    }
}
