import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener
{   
	// 1) los componentes de la interfase
    JPanel panel1,panel2,panel3, panel4;
	JTextField pantalla;
	JButton boton0,botonPunto,jButton30,jButton31,boton1,boton3,boton2,jButton26,jButton25,jButton27,jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9,boton7,boton8,boton9,jButton13,jButton14,jButton15,boton4,boton5,boton6,jButton19,jButton20,jButton21;
	Operaciones funcion;
	double x=0,y=0,z=0,resultado=0;
	
// 2. El constructor
	public Calculadora()
    { 
		super("Mario Molinar      Luis Mora        Martin Guzman");
		Container contenedor = getContentPane();
		contenedor.setLayout(new GridLayout(5,1));
	
	//Creacion de un producto de la clase operaciones
	funcion = new Operaciones("funciones");
	
	
	
	
	//los botones
	
	jButton1=new JButton("C");
	jButton1.setBackground(java.awt.Color.lightGray);
	jButton2=new JButton("CE");
	jButton2.setBackground(java.awt.Color.lightGray);	
    jButton3=new JButton("1/x");
    jButton4=new JButton("Sen(x)");
    jButton5=new JButton("Cos(x)");
    jButton6=new JButton("Tan(x)");
    jButton7=new JButton("%");
    jButton8=new JButton("Logx");
    jButton9=new JButton("Log10");
    boton7=new JButton("7");
    boton8=new JButton("8");
    boton9=new JButton("9");
    jButton13=new JButton("+");
    jButton14=new JButton("10^x");
    jButton15=new JButton("e^x");
    boton4=new JButton("4");
    boton5=new JButton("5");
    boton6=new JButton("6");
    jButton19=new JButton("-");
    jButton20=new JButton("sqrt");
    jButton21=new JButton("3sqrt");
    boton1=new JButton("1");
    boton2=new JButton("2");
    boton3=new JButton("3");
    jButton25=new JButton("x");
	jButton26=new JButton("x^2");
	jButton27=new JButton("x^n");
    boton0=new JButton("0");
	botonPunto=new JButton(".");
	jButton30=new JButton("/");
	jButton31=new JButton("=");
	jButton31.setBackground(java.awt.Color.gray);
	
	//ActionListeners de los botones
	jButton1.addActionListener(this);
	jButton2.addActionListener(this);
	jButton3.addActionListener(this);
	jButton4.addActionListener(this);
	jButton5.addActionListener(this);
	jButton6.addActionListener(this);
	jButton7.addActionListener(this);
	jButton8.addActionListener(this);
	jButton9.addActionListener(this);
	boton7.addActionListener(this);
	boton8.addActionListener(this);
	boton9.addActionListener(this);
	jButton13.addActionListener(this);
	jButton14.addActionListener(this);
	jButton15.addActionListener(this);
	boton4.addActionListener(this);
	boton5.addActionListener(this);
	boton6.addActionListener(this);
	jButton19.addActionListener(this);
	jButton20.addActionListener(this);
	jButton21.addActionListener(this);
	boton1.addActionListener(this);
	boton2.addActionListener(this);
	boton3.addActionListener(this);
	jButton25.addActionListener(this);
	jButton26.addActionListener(this);
	jButton27.addActionListener(this);
	boton0.addActionListener(this);
	botonPunto.addActionListener(this);
	jButton30.addActionListener(this);
	jButton31.addActionListener(this);
	
	pantalla = new JTextField();//Creacion de un objeto de la clase jtextfield
	pantalla.setEditable(false);
	pantalla.addActionListener(this);
	
	       // El panel de botones
	   panel1 = new JPanel(new GridLayout(1,2));
       panel1.add(jButton1);
	   panel1.add(jButton2);

	   panel2 = new JPanel(new GridLayout(1,5));
	   panel2.add(jButton3);
	   panel2.add(jButton4);
	   panel2.add(jButton5);
	   panel2.add(jButton6);
	   panel2.add(jButton7);
	   
	   panel3 = new JPanel(new GridLayout(2,6));
	   panel3.add(jButton8);
	   panel3.add(jButton9);
	   panel3.add(boton7);
	   panel3.add(boton8);
	   panel3.add(boton9);	   
	   panel3.add(jButton13);
	   panel3.add(jButton14);
	   panel3.add(jButton15);	 	   
	   panel3.add(boton4);
	   panel3.add(boton5);
	   panel3.add(boton6);	 	   
	   panel3.add(jButton19);

	   panel4 = new JPanel(new GridLayout(2,6));	   
	   
	   panel4.add(jButton20);
	   panel4.add(jButton21);	 
	   panel4.add(boton1);
	   panel4.add(boton2);
	   panel4.add(boton3);
	   panel4.add(jButton25);	   
	   panel4.add(jButton26);
	   panel4.add(jButton27);	 
	   panel4.add(boton0);
	   panel4.add(botonPunto);	   
	   panel4.add(jButton30);
	   panel4.add(jButton31);	 
	 
	 
	 //los componentes del contenedor
	 contenedor.add(pantalla); 
	 contenedor.add(panel1);
	 contenedor.add(panel2);
	 contenedor.add(panel3);
	 contenedor.add(panel4);	 

	 
	 setSize(500,570);  // Definir el tamaño del Frame
	 setResizable(false);
     setVisible(true); // Hacer visible el Frame
	 setLocationRelativeTo(null);//poner en medio de la pantalla el frame

	 }//fin del constructotr
	 
	 
	  public static void main (String Arg[])//el metodo main
	 {
		Calculadora mora =new Calculadora ();//creando un objeto de la clase Calculadora
		mora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}//fin del void
		
	 public void actionPerformed (ActionEvent e)//el metodo actionPerformed
	{
	
	double resultado = 0;
	
				if(e.getSource()==jButton1)
		{
			resultado=0;
			x=0;
			y=0;
			botonPunto.setEnabled(true);
			pantalla.setText("");	
		}
		else
		if (e.getSource()==jButton2)
		{
			pantalla.setText("");	
			botonPunto.setEnabled(true);
		}
		else
		
		if(e.getSource() == boton2)
		pantalla.setText(pantalla.getText()+"2");
		
		else if (e.getSource()==boton3)
		pantalla.setText(pantalla.getText()+"3");
		else if (e.getSource()==boton1)
		pantalla.setText(pantalla.getText()+"1");
		else if (e.getSource()==boton4)
		pantalla.setText(pantalla.getText()+"4");
		else if (e.getSource()==boton5)
		pantalla.setText(pantalla.getText()+"5");
		else if (e.getSource()==boton6)
		pantalla.setText(pantalla.getText()+"6");
		else if (e.getSource()==boton7)
		pantalla.setText(pantalla.getText()+"7");
		else if(e.getSource()==boton8)
		pantalla.setText(pantalla.getText()+"8");
		else if(e.getSource()==boton9)
		pantalla.setText(pantalla.getText()+"9");
		else if(e.getSource()==boton0)
		pantalla.setText(pantalla.getText()+"0");
		else if(e.getSource()==botonPunto)
		{
			pantalla.setText(pantalla.getText()+".");
			botonPunto.setEnabled(false); // desactiva el punto
		}
		
		

		else if (e.getSource()== jButton13)//suma
		{// suma
			if(pantalla.getText()!="")
			{
				x = Double.parseDouble(pantalla.getText()); 
				z=1;
				pantalla.setText("");
			botonPunto.setEnabled(true);				
			}
		}
		
		else if (e.getSource()== jButton19)//resta
		{
			if(pantalla.getText()!="")
			{
				x = Double.parseDouble(pantalla.getText()); 
				z=2;
				pantalla.setText("");
			botonPunto.setEnabled(true);				
			}
		}		
		
		else if (e.getSource()== jButton25)//multiplicacion
		{
			if(pantalla.getText()!="")
			{
				x = Double.parseDouble(pantalla.getText()); 
				z=3;
				pantalla.setText("");
				botonPunto.setEnabled(true);
			}
		}	
		
		else if (e.getSource()== jButton30)//Division
		{
			if(pantalla.getText()!="")
			{
				x = Double.parseDouble(pantalla.getText()); 
				z=4;
				pantalla.setText("");
				botonPunto.setEnabled(true);
			}
		}	
		
		else if (e.getSource()== jButton7)//para sacar residuo
		{
			if(pantalla.getText()!="")
			{
				x = Double.parseDouble(pantalla.getText()); 
				z=5;
				pantalla.setText("");
				botonPunto.setEnabled(true);
			}
		}	
		
		else if (e.getSource()== jButton27)//para x^n
		{
			if(pantalla.getText()!="")
			{
				x = Double.parseDouble(pantalla.getText()); 
				z=6;
				pantalla.setText("");
				botonPunto.setEnabled(true);
			}
		}	
		
		 if (e.getSource()== jButton31)//Boton de igual!
		{   
			if((pantalla.getText()!="") && (z == 1))//Para que se sume
			{ // para sumar
				y = Double.parseDouble(pantalla.getText());   
				x+=y;
				pantalla.setText("" + x);
				
			}	
			if((pantalla.getText()!="") && (z == 2))//Para que se reste
			{ 
				y = Double.parseDouble(pantalla.getText());   
				x-=y;
				pantalla.setText("" + x);
				
			}	

			if((pantalla.getText()!="") && (z == 3))//Para Multiplicar
			{ 
				y = Double.parseDouble(pantalla.getText());   
				x*=y;
				pantalla.setText("" + x);
				
			}			

			if((pantalla.getText()!="") && (z == 4))//Para dividir
			{ 
				y = Double.parseDouble(pantalla.getText());   
				x/=y;
				pantalla.setText("" + x);
				
			}	
			
			if((pantalla.getText()!="") && (z == 5))//Para sacar residuo
			{ 
				y = Double.parseDouble(pantalla.getText());   
				x=(funcion.residuo(x,y));
				pantalla.setText("" + x);
				
			}	
			
			if((pantalla.getText()!="") && (z == 6))//Para sacar x^n
			{ 
				y = Double.parseDouble(pantalla.getText());   
				x=(funcion.xan(x,y));
				pantalla.setText("" + x);
				
			}	
			
		}//Fin del igual

		
	
		else
		if(e.getSource() == jButton26)
		{
		x = Double.parseDouble(pantalla.getText());
		resultado = funcion.x2(x);
		pantalla.setText("" + resultado);
		}
	   
	   else if(e.getSource() == jButton4)
	   {x=Double.parseDouble(pantalla.getText());
	   resultado = funcion.sin(x);
	   pantalla.setText(""+resultado);}
		
	 
	  else if(e.getSource() == jButton5)
	   {x=Double.parseDouble(pantalla.getText());
	   resultado = funcion.cos(x);
	   pantalla.setText(""+resultado);}
	
	 else if(e.getSource() == jButton6)
	   {x=Double.parseDouble(pantalla.getText());
	   resultado = funcion.tan(x);
	   pantalla.setText(""+resultado);}
	   
	   
	   else if(e.getSource() == jButton8)
	   {x=Double.parseDouble(pantalla.getText());
	   resultado = funcion.logaritmo(x);
	   pantalla.setText(""+resultado);}
	   
	   
	   else if(e.getSource() == jButton9)
	   {x=Double.parseDouble(pantalla.getText());
	   resultado = funcion.logaritmo10(x);
	   pantalla.setText(""+resultado);}
	   
	   else if(e.getSource() == jButton3)
	   {x=Double.parseDouble(pantalla.getText());
	   resultado = funcion.inversa(x);
	   pantalla.setText(""+resultado);}
	   
	   
	   else if(e.getSource() == jButton14)
	   {x=Double.parseDouble(pantalla.getText());
	   resultado = funcion.diezax(x);
	   pantalla.setText(""+resultado);}
	   
	   
	   else if(e.getSource() == jButton15)
	   {x=Double.parseDouble(pantalla.getText());
	   resultado = funcion.eax(x);
	   pantalla.setText(""+resultado);}
	   
	   
	   else if(e.getSource() == jButton20)
	   {x=Double.parseDouble(pantalla.getText());
	   resultado = funcion.raiz(x);
	   pantalla.setText(""+resultado);}
	   
	   
	   else if(e.getSource() == jButton21)
	   {x=Double.parseDouble(pantalla.getText());
	   resultado = funcion.raiz3(x);
	   pantalla.setText(""+resultado);}
	   
	   
	   
	   }
		}//fin de la clase






	   