public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartHome home = new SmartHome();

        SmartLight livingRoomLight = new SmartLight("Гостиная свет", RoomType.LIVING_ROOM);
        SmartThermostat bedroomThermostat = new SmartThermostat("Спальня термостат", RoomType.BEDROOM);
        SmartTV kitchenTV = new SmartTV("Кухня ТВ", RoomType.KITCHEN);

        home.addDevice(livingRoomLight);
        home.addDevice(bedroomThermostat);
        home.addDevice(kitchenTV);

        SmartHome.HomeStats.incrementTotalDevices();
        SmartHome.HomeStats.incrementTotalDevices();
        SmartHome.HomeStats.incrementTotalDevices();

        System.out.println("Начальное состояние:");
        home.getStatusOfAllDevices();

        System.out.println("\nВключаем все устройства:");
        home.turnOnAllDevices();
        SmartHome.HomeStats.incrementActiveDevices();
        SmartHome.HomeStats.incrementActiveDevices();
        SmartHome.HomeStats.incrementActiveDevices();

        System.out.println("\nИзменяем настройки устройств:");
        livingRoomLight.increaseValue();
        bedroomThermostat.decreaseValue();
        kitchenTV.increaseValue();

        System.out.println("\nТекущее состояние:");
        home.getStatusOfAllDevices();

        System.out.println("\nВыключаем все устройства:");
        home.turnOffAllDevices();
        SmartHome.HomeStats.decrementActiveDevices();
        SmartHome.HomeStats.decrementActiveDevices();
        SmartHome.HomeStats.decrementActiveDevices();

        System.out.println("\nСтатистика умного дома:");
        System.out.println(SmartHome.HomeStats.getStats());
    }
}