package mypackage;
//cat class
public class HelloWorld6_3 extends HelloWorld6_1 {

    public void feed(String feed) {
        System.out.println("I like: " + feed);
    }

    @Override //переопределение метода через аннотацию Override
    public void sound() {
        System.out.println("Няв-няв");
    }
}
