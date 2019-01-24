class Box
{
	 double width;
	 double height;
	 double depth;
	 Box(double w, double h,double d){
	 	this.width= w;
	 	this.height= h;
	 	this.depth= d;
	 }
	 
	 double volume()
	 {
	   double volume;
	   volume= width*height*depth;
	   return volume;
	 }
	 void setDim()
	 {
	 	width= 2;
	 	height= 3;
	 	depth= 9;
	    System.out.println("width="+width);
	    System.out.println("height="+height);
	    System.out.println("depth="+depth);
	 }
}	
 class BoxDemo
	{
	  public static void main(String[]args)
	  {
	    Box mybox1 = new Box(10,20,15);
	    Box mybox2 = new Box(2,3,9);
	    double vol;
	    vol= mybox1.volume();
	    System.out.println("Volume is"+vol);
	    vol= mybox2.volume();
	    System.out.println("Volume is"+vol);
	  }
	}
