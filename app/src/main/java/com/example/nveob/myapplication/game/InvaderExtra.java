package com.example.nveob.myapplication.game;

import android.content.Context;

public class InvaderExtra extends Invader {

    public InvaderExtra(Context context, int x, int y, int screenY, int screenX) {
        super(context, x, y, screenY, screenX);
    }

    @Override
    public boolean update(long fps, int screenX) {
         super.update(fps, screenX);

        return this.getX()>=screenX;

    }
}
