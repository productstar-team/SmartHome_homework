import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    private List<SmartDevice> devices;

    public SmartHome() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnOnAllDevices() {
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnOffAllDevices() {
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public void getStatusOfAllDevices() {
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }

    public static class HomeStats {
        private static int totalDevices = 0;
        private static int activeDevices = 0;

        public static void incrementTotalDevices() {
            totalDevices++;
        }

        public static void incrementActiveDevices() {
            activeDevices++;
        }

        public static void decrementActiveDevices() {
            activeDevices--;
        }

        public static String getStats() {
            return "Всего устройств: " + totalDevices + ", Активных устройств: " + activeDevices;
        }
    }
}