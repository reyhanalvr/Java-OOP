import interfaces.Phone;

public class Xiaomi implements Phone{
    private int volume;
    private boolean isPowerOn;

    public Xiaomi(){
        this.volume = 50;
    }

        public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala");
        System.out.println("Selamat datang di Xiaomi");
    }


    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone mati");
        System.out.println("Sampai jumpa di lain waktu!!!!");
    }

    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME ){
                System.out.println("Volume maksimal");
                System.out.println("Volume saat ini " + this.volume + "%");
            }else{
                System.out.println("Volume ditambahkan");
                this.volume += 10;
                System.out.println("Volume saat ini " + this.volume + "%");
            }
        }else{
            System.out.println("Handphone sedang mati, silahkan dinyalakan!!!");
        }
    }

    public void volumeDown(){
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("HP dalam Mode Silent");
                System.out.println("Volume saat ini " + this.volume + "%");
            }else{
                System.out.println("Volume dikurangi");
                this.volume -= 10;
                System.out.println("Volume saat ini " + this.volume + "%");
            }
        }else{
            System.out.println("Handphone sedang mati, silahkan dinyalakan!!!");
        }
    }
}
