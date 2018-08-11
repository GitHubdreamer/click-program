import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 extends JFrame
{
	int count;		//点击次数变量
	JFrame jf = new JFrame("点击次数统计");	//定义框架以及框架的标题
	JLabel jl = new JLabel("欢迎 过来点击我！！！");	//定义一个初始标签
	private JPanel jp;	//定义一个面板
	private JButton jb;	//定义一个按钮
	public Test2()	//构造函数
	{
		jp = new JPanel();	//实例化对象
		jb = new JButton("+");	//实例并初始化对象
		jb.addActionListener(new ActionHandler());	//在按钮上注册监听器,通过new一个内部类ActionHandler的对象
	}
	
	public void launchFrame()//运行函数
	{
		jf.add(jp);	//将面板加到框架中
		jp.add(jl);	//将标签加到面板中
		jp.add(jb);	//将按钮加到面板中
		jf.setSize(300, 100);	//框架大小
		jf.setLocation(700, 300);	//框架位置
		jf.setVisible(true);	//设置可见
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//设置关闭
	}
	
	public static void main(String[] args)
	{
		Test2 t = new Test2();	//定义一个Test2对象
		t.launchFrame();	//对象t调用运行函数
	}
	
	public class ActionHandler implements ActionListener	//创建内部类ActionHandler用来实现ActionListener接口
	{
		@Override
		public void actionPerformed(ActionEvent e)	//监听器函数
		{
			Object s = e.getSource();	//获取事件源对象s，e为事件(event)
			if(s==jb)//如果触发监听器
			{
				count++;//点击次数加1
			}
			jl.setText("你点击了"+count+"次！");	//触发监听器以后将字符串显示在标签jl上
		}
	}
}

/*package Test;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 implements ActionListener	//实现监听器接口
{
	int count;		//点击次数变量
	JFrame jf = new JFrame("点击次数统计");	//定义框架以及框架的标题
	JLabel jl = new JLabel("欢迎 过来点击我！！！");	//定义一个初始标签
	private JPanel jp;	//定义一个面板
	private JButton jb;	//定义一个按钮
	public Test2()	//构造函数
	{
		jp = new JPanel();	//实例化对象
		jb = new JButton("+");	//实例并初始化对象
		jb.addActionListener(this);	//在按钮上注册监听器
	}
	
	public void launchFrame()//运行函数
	{
		jf.add(jp);	//将面板加到框架中
		jp.add(jl);	//将标签加到面板中
		jp.add(jb);	//将按钮加到面板中
		jf.setSize(300, 100);	//框架大小
		jf.setLocation(700, 300);	//框架位置
		jf.setVisible(true);	//设置可见
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//设置关闭
	}
	
	public static void main(String[] args)
	{
		Test2 t = new Test2();	//定义一个Test2对象
		t.launchFrame();	//对象t调用运行函数
	}
	
	@Override
	public void actionPerformed(ActionEvent e)	//监听器函数
	{
		Object s = e.getSource();	//获得监听器的位置
		if(s==jb)//如果触发监听器
		{
			count++;//点击次数加1
		}
		jl.setText("你点击了"+count+"次！");	//触发监听器以后将字符串显示在标签jl上
	}
}*/
