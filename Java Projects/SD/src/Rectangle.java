
class Rectangle {
    int length;
    int width;

    Rectangle(int l, int b) {
        length = l;
        width = b;
    }

    void area(Rectangle r1) {
        int areaOfRectangle = r1.length * r1.width;
        System.out.println("Area of Rectangle : " 
                                + areaOfRectangle);
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle r1 = new Rectangle(10, 20);
        r1.area(r1);
        
        Rectangle r2 = new Rectangle(200, 30);
        r2.area(r2);
    }
    
  
}
