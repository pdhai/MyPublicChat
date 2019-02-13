package com.qqchatclient.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

/**
 * ���ܣ������¼
 * @author pdhai
 *
 */

public class ClientLogin extends JFrame{
	//���山�����
	JLabel jbl1;
	
	//�����в����
	JTabbedPane jtp1;
	JPanel jp2,jp3,jp4;
	JLabel jp2_jbl1,jp2_jbl2,jp2_jbl3,jp2_jbl4;
	JButton jp2_jb1;
	JCheckBox jp2_jcb1,jp2_jcb2;
	JTextField jp2_jtf1;
	JPasswordField jp2_jpf1;
	
	//�����ϲ����
	JPanel jp1;
	JButton jp1_jb1,jp1_jb2,jp1_jb3;	

	public ClientLogin() {
		//��������ӱ������
		jbl1=new JLabel(new ImageIcon("images/tou.gif"));//��ǩ��Ҫ����չʾ �ı� �� ͼƬ
		this.add(jbl1,"North");//��ӵ���������
		
		//����������в����
		jtp1=new JTabbedPane();
		jp2=new JPanel(new GridLayout(3,3));//���񲼾�
		jp3=new JPanel(new GridLayout(3,3));
		jp4=new JPanel(new GridLayout(3,3));
		jp2_jbl1=new JLabel("QQ����",JLabel.CENTER);//��ǩ������ʾ
		jp2_jbl2=new JLabel("QQ����",JLabel.CENTER);
		jp2_jbl3=new JLabel("��������",JLabel.CENTER);
		jp2_jbl3.setForeground(Color.blue);//���ñ�ǩ��ǰ��ɫ
		jp2_jbl4=new JLabel("�������뱣��",JLabel.CENTER);
		jp2_jb1=new JButton(new ImageIcon("images/clear.gif"));
		jp2_jcb1=new JCheckBox("�����¼");
		jp2_jcb2=new JCheckBox("��ס����");
		jp2_jtf1=new JTextField();
		jp2_jpf1=new JPasswordField();
		jp2.add(jp2_jbl1,"Center");jp2.add(jp2_jtf1);jp2.add(jp2_jb1);//��˳��������
		jp2.add(jp2_jbl2);jp2.add(jp2_jpf1);jp2.add(jp2_jbl3);
		jp2.add(jp2_jcb1);jp2.add(jp2_jcb2);jp2.add(jp2_jbl4);
		jtp1.add(jp2,"QQ����");jtp1.add(jp3,"�ֻ�����");jtp1.add(jp4,"��������");
		this.add(jtp1,"Center");//��ӵ��򴰵��в�		
		
		//����������ϲ����
		jp1=new JPanel();//Ĭ����ʽ���֣���ʡ��new FlowLayout()
		jp1_jb1=new JButton(new ImageIcon("images/denglu.gif"));
		jp1_jb2=new JButton(new ImageIcon("images/zhuce.gif"));
		jp1_jb3=new JButton(new ImageIcon("images/quxiao.gif"));
		jp1.add(jp1_jb1);
		jp1.add(jp1_jb2);
		jp1.add(jp1_jb3);
		this.add(jp1,"South");		
		
		this.setSize(350,240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//��������ڵĹرհ�ťʱ�˳�����û����һ�䣬���򲻻��˳���
		this.setLocationRelativeTo(null);//���ھ�����ʾ��û�����λ�ù�ϵ�Ĵ���
		this.setVisible(true);
	}
	public static void main(String[] args) {
		ClientLogin cl1=new ClientLogin();
	}
}
