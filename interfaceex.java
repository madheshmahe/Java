interface camera {
    void clickphoto();
}

interface musicplayer {
    void playmusic();
}

class phone implements camera, musicplayer {
    public void clickphoto() {
        System.out.println("photo taken from");
    }

    public void playmusic() {
        System.out.println("music playing");
    }
}

public class interfaceex {
    public static void main(String[] args) {
        phone p = new phone();
        p.clickphoto();
        p.playmusic();
    }

}
