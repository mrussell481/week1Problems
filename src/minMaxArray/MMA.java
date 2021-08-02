package minMaxArray;

public class MMA {

    int[] minMax(int[] arr){
        int x = 0;
        int y = 1000000;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<y){
                y=arr[i];
            }
        }

        return new int[]{x, y};
    }

    public static void main(String[] args){
        int[] testInt = {1,3,6,4,12,8};
        MMA minMax = new MMA();
        System.out.println("The largest integer is "+minMax.minMax(testInt)[0]+" and the smallest is "
                +minMax.minMax(testInt)[1]);
    }
}
