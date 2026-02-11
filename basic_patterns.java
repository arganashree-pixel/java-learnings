//rectangle
class RectanglePattern{
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Right-angled triangle
class RightTriangle{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Inverted right-angled triangle
class InvertedTriangle{
    public static void main(String[] args){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

