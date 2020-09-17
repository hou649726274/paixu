public class ChaRu {
    public static void main(String[] args) {
        //假设第一个数最小，从第下标1到9，每次下标循环都与前面的数据进行比较，如果后面的数据小于前面的数据，前面的数据进行位移操作。一旦后面的数据大于前面的数据，跳出比较，进行数组的插入。
        int[] arr = {11,3,8,5,2,6,12,7,1,2};
        int i, j;
        int n = arr.length;
        int target;
        for(i=1;i<n;i++){
            target = arr[i];
            for(j=i-1; j>=0 ;j--){
                if(arr[j]>target){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=target;
        }

        for(int k : arr){
            System.out.println(k);
        }
    }
}