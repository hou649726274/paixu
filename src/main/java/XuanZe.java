public class XuanZe {

    public static void main(String[] args) {
        //原理：双层遍历，每次拿循环的第一个数和其余的数进行比较，获取最小的数再和第一个数进行位置互换。再遍历循环+1的数与后面的数比较。
        int[] shuZu = {11,9,8,11,12,13};
        int temp,index;
        for(int i=0; i<shuZu.length-1 ; i++){
            index = i;
            for(int j= i+1; j <shuZu.length-1;j++){
                if(shuZu[j] < shuZu[index]){
                    index = j;
                }
            }
            if(index != i ){
                temp = shuZu[index];
                shuZu[index] = shuZu[i];
                shuZu[i] = temp;
            }
        }
        for(int i : shuZu){
            System.out.println(i);
        }
    }
}
