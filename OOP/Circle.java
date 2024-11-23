class Circle{
     double rad;
     double pi = 3.14;

     double area(){
        return(rad*rad *pi);
     }
     double circumf(){

        return(2*rad*pi);
     }
}
class TestCircle{
    public static void main(String[] args) {
      Circle c1 = new Circle();
      c1.rad = 5.0;
      System.out.println("The area of the circle is " + c1.area() );
      System.out.println("The curcumfance of the circle is " + c1.circumf());

    
}
}
