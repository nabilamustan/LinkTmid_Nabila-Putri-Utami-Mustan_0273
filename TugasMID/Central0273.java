// Nabila Putri Utami Mustan , 13020210273
package central0273;
interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0273 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0273 obj = new Central0273();
        System.out.println("main");
        obj.aaa();
    }
}