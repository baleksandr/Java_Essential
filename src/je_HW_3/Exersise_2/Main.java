package je_HW_3.Exersise_2;

public class Main {
    public static void main(String[] args) {
        BadPupil badPupil = new BadPupil();
        GoodPupil goodPupil = new GoodPupil();
        ExcelentPupil excelentPupil = new ExcelentPupil();

        ClassRoom classRoom = new ClassRoom(goodPupil, badPupil, excelentPupil);


        classRoom.pupil1.study();
        classRoom.pupil1.read();
        classRoom.pupil1.relax();
        classRoom.pupil1.write();
    }
}
