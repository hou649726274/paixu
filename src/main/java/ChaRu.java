public class ChaRu {
    public static void main(String[] args) {
        //插入排序：每次拿后面的值与所有前面的值进行比较。被比较大的位移+1，直到比较到比自己小的，就不再比较了，然后自己就放进去。
        //假设第一个数最小，从第下标1到9，每次下标循环都与前面的数据进行比较，如果后面的数据小于前面的数据，前面的数据进行位移操作。一旦后面的数据大于前面的数据，跳出比较，进行数组的插入。
        int[] arr = {11,3,8,5,2,6,12,7,1,2};
        ChaRu chaRu = new ChaRu();
        chaRu.test(arr);
//        int i, j;
//        int n = arr.length;
//        int target;
//        for(i=1;i<n;i++){
//            target = arr[i];
//            for(j=i-1; j>=0 ;j--){
//                if(arr[j]>target){
//                    arr[j+1]=arr[j];
//                }else{
//                    break;
//                }
//            }
//            arr[j+1]=target;
//        }

        for(int k : arr){
            System.out.println(k);
        }
    }


    void test(int[] arr){
        for(int i=1;i<arr.length;i++){
            int minTmp = arr[i];
            int index = i;
            for(int j=i;j>0;j--){
                if(minTmp<arr[j-1]){
                    arr[j]=arr[j-1];
                    index = j-1;
                }else{
                    break;
                }
            }
            arr[index] = minTmp;
        }
    }
}