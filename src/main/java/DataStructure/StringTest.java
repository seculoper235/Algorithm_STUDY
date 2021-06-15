package DataStructure;

public class StringTest {
    // 올바른 괄호 체크
    public static boolean correct(String s) {
        while(true) {
            if(s.contains("()")) {
                s.replace("()", " ");
            }
            else if(s.contains("{}")) {
                s.replace("{}", " ");
            }
            else if(s.contains("[]")) {
                s.replace("[]", " ");
            }
            else {
                break;
            }
        }

        if(s.isEmpty())
            return true;

        return false;
    }

    public static void main(String[] args) {
        String test = "[](){}";
        //boolean flag = correct(test);
        //System.out.println(flag);
        if(test.contains("()")) {
            test = test.replace("()", "");
            System.out.println("test = " + test);
            System.out.println("()");
        }
        System.out.println("{}");
    }
}
