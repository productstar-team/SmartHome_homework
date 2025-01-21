public class SmartThermostat extends SmartDevice implements Controllable {
    private int temperature;

    public SmartThermostat(String name, RoomType room) {
        super(name, room);
        this.temperature = 22;
    }

    @Override
    public void increaseValue() {
        temperature++;
        System.out.println(name + ": температура увеличена до " + temperature);
    }

    @Override
    public void decreaseValue() {
        temperature--;
        System.out.println(name + ": температура уменьшена до " + temperature);
    }

    @Override
    public String getStatus() {
        return name + " в " + room + (isOn ? " включено" : " выключено") + ", температура: " + temperature;
    }
}

