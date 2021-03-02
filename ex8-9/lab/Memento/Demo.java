import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        
        boolean start = true;
        String input;
        int saveFiles = 0, currentArticle = 0;

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();


        while (start) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" SELECT: ( RED : 1 )  (GREEN : 2 ) ( BLUE : 3 )  \n ( STOP : 0 )  ( UNDO U ) (REDO R)");
            input = sc.nextLine();


            switch (input) {
                case "1":
                    originator.set("RED");
                    caretaker.addMemento(originator.storeInMemento());
                    saveFiles++;
                    currentArticle++;
                    break;
                
                case "2":
                    originator.set("GREEN");
                    caretaker.addMemento(originator.storeInMemento());
                    saveFiles++;
                    currentArticle++;
                    break;

                case "3":
                    originator.set("BLUE");
                    caretaker.addMemento(originator.storeInMemento());
                    saveFiles++;
                    currentArticle++;
                    break;
                
                case "u":
                    if (currentArticle >= 1) {
                        currentArticle--;
                        originator.restoreFromMemento(caretaker.getMemento(currentArticle));
                    }
                    break;

                case "r":
                    if ((saveFiles - 1) > currentArticle) {
                        currentArticle++;
                        originator.restoreFromMemento(caretaker.getMemento(currentArticle));
                    }
                    break;
                case "0":
                    System.out.println("STOP");
                    start = false;
                    break;

            }
        
        }
    }
}