package com.example.sofa.chatbotplayer.Message;

/**
 * Created by Sofía on 17/06/2017.
 */

public class VentanaChat {
    private boolean image, mine;
    private String content;

    public VentanaChat (String msg, boolean own, boolean img) {
        content = msg;
        image = img;
        mine = own;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isMine() {

        return mine;
    }

    public void setMine(boolean mine) {
        this.mine = mine;
    }

    public boolean isImage() {

        return image;
    }

    public void setImage(boolean image) {
        this.image = image;
    }
}
