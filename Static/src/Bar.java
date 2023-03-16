public class Bar {

    Bar(){
        System.out.println("Objeto Bar foi inicializado (no-args)");
    }
    
}

class Foobar extends Bar{

    Foobar(){
        System.out.println("Objeto Foobar foi inicializado (no-args)");
    }

}

class FoobarJunior extends Foobar{
    
    FoobarJunior(){
        System.out.println("Objeto FoobarJunior foi inicializado (no-args)");
    }

}
