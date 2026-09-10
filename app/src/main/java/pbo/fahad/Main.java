package pbo.fahad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Printable {
    String getDeviceDetail();
}

interface Connectable {
    String connect();
}

interface Switchable {
    String switching();
}

interface Lockable {
    String lock();
}


enum Koneksi {
    WIFI,
    BLUETOOTH
}

class InputUtils {
    private static final Scanner scanner = new Scanner(System.in);

    private InputUtils() {} 
    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public static int getInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(scanner.nextLine().trim());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Input harus angka");
            }
        }
    }

abstract class SmartDevice implements Printable{
    private final int id;
    private final String nama;
    private final String status;
    private final int daya;
    private final String channel;
    private final int volume;
    private final String turnOn;
    private final String turnOf;
    private final String connect;
    private final String disconnect;



    public SmartDevice(int id, String nama, int daya , String status, String channel, int volume, String turnOn, String turnOf, String connect, String disconnect){
        this.id = id;
        this.nama = nama;
        this.daya = daya;
        this.status = status;
        this.channel = channel;
        this.volume = volume;
        this.turnOn = turnOn;
        this.turnOf = turnOf;
        this.connect = connect;
        this.disconnect = disconnect;
    }


        public int getId(){
            return id;
        }
        public String getNama(){
            return nama;
        }
       public int getDaya(){
            return daya;
        }
        public String getStatus(){
            return status;
        }
        public String getChannel(){
            return channel;
        }
        public int getVolume(){
            return volume;
        }
        public String getTurnOn(){
            return turnOn;
        }
        public String getTurnOf(){
            return turnOf;
        }
        public String getConnect(){
            return connect;
        }
        public String getDisconnect(){
            return disconnect;
        }


        @Override
        public abstract String getDeviceDetail();
        

    }

    class SmartTV extends SmartDevice {
    public SmartTV(int id, String nama, String status, int daya,String channel,int volume,String turnOn,String turnOf,String connect, String disconnect ) {
        super(id,nama,daya,status,channel,volume, turnOn, turnOf, connect , disconnect);
    }

    @Override
    public String getPrintDetail() {
        return String.format("Id %s, nama %s daya %s status %s channel %s volume %s",
                getId(), getNama(), getDaya(), getStatus(), getChannel(), getVolume(), getTurnOn(), getTurnOf(), getConnect(), getDisconnect());
    } 
}

class SmartSpeaker extends SmartDevice {
    public SmartSpeaker(int id, String nama, String status, int volume, int daya, String turnOn,String turnOf,String connect, String disconnect ) {
        super(id,nama,status,volume, daya, turnOn, turnOf, connect , disconnect);
    }

    @Override
    public String getPrintDetail() {
        return String.format("Id %s, nama %s daya %s status %s volume %s",
                getId(), getNama(), getDaya(), getStatus(),getVolume(), getTurnOn(), getTurnOf(), getConnect(), getDisconnect());
    } 
}

 class SmartDoorLock extends SmartDevice {
    private final int pin;

    public SmartDoorLock(int id, String nama, int daya) {
        super(id,nama,daya);
    }

    @Override
    public String getPrintDetail() {
        return String.format("Id %s, nama %s daya %s ",
                getId(), getNama(), getDaya());
    } 
}   

public class Main {
    private static final List<SmartDevice> daftarDevice = new ArrayList<>();

    public static void main(String[] args) {

            int pilihan = InputUtils.getInt("Pilih opsi (1-3): ");

            
    private static void tambah() {
        System.out.println("1. SmartTv");
        System.out.println("2. SmartSpeaker");
        System.out.println("3. SmartDoorLock");

        int pilih = InputUtils.getInt("Pilih (1-3): ");

        switch (pilih) {
            case 1:
                int id = InputUtils.getInt("Id: ");
                String nama = InputUtils.getString("nama: ");
                int daya = InputUtils.getInt("daya: ");
                String channel = InputUtils.getString("channel: ");
                int volume = InputUtils.getInt("volume: ");
                String turnOn = InputUtils.getString("turnOn: ");
                String turnOf = InputUtils.getString("turnOf: ");
                String connect = InputUtils.getString("connect: ");
                String disconnect = InputUtils.getString("disconnect: ");

                SmartDevice.add(new SmartTV(id,nama,daya,channel,volume,turnOn,turnOf,connect,disconnect));
                System.out.println("SmartTV berhasil ditambahkan");
                break;

            case 2:
                SmartDevice.add(new SmartSpeaker(id,nama,daya,volume,turnOn,turnOf,connect,disconnect));
                System.out.println("SmartSpeaker berhasil ditambahkan");
                break;

            case 3:
               SmartDevice.add(new SmartDoorLock());
                System.out.println("SmartDoorLock berhasil ditambahkan");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
}

   

    




