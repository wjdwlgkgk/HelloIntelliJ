import org.apache.commons.lang.StringUtils;

public class HelloIntelliJ {
    public static void main(String args[]){
        String name = null;

        System.out.println(StringUtils.isEmpty(name));


        String one1 = "one";
        String one2 = new String("one");
        String one3 = "one";

        if(one1.equals(one2) )
            System.out.println("1과2는 같다.");
        else
            System.out.println("1과2는 다르다.");
        if(one1.equals(one3))
            System.out.println("1과3는 같다.");
        else
            System.out.println("1과3는 다르다.");



        //System.out.println("HelloIntelliJ !!!");
    //System.out.println("args[0] = " + args[0]);
    }
}
