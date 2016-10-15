/**
 * Java 绘图 
 *
 *
 */
package com.test1;
import javax.swing.*;
import java.awt.*;

public class Demo9_1 extends JFrame
{
    MyPanel mp = null;
    public static void main(String[] args)
    {
	Demo9_1 demo9_1 = new Demo9_1();
    }

    public Demo9_1()
    {
	mp = new MyPanel();
	this.add(mp);

	this.setSize(400, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
    }
}
	
class MyPanel extends Jpanel
{
    //覆盖JPanel 的paint方法
    public void paint(Graphics g)
    {
	super.paint(g);//调用父类完成初始化
	g.drawOval(10, 10, 30, 30);
    }
}
