public class SmartLight extends SmartDevice implements Controllable {
    private int brightness;

    public SmartLight(String name, RoomType room) {
        super(name, room);
        this.brightness = 50;
    }

    @Override
    public void increaseValue() {
        if (brightness < 100) {
            brightness += 10;
            System.out.println(name + ": яркость увеличена до " + brightness);
        }
    }

    @Override
    public void decreaseValue() {
        if (brightness > 0) {
            brightness -= 10;
            System.out.println(name + ": яркость уменьшена до " + brightness);
        }
    }

    @Override
    public String getStatus() {
        return name + " в " + room + (isOn ? " включено" : " выключено") + ", яркость: " + brightness;
    }
}