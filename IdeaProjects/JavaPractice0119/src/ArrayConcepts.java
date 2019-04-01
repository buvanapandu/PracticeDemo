public class ArrayConcepts {

    public static void main(String[] args) {
        int i[] = new int[4];

        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;

        System.out.println(i[3]);
        //System.out.println(i[4]); // ArrayIndexOutOfBoundException error i vl get

        int l = i.length;
        System.out.println(l);

        for(int j=0; j<i.length;j++){
            System.out.println(i[j]);
        }
    }
}
