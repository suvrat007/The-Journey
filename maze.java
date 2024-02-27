import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
//        System.out.println(maze_LR_list("",3,3));
        boolean[][] restriction={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        maze_LRD_restriction("",restriction.length-1,restriction[0].length-1,restriction);
    }

    static void maze_LR(String p, int r,int c){                               // ONLY LEFT RIGHT MOVEMT
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            maze_LR(p+'D',r-1,c);
        }
        if (c>1){
            maze_LR(p+'R',r,c-1);
        }

    }
    static ArrayList<String> maze_LR_list(String p, int r, int c){                  // RESULT IN ARRAY
        ArrayList<String> arr=new ArrayList<>();
        if(r==1 && c==1){
            arr.add(p);
            return arr;
        }
        ArrayList<String> ans=new ArrayList<>();
        if (r>1){
            ans.addAll(maze_LR_list(p+'D',r-1,c));
        }
        if (c>1){
            ans.addAll(maze_LR_list(p+'R',r,c-1));
        }
        return ans;
    }
    static void maze_LRD(String p, int r,int c){                                    //BOTTOM RIGHT AND DIAGONAL MVMNTS
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            maze_LRD(p+'B',r-1,c);
        }
        if (c>1){
            maze_LRD(p+'R',r,c-1);
        }
        if (r>1&&c>1){
            maze_LRD(p+'D',r-1,c-1);
        }

    }
    static void maze_LRD_restriction(String p, int r,int c,boolean rest[][]){                                    //BOTTOM RIGHT with resrtictions
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(!rest[r][c]){
            return;
        }
        if (r>1){
            maze_LRD_restriction(p+'B',r-1,c,rest);
        }
        if (c>1){
            maze_LRD_restriction(p+'R',r,c-1,rest);
        }
        if (r>1&&c>1){
            maze_LRD_restriction(p+'D',r-1,c-1,rest);
        }

    }


}
