package je_HW_3.Exersise_2;

public class GoodPupil extends Pupil {
    @Override
    void study () {
        System.out.println("Pupil good study");
    }

    @Override
    void read (){
        System.out.println("Pupil good read");
    }

    @Override
    void write (){
        System.out.println("Pupil good write");
    }

    @Override
    void relax (){
        System.out.println("Pupil good relax");
    }

}