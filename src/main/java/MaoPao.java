public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {2,11,2,1,53,23,44};
        MaoPao maoPao = new MaoPao();
        maoPao.test(arr);

    }
    void test(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if((arr[arr.length-j]<arr[arr.length-j-1])){
                    int tmp = arr[arr.length-j-1] ;
                    arr[arr.length-j-1] = arr[arr.length-j];
                    arr[arr.length-j] = tmp;
                }
            }
        }
    }
}
