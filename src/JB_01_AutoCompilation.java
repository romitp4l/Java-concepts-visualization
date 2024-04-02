
import network.fiveG.DemoSubPackage2;
import network.fiveG.SubPackageDemo;

public class JB_01_AutoCompilation

    // This is the example of the auto class loading in java language
{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.printMessage();

    }



//    SubPackageDemo objTEst = new SubPackageDemo();
//
//    public SubPackageDemo getObjTEst() {
//        return objTEst;
//    }

    public DemoSubPackage2 getObj2() {
        return obj2;
    }

    DemoSubPackage2 obj2 = new DemoSubPackage2();

}


