public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Mahmut","TRH","000");
        Teacher teacher2 = new Teacher("Cihan Hoca","FZK","001");
        Teacher teacher3 = new Teacher("Nursel Hoca","MAT","002");


        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(teacher1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(teacher2);

        Course matematik = new Course("Matematik","103","MAT");
        matematik.addTeacher(teacher3);


        Student student1 = new Student("Ahmet","1","2",tarih,fizik,matematik);
        student1.addBulkExamNote(21,45,63);
        student1.addBulkVerbal(12,78,85);
        student1.isPass();


        Student student2 = new Student("Mehmet","2","2",tarih,fizik,matematik);
        student2.addBulkExamNote(75,48,93);
        student2.addBulkVerbal(45,81,72);
        student2.isPass();

        Student student3 = new Student("Cevhet","3","2",tarih,fizik,matematik);
        student3.addBulkExamNote(82,83,92);
        student3.addBulkVerbal(58,78,97);
        student3.isPass();



    }
}
