import GUI.*;
import Operacje.*;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        ProgramWindow programWindow = new ProgramWindow();
        GetFirstTextRow getFirstTextRow = new GetFirstTextRow();
        getFirstTextRow.update(programWindow,"");

    }
}
