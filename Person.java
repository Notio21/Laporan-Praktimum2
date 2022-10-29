public class Person {
    String nama, jeniskelamin;
    int umur;

    public static void main(String[] args) {
        Person person = new Person();

        person.nama = "Notio Pinando Pratama";
        person.jeniskelamin = "Laki laki";
        person.umur = 25;

        System.out.println("Nama: " + person.nama);
        System.out.println("Jeniskelamin: " + person.jeniskelamin);
        System.out.println("Umur: " + person.umur);

    }
}