public class Main {
    static class SinhVien {
        String id;
        String name;

        public SinhVien(String id, String name){
            this.id = id;
            this.name = name;
        } 

        public String getId(){
            return id;
        }

        public String getName(){
            return name;
        }
    }

    public static void main(String[] args){
        SinhVien sinhVien001 = new SinhVien("DCVT009", "Nguyen Nam");
        System.out.println(sinhVien001.getId()+" "+sinhVien001.getName());
    }
}