public class StockMoney {

    public static void main(String[] args) {
        //面试题，股票交易，已知所有的价格和顺序，求最佳的买卖时间能赚多少钱。
        StockMoney stockMoney = new StockMoney();
        int[] stockList = {3,0,2,12,2,5,6,7,5,3,2,1,2,16,1,55,13};
//        System.out.println(stockMoney.test2(stockList));
        System.out.println(stockMoney.test3(stockList));
    }

    int test2(int[] arr){
        //目标是要最后一位减前一位
        int max = arr[arr.length-1] - arr[0];
        int maxIndex = arr.length-1;
        int minIndex = 0;
        for(int i = 0; i<arr.length-1;i++){
            int endInt = arr[arr.length-1-i];
            for(int j =i ;j<arr.length-1;j++){
                if((endInt - arr[arr.length-1-j-1])>max){
                    max = endInt - arr[arr.length-1-j-1];
                    maxIndex = arr.length-1-i;
                    minIndex = arr.length-1-j-1;
                }
            }
        }
        System.out.println(maxIndex+";"+minIndex);
        return max;
    }

    int test3(int[] arr){
        //目标是要最后一位减前一位
        int max = arr[arr.length-1] - arr[0];
        int maxIndex = arr.length-1;
        int minIndex = 0;
        for(int i = 0; i<arr.length-1;i++){
            int endInt = arr[arr.length-1-i];
            for(int j = i+1 ;j<arr.length-1;j++){
                if((endInt - arr[arr.length-1-j])>max){
                    max = endInt - arr[arr.length-1-j];
                    maxIndex = arr.length-1-i;
                    minIndex = arr.length-1-j;
                }
            }
        }
        System.out.println(maxIndex+";"+minIndex);
        return max;
    }
}
