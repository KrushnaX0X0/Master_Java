package ObjectOrient;

 class Side
 {
     int side;
//     
//   void set_side(int s)
//   {
//	   this.side = s;
//   }
//   
//   int get_side()
//   {
//	   return this.side;
//   }
//   
   int area()
   {
	  return (side * side); 
   }

	 public int getSide() {
		 return side;
	 }

	 public void setSide(int side) {
		 this.side = side;
	 }
   
 }



public class EncapSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Side s = new Side();
		s.setSide(12);
		System.out.println(s.getSide());
		System.out.println("Area of squre : "+s.area());

	}

}
