package five_project;

import java.util.Scanner;

public class Diem {
	private float x;
	private float y;
	public Diem() {
		x=y=0;
	}
	public Diem(float h,float t) {
		x=h;
		y=t;
	}
	public Diem(int a) {
		x=y=a;
	}
	//Ham xay dung sao chep
	public Diem(Diem d) {
		this.x=d.x;
		this.y=d.y;
	}
	// Ham xay dung sao chep sau
	public void makeCopy(Diem d) {
		this.x=d.x;
		this.y=d.y;
	}
	public void nhapDiem(){
		Scanner yb=new Scanner(System.in);
		System.out.print("Nhap hoanh do x: ");
		x=yb.nextFloat();
		System.out.print("Nhap tung do y: ");
		y=yb.nextFloat();
	}
	public void hienThi(){
		System.out.println("Toa do"+"("+x +"," +y +")");
	}
	public void khoiTao(float h,float t){
		x=h;
		y=t;
	}
	public void doiDiem(float dx, float dy){
		x+=dx;
		y+=dy;
	}
	public float khoangCach(){
		return (float)Math.sqrt(x*x + y*y);
	}
	public float giaTriX(){
		return x;
	}
	public float giaTriY(){
		return y;
	}
	public float khoangCach(Diem d){
		return (float)Math.sqrt((d.x-this.x)*(d.x-this.x)+(d.y-this.y)*(d.y-this.y));
	}
	public void doiXung(Diem d){
		this.x=-d.x;
		this.y=-d.y;
	}
}