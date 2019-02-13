package com.qqchatclient.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

/**
 * 功能：聊天登录
 * @author pdhai
 *
 */

public class ClientLogin extends JFrame{
	//定义北部组件
	JLabel jbl1;
	
	//定义中部组件
	JTabbedPane jtp1;
	JPanel jp2,jp3,jp4;
	JLabel jp2_jbl1,jp2_jbl2,jp2_jbl3,jp2_jbl4;
	JButton jp2_jb1;
	JCheckBox jp2_jcb1,jp2_jcb2;
	JTextField jp2_jtf1;
	JPasswordField jp2_jpf1;
	
	//定义南部组件
	JPanel jp1;
	JButton jp1_jb1,jp1_jb2,jp1_jb3;	

	public ClientLogin() {
		//创建和添加北部组件
		jbl1=new JLabel(new ImageIcon("images/tou.gif"));//标签主要用于展示 文本 或 图片
		this.add(jbl1,"North");//添加到框窗容器中
		
		//创建和添加中部组件
		jtp1=new JTabbedPane();
		jp2=new JPanel(new GridLayout(3,3));//网格布局
		jp3=new JPanel(new GridLayout(3,3));
		jp4=new JPanel(new GridLayout(3,3));
		jp2_jbl1=new JLabel("QQ号码",JLabel.CENTER);//标签居中显示
		jp2_jbl2=new JLabel("QQ密码",JLabel.CENTER);
		jp2_jbl3=new JLabel("忘记密码",JLabel.CENTER);
		jp2_jbl3.setForeground(Color.blue);//设置标签的前景色
		jp2_jbl4=new JLabel("申请密码保护",JLabel.CENTER);
		jp2_jb1=new JButton(new ImageIcon("images/clear.gif"));
		jp2_jcb1=new JCheckBox("隐身登录");
		jp2_jcb2=new JCheckBox("记住密码");
		jp2_jtf1=new JTextField();
		jp2_jpf1=new JPasswordField();
		jp2.add(jp2_jbl1,"Center");jp2.add(jp2_jtf1);jp2.add(jp2_jb1);//按顺序添加组件
		jp2.add(jp2_jbl2);jp2.add(jp2_jpf1);jp2.add(jp2_jbl3);
		jp2.add(jp2_jcb1);jp2.add(jp2_jcb2);jp2.add(jp2_jbl4);
		jtp1.add(jp2,"QQ号码");jtp1.add(jp3,"手机号码");jtp1.add(jp4,"电子邮箱");
		this.add(jtp1,"Center");//添加到框窗的中部		
		
		//创建和添加南部组件
		jp1=new JPanel();//默认流式布局，可省略new FlowLayout()
		jp1_jb1=new JButton(new ImageIcon("images/denglu.gif"));
		jp1_jb2=new JButton(new ImageIcon("images/zhuce.gif"));
		jp1_jb3=new JButton(new ImageIcon("images/quxiao.gif"));
		jp1.add(jp1_jb1);
		jp1.add(jp1_jb2);
		jp1.add(jp1_jb3);
		this.add(jp1,"South");		
		
		this.setSize(350,240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//当点击窗口的关闭按钮时退出程序（没有这一句，程序不会退出）
		this.setLocationRelativeTo(null);//窗口居中显示，没有相对位置关系的窗体
		this.setVisible(true);
	}
	public static void main(String[] args) {
		ClientLogin cl1=new ClientLogin();
	}
}
