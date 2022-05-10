package ClassObekt;

public class Student {

    int NomStuden;
    String Name;
    String SeName;
    int GodObucheniy;
    double SrednyaMatematika;
    double SrednyaEkonomika;
    double SrednyaInostranniy;

    double Srednaybal(double srednyaMatematika, double srednyaEkonomika, double srednyaInostranniy) {
        double Srednaybal = (srednyaMatematika + srednyaEkonomika + srednyaInostranniy)/3;
        return Srednaybal;
    }


    void studentInfo() {
        System.out.println("Общий средний балл - " + Name + " " + SeName + " = " + Srednaybal(SrednyaMatematika, SrednyaEkonomika,SrednyaInostranniy));
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.NomStuden = 1234;
        s1.Name = "Sergey";
        s1.SeName = "Petrov";
        s1.GodObucheniy = 1996;
        s1.SrednyaMatematika = 19.27;
        s1.SrednyaEkonomika = 34.69;
        s1.SrednyaInostranniy = 39.75;
        s1.Srednaybal(s1.SrednyaMatematika, s1.SrednyaEkonomika, s1.SrednyaInostranniy);
        s1.studentInfo();

        s2.NomStuden = 4321;
        s2.Name = "Ivan";
        s2.SeName = "Ivanov";
        s2.GodObucheniy = 2000;
        s2.SrednyaMatematika = 12.91;
        s2.SrednyaEkonomika = 56.64;
        s2.SrednyaInostranniy = 49.75;
        s2.Srednaybal(s2.SrednyaMatematika, s2.SrednyaEkonomika, s2.SrednyaInostranniy);
        s2.studentInfo();

        s3.NomStuden = 9376;
        s3.Name = "Andrey";
        s3.SeName = "Sidorov";
        s3.GodObucheniy = 2018;
        s3.SrednyaMatematika = 57.27;
        s3.SrednyaEkonomika = 89.25;
        s3.SrednyaInostranniy = 40.28;
        s3.Srednaybal(s3.SrednyaMatematika, s3.SrednyaEkonomika, s3.SrednyaInostranniy);
        s3.studentInfo();

        /*System.out.println("Общий средний балл - " + s1.Name + " " + s1.SeName + " = "
                + (s1.SrednyaMatematika + s1.SrednyaEkonomika + s1.SrednyaInostranniy) / 3);
        System.out.println("Общий средний балл - "  + s2.Name + " " + s2.SeName + " = "
                + (s2.SrednyaMatematika + s2.SrednyaEkonomika + s2.SrednyaInostranniy) / 3);
        System.out.println("Общий средний балл - "  + s3.Name + " " + s3.SeName + " = "
                +  (s3.SrednyaMatematika + s3.SrednyaEkonomika + s3.SrednyaInostranniy) / 3);
         */





    }

}


