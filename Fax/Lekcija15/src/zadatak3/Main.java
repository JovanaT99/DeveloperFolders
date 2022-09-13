package zadatak3;

public class Main {

    public static void main(String[] args) {


        Slot<String, String> slot = new Slot<>();
        slot.setKljuc("-----------");
        slot.setVrednost("Vr");
        System.out.println(slot.getKljuc() + "-" + slot.getVrednost());


        Slot<Integer, String> slot1 = new Slot<>();
        slot1.setVrednost("Joki");
        slot1.setKljuc(1);
        System.out.println(slot1.getKljuc() + "-" + slot1.getVrednost());


        System.out.println(Slot.getBrojSlotova());
    }
}
