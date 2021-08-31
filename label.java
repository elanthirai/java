public class label{
    public static void main(String[] args) {
        int x,y,z;
        for (x=2;x<20;x++) {
            z=0;
            for(y=2;y<x;y++)
            {
                if(x%y==0)
                    z=1;
                break;
            }
            if (z==0)
                System.out.println(x);
        }

    }
}