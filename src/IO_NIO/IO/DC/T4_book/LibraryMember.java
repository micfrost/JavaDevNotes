package IO_NIO.IO.DC.T4_book;

import java.util.ArrayList;

public class LibraryMember {

    private ArrayList<Person> members;
    public LibraryMember(){
        members = new ArrayList<>();
    }

    void addMember(Person person) {
        members.add(person);
    }

}
