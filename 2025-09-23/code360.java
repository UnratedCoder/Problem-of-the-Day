public class code360 {

	// Problem of the Day (Easy)
	class Car {
		public int priceOfCar;
		public int maintenanceCostPerMonth;
		public int numberOfkilometerCarRunInOneLiter;
		public int pricePerLiter;
		public int numberOfKilometerCarRunInaMonth;

		Car(int priceOfCar, int maintenanceCostPerMonth, int numberOfkilometerCarRunInOneLiter,
				int pricePerLiter, int numberOfKilometerCarRunInaMonth) {

			this.priceOfCar = priceOfCar;
			this.maintenanceCostPerMonth = maintenanceCostPerMonth;
			this.numberOfkilometerCarRunInOneLiter = numberOfkilometerCarRunInOneLiter;
			this.numberOfKilometerCarRunInaMonth = numberOfKilometerCarRunInaMonth;
			this.pricePerLiter = pricePerLiter;

		}
	}

	public static int mostCostEfficientCar(Car petrolCar, Car dieselCar) {
		// Write your code here.
		long petrolMentenanceCost = (long) petrolCar.maintenanceCostPerMonth * 6;
		long petrolFuelLiters = ((long) petrolCar.numberOfKilometerCarRunInaMonth * 6);
		long petrolFuelCost = (petrolFuelLiters * petrolCar.pricePerLiter)
				/ petrolCar.numberOfkilometerCarRunInOneLiter;
		long totalPetrolCost = (long) petrolCar.priceOfCar + petrolMentenanceCost + petrolFuelCost;

		long dieselMentenanceCost = (long) dieselCar.maintenanceCostPerMonth * 6;
		long dieselFuelLiters = ((long) dieselCar.numberOfKilometerCarRunInaMonth * 6);
		long dieselFuelCost = (dieselFuelLiters * dieselCar.pricePerLiter)
				/ dieselCar.numberOfkilometerCarRunInOneLiter;
		long totaldieselCost = (long) dieselCar.priceOfCar + dieselMentenanceCost + dieselFuelCost;
		if (totalPetrolCost < totaldieselCost) {
			return 0;
		} else if (totaldieselCost < totalPetrolCost) {
			return 1;
		} else {
			return -1;
		}
	}
}