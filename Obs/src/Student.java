public class Student {
    Course c1 ;
    Course c2 ;
    Course c3 ;
    String name ;
    String studentNo;
    String classes;
    double average ;
    boolean isPass ;


    Student(String name ,String studentNo,String classes,Course c1,Course c2, Course c3){
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes ;
        this.c1 = c1 ;
        this.c2 = c2 ;
        this.c3 = c3 ;
        this.average = 0.0;
        this.isPass = false ;
    }

    void addBulkExamNote(int note1 , int note2,int note3){
        if (note1 >= 0 && note1 <=100){
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <=100) {
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <=100) {
            this.c3.note = note3;
        }
    }

    void addBulkVerbal(int verbal1 ,int verbal2 ,int verbal3){
        if (verbal1 >= 0 && verbal1 <=100){
            this.c1.verbal = verbal1;
        }

        if (verbal2 >= 0 && verbal2 <=100) {
            this.c2.verbal = verbal2;
        }

        if (verbal3 >= 0 && verbal3 <=100) {
            this.c3.verbal = verbal3;
        }

    }



    void isPass(){
        this.average = ((this.c1.note * 0.80 + this.c1.verbal * 0.20) +
                (this.c2.note * 0.80 + this.c2.verbal * 0.20) +
                (this.c3.note * 0.80 + this.c3.verbal * 0.20)) / 3.0;
        if (this.average < 55){
            System.out.println("*-----------------------------*");
            System.out.println(":( Sınıfı Geçemedi :(");
            this.isPass = true;
        }
        else {
            System.out.println("*-----------------------------*");
            System.out.println("!! Sınıfı Geçti !!");
            this.isPass = false;
        }

        printNot();
    }

    void printNot(){

        System.out.println("Adı\t: " +this.name);
        System.out.println(this.c1.name + " Notu\t:"+c1.note);
        System.out.println(this.c2.name + " Notu\t:"+c2.note);
        System.out.println(this.c3.name + " Notu\t:"+c3.note);
        System.out.println("Ortalama \t:"+this.average);
        System.out.println("*-----------------------------*");

    }


}
