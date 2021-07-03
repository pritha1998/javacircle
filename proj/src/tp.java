
class Rect1 extends Thread
{ 
    public void run() {     
    	int l=1;
	
           int b=15;
            
            System.out.println("Area of Rectangle is =" +(l*b)); 
           // return(l*b);
}
}
class Circle1 extends Thread
{ 
    public void run(){
    	int r=10;
	
    	//System.out.println("thread circ");
            /*
            void setval(int x) 
            { 
                        r=x; 
                        //b=y; 
            }
            */ 
            //int area() 
            
                      //  return (r*r);
    	//{
                        System.out.println("Area of Circle is :" +(r*r));
                       // return (r*r); 
            } 
              
}
// FOR TESTING PURPOSE
class A extends Thread{
	public void run(){
		System.out.println("thread a");
	}
}
class tp{
	public static void main(String args[]){
		
		System.out.println("Main thread started"); 
		
        Rect1 threadRect = new Rect1(); 
        Circle1 threadCircle = new Circle1 (); 
        A threadA = new A (); 
       // Circle threadCircle = new Circle ();
        //Rect threadRect = new Rect();
        threadCircle.setPriority(Thread.MIN_PRIORITY);  // priority = 10 
        threadA.setPriority(threadRect.getPriority()+1); // priority = 6 
        threadRect.setPriority(Thread.MAX_PRIORITY); // priority =l 
        threadRect.start(); 
        threadCircle.start(); 
        threadA.start();
        
	}
}
