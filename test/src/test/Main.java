package test;

class BC {
    public void Print() {
        System.out.println("Base");
    }         
}

class DC extends BC {    
    public void Print() {
        System.out.println("Derived");
    }
}

class Main{
    public static void DoPrint( BC o ) {
        o.Print();   
    }
    public static void main(String[] args) {
    BC x = new BC();
    BC y= new DC();
    DC z= new DC();
    DoPrint(x);
    DoPrint(y);
    DoPrint(z);
    }
}