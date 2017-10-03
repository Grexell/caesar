public class Caesar {

    private int length;

    public Caesar(int length) {
        this.length = length;
    }

    public int encript(int t, int a, int b) {

        int result;

        result = (t * a + b) % length;

        return result;

    }
}
