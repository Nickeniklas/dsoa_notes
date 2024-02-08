public class BigO {

    public BigO() {
        int[] data = new int[100];

        //  O(n)
        System.out.printf("Datapunkter: %d\n",
                data.length
        );

        int ops = 0;
        for (int i = 0; i < data.length; i++) {
            ops++;
        }
        System.out.printf("Operationer: %d\n",
                ops
        );


        //  0(n^2)
        ops = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                ops++;
            }
        }
        System.out.printf("O(n^2) operationer: %d\n",
                ops
        );

        //  O(log n)
        ops = 0;
        int len = data.length;
        while(len > 0) {
            len = len/2;
            ops++;
        }
        System.out.printf("O(log n) operationer: %d\n",
                ops
        );
    }



}
