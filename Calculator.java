import javax.swing.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener
{
static double a=0,b=0,result=0;
static int operator=0;

JTextField tf;
JButton b1, b2, b3,b4,b5,b6,b7,b8,b9,b0,bplus,bminus,bmul,bdiv,beq,bper,bdot,bclr,bdel;
 Calculator()
  {

  tf = new JTextField(); 
  b1=new JButton("1");
  b2=new JButton("2");
  b3=new JButton("3");
  b4=new JButton("4");
  b5=new JButton("5");
  b6=new JButton("6");
  b7=new JButton("7");
  b8=new JButton("8");
  b9=new JButton("9");
  b0=new JButton("0");
  bplus=new JButton("+");
  bminus=new JButton("-");
  bmul=new JButton("*");
  bdiv=new JButton("/");
  bper=new JButton("%");
  beq=new JButton("=");
  bdot=new JButton(".");
  bclr=new JButton("C");
  bdel=new JButton("Del");

 tf.setBounds(10,10,300,50);
 b1.setBounds(10,180,60,40);
 b2.setBounds(80,180,60,40);
 b3.setBounds(150,180,60,40);
 b4.setBounds(10,130,60,40);
 b5.setBounds(80,130,60,40);
 b6.setBounds(150,130,60,40);
 b7.setBounds(10,80,60,40);
 b8.setBounds(80,80,60,40);
 b9.setBounds(150,80,60,40);
 b0.setBounds(10,230,130,40);
 bplus.setBounds(220,230,60,40);
 bminus.setBounds(220,180,60,40);
 bclr.setBounds(290,80,60,40);
 bmul.setBounds(290,180,60,40);
 bdiv.setBounds(220,130,60,40);
 bper.setBounds(220,80,60,40);
 bdel.setBounds(290,130,60,40);
 beq.setBounds(290,230,60,40);
 bdot.setBounds(150,230,60,40);

 add(tf);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 add(b5);
 add(b6);
 add(b7);
 add(b8);
 add(b9);
 add(b0);
 add(bplus);
 add(bminus);
 add(bmul);
 add(bdiv);
 add(bper);
 add(beq);
 add(bdot);
 add(bclr);
 add(bdel);

 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
 b6.addActionListener(this);
 b7.addActionListener(this);
 b8.addActionListener(this);
 b9.addActionListener(this);
 b0.addActionListener(this);
 bdot.addActionListener(this);
 bplus.addActionListener(this);
 bminus.addActionListener(this);
 bmul.addActionListener(this);
 bdiv.addActionListener(this);
 beq.addActionListener(this);


 setLocation(300,200);
 setSize(400,350);

 setTitle("Calculator");
 setLayout(null);

 setVisible(true);

 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
tf.setText(tf.getText().concat("1"));
}
if(e.getSource()==b2)
{
tf.setText(tf.getText().concat("2"));
}
if(e.getSource()==b3)
{
tf.setText(tf.getText().concat("3"));
}
if(e.getSource()==b4)
{
tf.setText(tf.getText().concat("4"));
}

if(e.getSource()==b5)
{
tf.setText(tf.getText().concat("5"));
}

if(e.getSource()==b6)
{
tf.setText(tf.getText().concat("6"));
}

if(e.getSource()==b7)
{
tf.setText(tf.getText().concat("7"));
}

if(e.getSource()==b8)
{
tf.setText(tf.getText().concat("8"));
}

if(e.getSource()==b9)
{
tf.setText(tf.getText().concat("9"));
}

if(e.getSource()==b0)
{
tf.setText(tf.getText().concat("0"));
}

if(e.getSource()==bdot)
{
tf.setText(tf.getText().concat("."));
}
if(e.getSource()==bplus)
{
a=Double.parseDouble(tf.getText());
operator=1;
tf.setText("");
}
if(e.getSource()==bminus)
{
a=Double.parseDouble(tf.getText());
operator=2;
tf.setText("");
}
if(e.getSource()==bmul)
{
a=Double.parseDouble(tf.getText());
operator=3;
tf.setText("");
}
if(e.getSource()==bdiv)
{
a=Double.parseDouble(tf.getText());
operator=4;
tf.setText("");
}
if(e.getSource()==beq)
{
b=Double.parseDouble(tf.getText());
switch(operator)
{
case 1:
{
result=a+b;
break;
}
case 2:
{
result=a-b;
break;
}
case 3:
{
result=a*b;
break;
}
case 4:
{
result=a/b;
break;
}
default:
result=0;
}
tf.setText(""+result);
}
}
public static void main(String args[])
 {
 new Calculator();
 }

}