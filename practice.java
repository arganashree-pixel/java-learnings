class gana{
    public static void main(String[] args){
        //print the first element
        int[] num = {10,20,30,40,50};
        {
            System.out.println(num[0]);
        }
    }
}

class demo{
    public static void main(String[] args){
        int[][] num = {{10,20},{30,40}};
        System.out.println(num[1][1]);
    }
}

class demo1{
    public static void main(String[] args){
       // String[] playlists = {"song1","song2","song3"}
        String[] playlists1 = new String[3];
        playlists1[0] = "song1";
        System.out.println(playlists1[0]);
        playlists1[1] = "song2";
        System.out.println(playlists1[1]);
    }
}

//find the max of array = {10,30,60,80}
class ArrayMax{
    public static void main(String[] args){
        int[] arr = {10,30,60,80};
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<max){
                max = arr[i];
            }
        }
        System.out.println("max:"+max);
    }
}