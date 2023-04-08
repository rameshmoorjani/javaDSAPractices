import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ParkingSystem {
   // final private Map<CarType,CarSlot>  carSlots;
   // final private Map<CarType, CarSlot> carSlots;
    ParkingSystem(int small,int medium, int big)
    {


    }
















//    final private Map<CarType, CarSlot> carSlots;
//
//
//    public ParkingSystem(int big, int medium, int small) {
//        carSlots = new HashMap<>();
//        carSlots.put(CarType.BIG, new CarSlot(big));
//        carSlots.put(CarType.MEDIUM, new CarSlot(medium));
//        carSlots.put(CarType.SMALL, new CarSlot(small));
//    }
//
//    public boolean addCar(int carType) {
//        CarSlot carSlot = carSlots.getOrDefault(CarType.fromInt(carType), null);
//        if (Objects.isNull(carSlot)) {
//            return false;
//        }
//
//        return carSlot.addCar();
//    }

    /*private enum CarType {
        BIG,
        MEDIUM,
        SMALL;

        public static CarType fromInt(int carType) {
            switch (carType) {
                case 1:
                    return BIG;
                case 2:
                    return MEDIUM;
                case 3:
                    return SMALL;
                default:
                    throw new RuntimeException();
            }
        }
    }*/

    private enum CarType{
        SMALL,
        MEDIUM,
        BIG;
        public CarType converInt(int carType){
            switch (carType)
            {
                case 1 : return CarType.SMALL;
                default: throw new RuntimeException();

            }

        }

    }



    private static class CarSlot {
        private int availablePlaces;

        CarSlot(int places) {
            this.availablePlaces = places;
        }

        public boolean addCar() {
            if (availablePlaces <= 0) {
                return false;
            }

            availablePlaces--;
            return true;
        }
    }



























}