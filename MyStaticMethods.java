public class MyStaticMethods{
    public static int quadrant (double x, double y){
        if(x==0||y==0){
            return 0;
        }

        if(x>0){
            if(y>0){
                return 1;
            }
            if(y<0){
                return 4;
            }
        }

        if(x<0){
            if(y>0){
                return 2;
            }
            if(y<0){
                return 3;
            }
        }

        return -1;
    }

    public static boolean isVowel(String input){
        if (input=="a"||input=="o"||input=="u"||input=="i"||input=="e"){
            return true;
        }
        else{
            return false;
        }
    }
}