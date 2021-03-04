public class synchronizedTest {

    Object object = new Object();

    public synchronized void test() {
        object = "hello";
        System.out.println(object);
    }


}
