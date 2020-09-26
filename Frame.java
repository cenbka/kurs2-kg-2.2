package com.company;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() throws HeadlessException {
        DrawPanel dp = new DrawPanel();
        this.add (dp);
    }

}
