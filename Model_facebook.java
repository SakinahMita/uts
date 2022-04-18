package MODEL;

import java.util.Arrays;

public class Model_facebook {
    public String user;
    public String foto;
    public String caption;
    public int like = 0;
    public ArrayList komen = new ArrayList();
    public String link;

    public Model_facebook(){
    }
    public Model_facebook(String userPost, String fotoPost, String captionPost, int likePost,ArrayList komenPost, String linkPost){
        this.user = userPost;
        this.foto = fotoPost;
        this.caption = captionPost;
        this.like = likePost;
        this.komen = komenPost;
        this.link = linkPost;
    }
    public void post(){
        System.out.println();
        System.out.println(this.user);
        System.out.println("-------------------");
        System.out.println(this.foto);
        System.out.println("-------------------");
        System.out.println(this.caption);
        System.out.printf("[1]Like: %d  [2]Comment: %s  [3]Show Comment  [4]Copy Link%n", this.like, this.komen.size());
        System.out.println();
    }
    public void postingan(){
        System.out.println();
        System.out.println(this.user);
        System.out.println("-------------------");
        System.out.println(this.foto);
        System.out.println("-------------------");
        System.out.println(this.caption);
        for (String s : Arrays.asList("[1]Like: " + this.like + "  [2]Comment: " + this.komen.size() + "  [3]Show Comment" + "  [4]Copy Link", "[0]Pilih Postingan Lain")) {
            System.out.println(s);
        }
        System.out.println();
    }
    public int likes(int suka){
        like = like + 1;
        return like;
    }

    public ArrayList Comments(String komentar){
        for (int i = 0; i < 1; i++){
            komen.equals(komentar);
        }
        return komen;
    }

    public void showComment(){
        for (int i = 0; i < komen.size(); i++) {
            System.out.println(komen.equals(i));
        }
    }

}
