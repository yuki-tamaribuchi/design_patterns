class HousePlan:
	def set_basement(self, basement:str):
		pass

	def set_structure(self, structure:str):
		pass

	def set_roof(self, roof:str):
		pass

	def set_interior(self, interior:str):
		pass


class House(HousePlan):
	def set_basement(self, basement: str):
		self.basement = basement

	def set_structure(self, structure: str):
		self.structure = structure

	def set_roof(self, roof:str):
		self.roof = roof

	def set_interior(self, interior:str):
		self.interior = interior


class HouseBuilder:
	def build_basement(self):
		pass
	
	def build_structure(self):
		pass

	def build_roof(self):
		pass

	def build_interior(self):
		pass

	def get_house(self):
		pass


class IglooHouseBuilder(HouseBuilder):

	def __init__(self):
		self.house = House()

	def build_basement(self):
		self.house.set_basement("Ice Bars")

	def build_structure(self):
		self.house.set_structure("Ice Blocks")

	def build_interior(self):
		self.house.set_interior("Ice Carvings")

	def build_roof(self):
		self.house.set_roof("Ice Dome")

	def get_house(self):
		return self.house

class CivilEngineer:
	def __init__(self, house_builder):
		self.house_builder = house_builder

	def get_house(self):
		return self.house_builder.get_house()

	def construct_house(self):
		self.house_builder.build_basement()
		self.house_builder.build_structure()
		self.house_builder.build_roof()
		self.house_builder.build_interior()



house_builder = IglooHouseBuilder()
engineer = CivilEngineer(house_builder)
engineer.construct_house()
house = engineer.get_house()
print("Builder constructed: {}".format(str(house)))