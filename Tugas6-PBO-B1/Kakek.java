public class Kakek{
    protected String namekakek;
    protected String address;
    public kakek(){
        System.out.println(�\n Program Demo Inheritance�);
        System.out.println(�============================�);
        System.out.println(�Masukan construktor kakek�);
        System.out.println(��Dijalankan oleh class Bapak��);
        namekakek=�Doni wijaya�;
        address=�Merauke�;
    }
    public kakek(String name,String address){
        this.namekakek=namekakek;
        this.address=address;
    }    
    public String getName(){
        return namekakek;
    }
    public String getAddress(){
        return address;
    }
}