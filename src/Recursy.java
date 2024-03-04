public class Recursy {

    // RE-eeeee
    static void loop (int i, int max) {
        //  base
        if (i > max) return;
        // recursion
        System.out.print(i + " ");
        loop(i+1, max);



    }
}
