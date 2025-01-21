public class SmartTV extends SmartDevice implements Controllable {
    private int volume;

    public SmartTV(String name, RoomType room) {
        super(name, room);
        this.volume = 20;
    }

    @Override
    public void increaseValue() {
        if (volume < 100) {
            volume += 5;
            System.out.println(name + ": громкость увеличена до " + volume);
        }
    }

    @Override
    public void decreaseValue() {
        if (volume > 0) {
            volume -= 5;
            System.out.println(name + ": громкость уменьшена до " + volume);
        }
    }

    @Override
    public String getStatus() {
        return name + " в " + room + (isOn ? " включено" : " выключено") + ", громкость: " + volume;
    }
}