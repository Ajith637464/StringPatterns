/*
Composition.-------> Early Instantiation
*/

class Engine
{
	//states
	String power,stroke,type;
	//constructor
	public Engine()
	{
		//L.I
	}
	public Engine (String power,String stroke,String type)
	{
		/*L.I-----> Take all non-static mem from engine 
		class and load inside engine object */
		this.power=power;
		this.stroke=stroke;
		this.type=type;
	}
	//behaviours
	public void detailsOfEngine()
	{
		System.out.println("Engine Power: "+power);
		System.out.println("Engine Stroke: "+stroke);
		System.out.println("Engine Type: "+type);
		System.out.println("***************************");
	}
}
//car class
class  Car
{
	//states
	String name,color;
	double price;
	static String owner="Ajith";
	//Early Instantiation
	Engine e;
	//constructor
	public Car(){}
	public Car(String name,String color,double price,Engine e)
	{
		//L.I
		this.name=name;
		this.color=color;
		this.price=price;
		this.e=e;
	}
	//Behaviors
	public void detailsOfCar()
	{
		System.out.println("car Name: "+name);
		System.out.println("car Color: "+color);
		System.out.println("car Price: "+price);
		System.out.println("car Owner: "+owner);
		System.out.println("****************************");
	}
}
//CarEngineGen class
class CarEngineGen 
{
	public static void main(String[] args) 
	{
		Car car1=new Car("BMW","Black",8000000,new Engine("800","4 Stroke","Diesel"));
		Car car2=new Car("RoolsRoyce","White",9000000,new Engine("1200","6 Stroke","Diesel"));

		car1.detailsOfCar();
		car1.e.detailsOfEngine();

		car2.detailsOfCar();
		car2.e.detailsOfEngine();
	}
}

