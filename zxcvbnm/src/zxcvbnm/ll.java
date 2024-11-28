package zxcvbnm;

public class ll {
	    public static void main(String[] args) {
	        IVehicle[] ivc;
	        ivc = new IVehicle[2];

	        ivc[0] = new Car(1234, 20.5);
	        ivc[1] = new Plane(232);

	        for (int i = 0; i < ivc.length; i++) {
	            ivc[i].show();
	        }
	    }
	}

	interface IVehicle {
	    int weight = 1000;
	    void show();
	}

	class Car implements IVehicle {
	    private int num;
	    private double gas;

	    public Car(int n, double g) {
	        num = n;
	        gas = g;
	        System.out.println("生產了車號 " + num + "，汽油量 " + gas + " 的車子");
	    }

	    public void show() {
	        System.out.println("車號是 " + num);
	        System.out.println("汽油量是 " + gas);
	    }
	}

	class Plane implements IVehicle {
	    private int flight;

	    public Plane(int f) {
	        flight = f;
	        System.out.println("生產了 " + flight + " 班次的飛機");
	    }

	    public void show() {
	        System.out.println("飛機的班次是 " + flight);
	    }
	}
