//https://www.geeksforgeeks.org/abstract-factory-pattern/

package creational_patterns.abstract_factory_pattern.java;

enum CarType{
	MICRO, MINI, LUXURY
}

enum Location{
	DEFAULT, USA, INDIA
}

abstract class Car{
	CarType model;
	Location location;

	Car(CarType model, Location location){
		this.model = model;
		this.location = location;
	}

	abstract void construct();

	CarType getModel(){
		return model;
	}

	void setModel(CarType model){
		this.model = model;
	}
	
	Location getLocation(){
		return location;
	}

	void setLocation(Location location){
		this.location = location;
	}

	@Override
	public String toString(){
		return "CarModel - "+model+" located in "+location;
	}
}


class LuxuryCar extends Car{
	LuxuryCar(Location location){
		super(CarType.LUXURY, location);
	}

	@Override
	protected void construct(){
		System.out.println("Connecting to luxury car");
	}
}


class MicroCar extends Car{

	MicroCar(Location location){
		super(CarType.MICRO, location);
	}

	@Override
	protected void construct(){
		System.out.println("Connecting to Micro Car");
	}
}


class MiniCar extends Car{

	MiniCar(Location location){
		super(CarType.MINI, location);
	}

	@Override
	protected void construct(){
		System.out.println("Connecting to Mini Car");
	}
}


class INDIACarFactory{
	public static Car buildCar(CarType model){
		Car car = null;
		switch(model){
			case MICRO:
				car = new MicroCar(Location.INDIA);
				break;

			case MINI:
				car = new MiniCar(Location.INDIA);
				break;

			case LUXURY:
				car =  new LuxuryCar(Location.INDIA);
				break;

			default:
				break;
		}
		return car;
	}
}

class DefaultCarFactory{
    public static Car buildCar(CarType model){
        Car car = null;
        switch (model)
        {
            case MICRO:
                car = new MicroCar(Location.DEFAULT);
                break;
             
            case MINI:
                car = new MiniCar(Location.DEFAULT);
                break;
                 
            case LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;
                 
            default:
                break;
        }
        return car;
    }
}


class USACarFactory{
    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case MICRO:
                car = new MicroCar(Location.USA);
                break;
             
            case MINI:
                car = new MiniCar(Location.USA);
                break;
                 
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
                 
            default:
                break; 
        }
        return car;
    }
}


class CarFactory{
	private CarFactory(){}

	public static Car buildCar(CarType type){
		Car car = null;

		Location location = Location.INDIA;

		switch(location){
			case USA:
				car = USACarFactory.buildCar(type);
				break;
			
			case INDIA:
				car = INDIACarFactory.buildCar(type);
				break;
			default:
				car = DefaultCarFactory.buildCar(type);
		}
		return car;
	}
}



class AbstractFactorySample {

	public static void main(String[] args){
		System.out.println(CarFactory.buildCar(CarType.MICRO));
		System.out.println(CarFactory.buildCar(CarType.MINI));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
	}

	
}
