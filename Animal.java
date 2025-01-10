class child extends Animal {
    void dog() {
        System.out.println("i am child");
    }

    public static void main(String[] args) {
        Animal obj = new child();
        obj.dog();
    }
}

class Animal {
    void dog() {
        System.out.println("parent class");
    }
}