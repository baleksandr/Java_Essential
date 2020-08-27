package je_HW_3.Exersise_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int proKey = 1112;
        int expKey = 2111;
        int inputKey = -1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input key: ");
        inputKey = Integer.parseInt(br.readLine());

        if (inputKey == proKey) {
            System.out.println("You have a Pro Access");

            DocumentWorker documentPro = new ProDocumentWorker();
            documentPro.editDocument();
            documentPro.saveDocument();
            documentPro.openDocument();
         }else if (inputKey == expKey) {
            System.out.println("You have a Pro Expert Access");
            DocumentWorker documentExp = new ExpertDocumentWorker();
            documentExp.saveDocument();
            documentExp.editDocument();
            documentExp.openDocument();
        } else {
            DocumentWorker doc = new DocumentWorker();
            doc.openDocument();
            doc.editDocument();
            doc.saveDocument();
            System.out.println("You have a free version");
        }
    }
}
