package wiki;

class Wikiwiki{
    private String contents;
    private int wikinum;
    Wikiwiki(int num, String con){
        contents = con;
        wikinum = num;
    }
    public int getWikinum(){
        return wikinum;
    }
    public String toString(){
        return contents;
    }
}

public class ClassArratWiki {
    public static void main(String[] args){
        Wikiwiki[] wikis = new Wikiwiki[3];
        wikis[0]=new Wikiwiki(12, "Wi");
        wikis[1]=new Wikiwiki(10, "ki");
        wikis[2]=new Wikiwiki(7, "s");
        //enhance for문
        for (Wikiwiki e: wikis){
            if(e.getWikinum()==12)
                System.out.println(e);
        }
    }
}
