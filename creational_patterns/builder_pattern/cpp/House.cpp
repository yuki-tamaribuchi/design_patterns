#include<iostream>

using namespace std;

class HousePlan{
	public:
	virtual void setBasement(string basement){};
	virtual void setStructure(string structure){};	
	virtual void setRoof(string roof){};
	virtual void setInterior(string interior){};
	virtual void setHouseName(string houseName){};
	virtual string getHouseName(){
		return "";
	};
};

class House:public HousePlan{
	string basement;
	string structure;
	string roof;
	string interior;
	string houseName;

	public:
	void setBasement(string basement){
		this->basement = basement;
	}

	void setStructure(string structure){
		this->structure = structure;
	}

	void setRoof(string roof){
		this->roof = roof;
	}

	void setInterior(string interior){
		this->interior = interior;
	}

	void setHouseName(string houseName){
		this->houseName = houseName;
	}

	string getHouseName(){
		return this->houseName;
	}
};


class HouseBuilder{

	public:
	virtual void buildBasement(){
		return;
	};

	virtual void buildStructure(){
		return;
	};

	virtual void buildRoof(){
		return;
	};

	virtual void buildInterior(){
		return;
	};

	virtual void setHouseName(){
		return;
	};

	virtual House getHouse(){
		House house = House();
		return house;
	};
};


class IglooHouseBuilder:public HouseBuilder{
	House house;

	public:
	IglooHouseBuilder(){
		this->house = House();
	}

	void buildBasement(){
		this->house.setBasement("Ice Bars");
	}

	void buildStructure(){
		this->house.setStructure("Ice Blocks");
	}

	void buildInterior(){
		this->house.setInterior("Ice Carvings");
	}

	void buildRoof(){
		this->house.setRoof("Ice Dome");
	}

	void setHouseName(){
		this->house.setHouseName("Igloo house");
	}

	House getHouse(){
		return this->house;
	}
};


class TipiHouseBuilder:public HouseBuilder{
	House house;

	public:
	TipiHouseBuilder(){
		this->house = House();
	}

	void buildBasement(){
		this->house.setBasement("Wooden Poles");
	}

	void buildStructure(){
		this->house.setStructure("Wood and Ice");
	}

	void buildInterior(){
		this->house.setInterior("Fire Wood");
	}

	void buildRoof(){
		this->house.setRoof("Wood, caribou and seal skins");
	}

	void setHouseName(){
		this->house.setHouseName("Tipi house");
	}

	House getHouse(){
		return this->house;
	}
};


class CivilEngineer{
	HouseBuilder houseBuilder;

	public:
	CivilEngineer(HouseBuilder houseBuilder){
		this->houseBuilder = houseBuilder;
	}

	House getHouse(){
		return this->houseBuilder.getHouse();
	}

	void constructHouse(){
		this->houseBuilder.buildBasement();
		this->houseBuilder.buildStructure();
		this->houseBuilder.buildRoof();
		this->houseBuilder.buildInterior();
		this->houseBuilder.setHouseName();
	}
};


int main(){

	HouseBuilder iglooBuilder = IglooHouseBuilder();
	CivilEngineer engineer = CivilEngineer(iglooBuilder);

	engineer.constructHouse();

	House house = engineer.getHouse();

	string houseName = house.getHouseName();

	cout << "Builder constructed: " << houseName << endl;

	return 0;
}