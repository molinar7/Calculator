ublic class Operaciones 
{
	String nombre;
   public Operaciones() // constructor default
   {
    nombre = "";
   }

    public Operaciones(String x) // constructor default
   {
    nombre = x;
   }
   
public double suma(double x,double y){
return(x+y);}   

public double resta(double x,double y){
return(x-y);}

public double xan (double x, double y){
return(Math.pow(x,y));}

public double multiplicacion(double x,double y){
return(x*y);}

public double division(double x,double y){
return(x/y);}

public double residuo(double x,double y){

return(x%=y);}
   
public double x2(double x){
return (Math.pow(x,2)); }

public double sin(double x){
return ( Math.sin(x));}

public double cos(double x){
return ( Math.cos(x));}

public double tan(double x){
return (Math.tan(x));}

public double logaritmo(double x){
return (Math.log(x));}

public double logaritmo10(double x){
return (Math.log10(x));}

public double inversa(double x){
return (1/x);}

public double diezax(double x) //"10" a la x
{return(Math.pow(10,x));}

public double eax(double x) // "e" a la x
{return (Math.exp(x));}

public double raiz(double x)
{return (Math.sqrt(x));}

public double raiz3(double x)  //raiz cubica
{return (Math.pow(x,.333333333333333));}
}

	