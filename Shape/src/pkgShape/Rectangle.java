package pkgShape;

public class Rectangle extends Shape{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) {
		
		if (iWidth <=0 || iLength <=0) {
			throw new IllegalArgumentException();
		}
	}
	
	

	public int getiWidth() {
		return iWidth;
	}



	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}



	public int getiLength() {
		return iLength;
	}



	public void setiLength(int iLength) {
		this.iLength = iLength;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (iWidth*iLength);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(iWidth+iLength);
	}
	
	
	

}
