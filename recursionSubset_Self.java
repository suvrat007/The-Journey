import org.w3c.dom.ls.LSOutput;

public class recursionSubset_Self {
    public static void main(String[] args) {
//        System.out.println(skip_apple("bacapplecadah"));
        System.out.println(prmtations("","abcd"));
    }


// 1. SKIP

    static void skip_a(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch=='a'){
            skip_a(p,up.substring(1));
        }else{
            skip_a(p+ch,up.substring(1));
        }

    }

    static String skip_apple(String up){
        if(up.isEmpty()){
            return "";
        }


        if (up.startsWith("apple")){
            return skip_apple(up.substring(5));
        }else{
            return up.charAt(0)+skip_apple(up.substring(1));
        }

    }
    static int prmtations(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return 1;
        }
        int count =0;

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            count=count +prmtations(p.substring(0,i)+ch+p.substring(i,p.length()),up.substring(1));
        }
        return count;
    }
    static void cnt(int n){
        System.out.println(n);
    }




}
