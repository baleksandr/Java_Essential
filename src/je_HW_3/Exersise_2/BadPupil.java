package je_HW_3.Exersise_2;

public class BadPupil extends Pupil {

    @Override
    void study () {
        System.out.println("Pupil Bad study");
    }

    @Override
    void read (){
        System.out.println("Pupil Bad read");
    }

    @Override
    void write (){
        System.out.println("Pupil Bad write");
    }

    @Override
    void relax (){
        System.out.println("Pupil Bad relax");
    }
}
