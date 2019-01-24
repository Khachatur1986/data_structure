package encapsulation;

import encapsulation.first.A;
import encapsulation.first.B;
import encapsulation.second.C;

/**
 * Created by Khach on 24-Jan-19.
 */
public class Test {
    public static void main(String[] args) {

        //when extending B class from A we can declare same name of variables from parent and override methods, but
        // overriding methods change its variable value,
/*        A a = new B();
        System.out.println(a.i); //calls from A class variable
        a.addI();  //calls from B class method
        System.out.println(a.i); //print A class variable
        System.out.println(a.getI()); // print B class variable*/
/*
"C:\Program Files\Java\jdk1.8.0_77\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.1.2\lib\idea_rt.jar=5589:C:\Program Files\JetBrains\IntelliJ IDEA 2017.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_77\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\rt.jar;C:\Users\Khach\IdeaProjects\data_structure\out\production\data_structure" encapsulation.Test
        5
        5
        1030

        Process finished with exit code 0
        */


        //for initializing private statik variable using constructor
//        C c = new C(15);
//        System.out.println(c.getTest());
//        C t = new C( 60);
//        System.out.println(t.getTest());
//        System.out.println(c.getTest());

        /*
        "C:\Program Files\Java\jdk1.8.0_77\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.1.2\lib\idea_rt.jar=5595:C:\Program Files\JetBrains\IntelliJ IDEA 2017.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_77\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_77\jre\lib\rt.jar;C:\Users\Khach\IdeaProjects\data_structure\out\production\data_structure" encapsulation.Test
        15
        60
        60

        Process finished with exit code 0
        */
    }
}
