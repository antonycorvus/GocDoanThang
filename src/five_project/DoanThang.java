package five_project;
import java.util.Scanner;
class MyTool{
	public static int tinhGoc(double z){   // khong can lam tron z
		System.out.println("Alo Alo");
		int alpha;
			for(alpha=0;alpha<90;alpha++) {
				double a=Math.tan((Math.PI*alpha)/180);
				//double goc=Math.toDegrees(a);
				double j=(Math.round(a*100000.0)/100000.0);
				double i=Math.tan((Math.PI*(alpha+1))/180);
				double k=(Math.round(i*100000.0)/100000.0);
//				System.out.println(alpha);
//				System.out.println(j);
//				System.out.println(k);
				if(z==1)
					return 45;
				else if(j<z && z<k) {
						return (alpha);
				}
			}
			return 0;
		}
	public static float giaiPhuongTrinh(float a, float b) {
		if(a!=0) {
			return (-b)/a;
		}
		return 1;
	}
};
public class DoanThang {
	private Diem d1;
	private Diem d2;
	public DoanThang() {
		d1=new Diem();
		d2=new Diem();
	}
	public DoanThang(Diem a,Diem b) {
		d1=new Diem(a);
		d2=new Diem(b);
	}
	public DoanThang(float ax,float ay,float bx,float by) {
		d1=new Diem(ax,ay);
		d2=new Diem(bx,by);
	}
	public DoanThang(DoanThang d) {
		d1=new Diem(d.d1);
		d2=new Diem(d.d2);
	}
	public void makeCopy(DoanThang d) {
		d1.makeCopy(d.d1);
		d2.makeCopy(d.d2);
	}
	public void nhap() {
		while(true) {
		Scanner yb=new Scanner(System.in);
		System.out.println("Dung nhap hai diem trung nhau nhe hehe");
		System.out.println("Nhap toa do dau mut 1 cua doan thang: ");
		d1.nhapDiem();
		System.out.println("Nhap toa do dau mut 2 cua doan thang: ");
		d2.nhapDiem();
		if(d1.giaTriX()!=d2.giaTriX() || d1.giaTriY()!=d2.giaTriY()) break;
		System.out.println("Nhap sai, nhap lai !!!");
		}
	}
	public void hienThi() {
		System.out.println("Gia tri dau mua 1 cua doan thang la: ");
		d1.hienThi();
		System.out.println("Gia tri dau mua 2 cua doan thang la: ");
		d2.hienThi();
	}
	public void doiDoanThang(float dx,float dy) {
		d1.doiDiem(dx,dy);
		d2.doiDiem(dx,dy);
	}
	public float doDaiDoanThang() {
		return d1.khoangCach(d2);
	}
	public float gotX() {
		float a1, b1, c1, a2, b2, c2;
	    float D, Dx, Dy, x;
	    a1=d1.giaTriX();
	    b1=1;
	    c1=d1.giaTriY();
	    a2=d2.giaTriX();
	    b2=1;
	    c2=d2.giaTriY();
	    D = a1 * b2 - a2 * b1;
	    Dx = c1 * b2 - c2 * b1;
	    Dy = a1 * c2 - a2 * c1;
	    if (D != 0) {
	       x = Dx / D;
	       return x; 
	    }
	    return 1;
	}
	public float gotY() {
		float a1, b1, c1, a2, b2, c2;
	    float D, Dx, Dy, y;
	    a1=d1.giaTriX();
	    b1=1;
	    c1=d1.giaTriY();
	    a2=d2.giaTriX();
	    b2=1;
	    c2=d2.giaTriY();
	    D = a1 * b2 - a2 * b1;
	    Dx = c1 * b2 - c2 * b1;
	    Dy = a1 * c2 - a2 * c1;
	    if (D != 0) {
	    	y = Dy / D;
	       return y; 
	    }
	    return 1;
	}
	public void gocVoiTrucHoanh() {
		float a1, b1, c1, a2, b2, c2;
	    float D, Dx, Dy, x, y;
//	    System.out.println("a1*x + b1*y = c1");
//	    System.out.println("a2*x + b2*y = c2");
	    a1=d1.giaTriX();
	    b1=1;
	    c1=d1.giaTriY();
	    a2=d2.giaTriX();
	    b2=1;
	    c2=d2.giaTriY();
	    D = a1 * b2 - a2 * b1;
	    Dx = c1 * b2 - c2 * b1;
	    Dy = a1 * c2 - a2 * c1;
	    if (D == 0) {
	        if (Dx==Dy)
	            System.out.println("He phuong trinh co vo so nghiem");
	        else
	        	System.out.println("He phuong trinh vo nghiem");
	    }
	    else {
	        x = Dx / D;
	        y = Dy / D;
	        System.out.println("He phuong trinh co nghiem a= "+x +" va b= " +y);
	        if(y>0)
	        	System.out.println("Phuong trinh duong thang co dang y= "+x +"x +"+y);
	        if(y<0)
	        	System.out.println("Phuong trinh duong thang co dang y= "+x +"x "+y);
	        if(y==0)
	        	System.out.println("Phuong trinh duong thang co dang y= "+x +"x ");
	        if(x==0)
	        	System.out.println("Duong thang song song voi truc hoanh");
	        if(x>0)
				System.out.println("Goc giua duong thang va truc hoanh la goc nhon");
			if(x<0)
				System.out.println("Goc giua duong thang va truc hoanh la goc tu");
	    }
	}
	public void soLo() {
		if(d1.giaTriY()>0  && d2.giaTriX()>0 && d1.giaTriX()==0 && d2.giaTriY()==0) {   //TH1: goc phan tu thu nhat
			float a=d1.khoangCach();
			float b=d2.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(a/b))) +" do");
		}
		if(d1.giaTriY()>0 && d2.giaTriX()<0 && d1.giaTriX()==0 && d2.giaTriY()==0) {  //TH2: goc phan tu thu hai
			float a=d1.khoangCach();
			float b=d2.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(a/b))) +" do");
		}
		if(d1.giaTriX()<0 && d2.giaTriY()<0 && d1.giaTriY()==0 && d2.giaTriX()==0) {  //TH3: goc phan tu thu ba
			float a=d1.khoangCach();
			float b=d2.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if(d1.giaTriX()>0 && d2.giaTriY()<0 && d1.giaTriY()==0 && d2.giaTriX()==0) {  //TH4: goc phan tu thu tu
			float a=d1.khoangCach();
			float b=d2.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()>0 && d1.giaTriY()>0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()>0) || (d1.giaTriX()>0 && d1.giaTriY()>0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()>d1.giaTriY() && d2.giaTriX()>0)) {   // TH1 va TH4: d1 o goc phan tu thu nhat, d2 nam xung quanh va cung goc phan tu  
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			Diem B=new Diem(0,(gotY()));
			A.hienThi();
			B.hienThi();
			float a=A.khoangCach();
			float b=B.khoangCach();
//			System.out.println(b/a);
//			System.out.println(MyTool.tinhGoc(b/a));
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()>0 && d1.giaTriY()>0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()<d1.giaTriY() && d2.giaTriX()>0 && d2.giaTriY()>0) || (d1.giaTriX()>0 && d1.giaTriY()>0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()>d1.giaTriY())) {   // TH2 va TH3: d1 o goc phan tu thu nhat, d2 nam xung quanh va cung goc phan tu
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			Diem B=new Diem(0,(gotY()));
			A.hienThi();
			B.hienThi();
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()<0 && d1.giaTriY()>0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()>0) || (d1.giaTriX()<0 && d1.giaTriY()>0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()>d1.giaTriY())) { //TH5 va TH8: d1 o goc phan tu thu hai, d2 nam xung quanh va cung goc phan tu
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			Diem B=new Diem(0,(gotY()));
			A.hienThi();
			B.hienThi();
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()<0 && d1.giaTriY()>0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()>0) || (d1.giaTriX()<0 && d1.giaTriY()>0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()>d1.giaTriY())) {   //TH6 va TH7: d1 o goc phan tu thu hai, d2 nam xung quanh va cung goc phan tu 
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			Diem B=new Diem(0,(gotY()));
			A.hienThi();
			B.hienThi();
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()<0 && d1.giaTriY()<0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()>d1.giaTriY() && d2.giaTriY()<0) || (d1.giaTriX()<0 && d1.giaTriY()<0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()<d1.giaTriY())) {    //TH9 va TH12: d1 o goc phan tu thu ba, d2 nam xung quanh va cung goc phan tu 
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			Diem B=new Diem(0,(gotY()));
			A.hienThi();
			B.hienThi();
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()<0 && d1.giaTriY()<0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()>d1.giaTriY() && d2.giaTriY()<0) || (d1.giaTriX()<0 && d1.giaTriY()<0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()<d1.giaTriY())) {   //TH10 va TH11: d1 o goc phan tu thu ba, d2 nam xung quanh va cung goc phan tu 
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			Diem B=new Diem(0,(gotY()));
			A.hienThi();
			B.hienThi();
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()>0 && d1.giaTriY()<0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()>d1.giaTriY() && d2.giaTriY()<0) || (d1.giaTriX()>0 && d1.giaTriY()<0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriX()>0 && d2.giaTriY()<d1.giaTriY())) {   //TH13 va TH16: d1 o goc phan tu thu tu, d2 nam xung quanh va cung goc phan tu 
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			Diem B=new Diem(0,(gotY()));
			A.hienThi();
			B.hienThi();
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()>0 && d1.giaTriY()<0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriX()>0 && d2.giaTriY()>d1.giaTriY()) || (d1.giaTriX()>0 && d1.giaTriY()<0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()<d1.giaTriY())) {   //TH14 va TH15: d1 o goc phan tu thu tu, d2 nam xung quanh va cung goc phan tu 
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			Diem B=new Diem(0,(gotY()));
			A.hienThi();
			B.hienThi();
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if(d1.giaTriX()!=d2.giaTriX() && d1.giaTriY()==d2.giaTriY()) {   //d2 nam ngang d1
			System.out.println("Goc duong thang voi truc hoanh la 0 do");
		}
		if(d1.giaTriX()==d2.giaTriX() && d1.giaTriY()!=d2.giaTriY()) {  //d2 nam doc d1
			System.out.println("Goc duong thang voi truc hoanh la 90 do");
		}
		if((d1.giaTriX()>0 && d1.giaTriY()==0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()>d1.giaTriY()) || (d1.giaTriX()>0 && d1.giaTriY()==0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriX()>0 && d2.giaTriY()<d1.giaTriY())) {  //TH1 va Th4: d1 tren truc hoanh va d2 xung quanh hai ben
			//Diem B cat tung
			Diem B=new Diem(0,(gotY()));
			B.hienThi();
			float a=d1.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()>0 && d1.giaTriY()==0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()>d1.giaTriY()) || (d1.giaTriX()>0 && d1.giaTriY()==0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()<0)) {  //TH2 va TH3: d1 duong tren truc hoanh va d2 xung quanh hai ben
			//Diem B cat tung
			Diem B=new Diem(0,(gotY()));
			B.hienThi();
			float a=d1.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()<0 && d1.giaTriY()==0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()>d1.giaTriY()) || (d1.giaTriX()<0 && d1.giaTriY()==0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()<d1.giaTriY())) {  //TH5 va TH8: d1 am tren truc hoanh va d2 xung quanh hai ben
			//Diem B cat tung
			Diem B=new Diem(0,(gotY()));
			B.hienThi();
			float a=d1.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()<0 && d1.giaTriY()==0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()>d1.giaTriY()) || (d1.giaTriX()<0 && d1.giaTriY()==0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()>d1.giaTriY()) || (d1.giaTriX()<0 && d1.giaTriY()==0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()<d1.giaTriY())) {  //TH6 va TH7: d1 am tren truc hoanh va d2 xung quanh hai ben
			//Diem B cat tung
			Diem B=new Diem(0,(gotY()));
			B.hienThi();
			float a=d1.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()==0 && d1.giaTriY()>0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()>d1.giaTriY()) || (d1.giaTriX()==0 && d1.giaTriY()>0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()>0)) {  //TH9 va TH12: d1 duong tren truc tung va d2 xung quanh hai ben
			//Diem A cat hoanh
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			A.hienThi();
			float a=A.khoangCach();
			float b=d1.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()==0 && d1.giaTriY()>0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()>d1.giaTriY()) || (d1.giaTriX()==0 && d1.giaTriY()>0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()>0)) {  //TH10 va TH11: d1 duong tren truc tung va d2 xung quanh hai ben
			//Diem A cat hoanh
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			A.hienThi();
			float a=A.khoangCach();
			float b=d1.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()==0 && d1.giaTriY()<0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()>d1.giaTriY() && d2.giaTriY()<0) || (d1.giaTriX()==0 && d1.giaTriY()<0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()<d1.giaTriY())) {  //TH13 va TH16: d1 am tren truc tung va d2 xung quanh hai ben
			//Diem A cat hoanh
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			A.hienThi();
			float a=A.khoangCach();
			float b=d1.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()==0 && d1.giaTriY()<0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()>d1.giaTriY() && d2.giaTriY()<0) || (d1.giaTriX()==0 && d1.giaTriY()<0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()<d1.giaTriY())) {  //TH14 va TH15: d1 am tren truc tung va d2 xung quanh hai ben
			//Diem A cat hoanh
			Diem A=new Diem((MyTool.giaiPhuongTrinh(gotX(),gotY())),0);
			A.hienThi();
			float a=A.khoangCach();
			float b=d1.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		//d1 o goc phan tu nay, d2 o cac goc phan tu khac
		// d1 o goc phan tu thu I
		if((d1.giaTriX()>0 && d1.giaTriY()>0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()<0) || (d1.giaTriX()>0 && d1.giaTriY()>0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriX()>0 && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()<0) || (d1.giaTriX()>0 && d1.giaTriY()>0 && d2.giaTriX()<0 && d2.giaTriY()<0 && d2.giaTriX()!=-d1.giaTriX() && d2.giaTriY()!=-d1.giaTriY())) {    //TH2(II) va TH3(IV) va TH6(III) va TH7(III) d1 goc phan tu thu nhat, d2 goc phan tu thu II và thu IV va thu III
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem(MyTool.giaiPhuongTrinh(gotX(),gotY()),0);
			Diem B=new Diem(0,gotY());
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ MyTool.tinhGoc(b/a) +" do");
		}
		if((d1.giaTriX()>0 && d1.giaTriY()>0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()>d1.giaTriY()) || (d1.giaTriX()>0 && d1.giaTriY()>0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()<0)) {   //TH1(II) va TH4(IV) d1 goc phan tu thu nhat, d2 goc phan tu thu II và thu IV
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem(MyTool.giaiPhuongTrinh(gotX(),gotY()),0);
			Diem B=new Diem(0,gotY());
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if(d1.giaTriX()>0 && d1.giaTriY()>0 && d2.giaTriX()==-d1.giaTriX() && d2.giaTriY()==-d1.giaTriY()) {   //d2(III) doi xung d1(I) 
			//Diem A cat hoanh
			Diem A=new Diem(d1.giaTriX(),0);
			float a=A.khoangCach();
			float b=d1.khoangCach(A);
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		// d1 o goc phan tu II
		if((d1.giaTriX()<0 && d1.giaTriY()>0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()>0 && d2.giaTriY()>d1.giaTriY()) || (d1.giaTriX()<0 && d1.giaTriY()>0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()<0)) {   //TH1(I) va TH4(III) d1 o goc phan tu II, d2 o goc I va III
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem(MyTool.giaiPhuongTrinh(gotX(),gotY()),0);
			Diem B=new Diem(0,gotY());
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()<0 && d1.giaTriY()>0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()>0 && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()>0) || (d1.giaTriX()<0 && d1.giaTriY()>0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()<d1.giaTriY() && d2.giaTriY()<0) || (d1.giaTriX()<0 && d1.giaTriY()>0 && d2.giaTriX()!=-d1.giaTriX() && d2.giaTriY()!=-d1.giaTriY())) {  //TH2(I) va TH3(III) d1 o goc phan tu II, d2 o goc I va III
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem(MyTool.giaiPhuongTrinh(gotX(),gotY()),0);
			Diem B=new Diem(0,gotY());
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if(d1.giaTriX()<0 && d1.giaTriY()>0 && d2.giaTriX()==-d1.giaTriX() && d2.giaTriY()==-d1.giaTriY()) {  //d2(IV) doi xung d1(II)
			//Diem A cat hoanh
			Diem A=new Diem(d1.giaTriX(),0);
			float a=A.khoangCach();
			float b=d1.khoangCach(A);
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-((MyTool.tinhGoc(b/a)))) +" do");
		}
		// d1 o goc phan tu thu III
		if((d1.giaTriX()<0 && d1.giaTriY()<0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()>d1.giaTriY() && d2.giaTriY()>0) || (d1.giaTriX()<0 && d1.giaTriY()<0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()>0 && d2.giaTriY()>d1.giaTriY() && d2.giaTriY()<0) || (d1.giaTriX()<0 && d1.giaTriY()<0 && d2.giaTriX()!=-d1.giaTriX() && d2.giaTriY()!=-d1.giaTriY())) {   //TH1(II) va TH3(IV) d1 o goc phan tu III, d2 o goc II va IV
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem(MyTool.giaiPhuongTrinh(gotX(),gotY()),0);
			Diem B=new Diem(0,gotY());
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()<0 && d1.giaTriY()<0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriY()>d1.giaTriY() && d2.giaTriY()>0) || (d1.giaTriX()<0 && d1.giaTriY()<0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriX()>0 && d2.giaTriY()<d1.giaTriY())) {  //TH2(II) va TH4(IV) d1 o goc phan tu III, d2 o goc II va IV
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem(MyTool.giaiPhuongTrinh(gotX(),gotY()),0);
			Diem B=new Diem(0,gotY());
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if(d1.giaTriX()<0 && d1.giaTriY()<0 && d2.giaTriX()==-d1.giaTriX() && d2.giaTriY()==-d1.giaTriY()) {  //d2(I) doi xung d1(III)
			//Diem A cat hoanh
			Diem A=new Diem(d1.giaTriX(),0);
			float a=A.khoangCach();
			float b=d1.khoangCach(A);
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		//d1 o goc phan tu IV
		if((d1.giaTriX()>0 && d1.giaTriY()<0 && d2.giaTriX()>d1.giaTriX() && d2.giaTriY()>d1.giaTriY() && d2.giaTriY()>0) || (d1.giaTriX()>0 && d1.giaTriY()<0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()<d1.giaTriY())) {  //TH1(I) va TH4(III) d1 o goc phan tu IV, d2 o goc I va III
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem(MyTool.giaiPhuongTrinh(gotX(),gotY()),0);
			Diem B=new Diem(0,gotY());
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ ((MyTool.tinhGoc(b/a))) +" do");
		}
		if((d1.giaTriX()>0 && d1.giaTriY()<0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriX()>0 && d2.giaTriY()>d1.giaTriY() && d2.giaTriY()>0) || (d1.giaTriX()>0 && d1.giaTriY()<0 && d2.giaTriX()<d1.giaTriX() && d2.giaTriX()<0 && d2.giaTriY()>d1.giaTriY() && d2.giaTriY()<0) || (d1.giaTriX()>0 && d1.giaTriY()<0 && d2.giaTriX()!=-d1.giaTriX() && d2.giaTriY()!=-d1.giaTriY())) {  //TH2(I) va TH3(III) d1 o goc phan tu IV, d2 o goc I va III
			//Diem A cat hoanh
			//Diem B cat tung
			Diem A=new Diem(MyTool.giaiPhuongTrinh(gotX(),gotY()),0);
			Diem B=new Diem(0,gotY());
			float a=A.khoangCach();
			float b=B.khoangCach();
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-(MyTool.tinhGoc(b/a))) +" do");
		}
		if(d1.giaTriX()>0 && d1.giaTriY()<0 && d2.giaTriX()==-d1.giaTriX() && d2.giaTriY()==-d1.giaTriY()) { //d2(II) doi xung d1(IV)
			//Diem A cat hoanh
			Diem A=new Diem(d1.giaTriX(),0);
			float a=A.khoangCach();
			float b=d1.khoangCach(A);
			Math.abs(a);
			Math.abs(b);
			System.out.println("Gia tri goc la: "+ (180-((MyTool.tinhGoc(b/a)))) +" do");
		}
	}
}
