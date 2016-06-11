 public class TooMuchIf {


       public static void main(String[] args) {

              TooMuchIf tmi = new TooMuchIf();

              System.out.println(tmi.fightMath(3, 3));

              System.out.println(tmi.fightMathArray(3, 3));

       }

       public int fightMath(int one, int two) {

           int result = -1;

           if(one == 0 && two == 0) { result = 0; }

           else if(one == 0 && two == 1) { result = 0; }

           else if(one == 0 && two == 2) { result = 1; }

           else if(one == 0 && two == 3) { result = 2; }

           else if(one == 1 && two == 0) { result = 0; }

           else if(one == 1 && two == 1) { result = 0; }

           else if(one == 1 && two == 2) { result = 2; }

           else if(one == 1 && two == 3) { result = 1; }

           else if(one == 2 && two == 0) { result = 2; }

           else if(one == 2 && two == 1) { result = 1; }

           else if(one == 2 && two == 2) { result = 3; }

           else if(one == 2 && two == 3) { result = 3; }

           else if(one == 3 && two == 0) { result = 1; }

           else if(one == 3 && two == 1) { result = 2; }

           else if(one == 3 && two == 2) { result = 3; }

           else if(one == 3 && two == 3) { result = 3; }


           return result;

       }
      

       public int fightMathArray(int one, int two) {

             
              final int[][] result = new int[][] {{ 0, 0, 1, 2 }, { 0, 0, 2, 1 }, { 2, 1, 3, 3 }, { 1, 2, 3, 3 }};

              return result[one][two];

       }



}

